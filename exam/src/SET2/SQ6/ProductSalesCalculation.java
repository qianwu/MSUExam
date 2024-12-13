package SET2.SQ6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductSalesCalculation {

    private static class Product{
        String name;
        double purchasePrice;
        int purchaseNumber;
        double sellPrice;
        int sellNumber;

        public Product(){}

        public Product(String name, double purchasePrice, int purchaseNumber, double sellPrice, int sellNumber) {
            this.name = name;
            this.purchasePrice = purchasePrice;
            this.purchaseNumber = purchaseNumber;
            this.sellPrice = sellPrice;
            this.sellNumber = sellNumber;
        }

        public double getTotalPurchaseCost(){
            double totalPurchaseCost = purchasePrice * purchaseNumber;
            return totalPurchaseCost;
        }

        public double getTotalSellPrice(){
            double totalSellPrice = sellPrice * sellNumber;
            return totalSellPrice;
        }

        public double getProfitPercentage(){
            double profitPercentage = (getTotalSellPrice()-getTotalPurchaseCost())/getTotalPurchaseCost()*100;
            return profitPercentage;
        }

        public String getProfitIndicator(){
            String profitIndicator;
            if(getProfitPercentage()>0){
                profitIndicator = "PROFIT";
            }else if(getProfitPercentage()==0){
                profitIndicator = "BREAK-EVEN";
            }else {
                profitIndicator = "LOSS";
            }
            return profitIndicator;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPurchasePrice() {
            return purchasePrice;
        }

        public void setPurchasePrice(double purchasePrice) {
            this.purchasePrice = purchasePrice;
        }

        public int getPurchaseNumber() {
            return purchaseNumber;
        }

        public void setPurchaseNumber(int purchaseNumber) {
            this.purchaseNumber = purchaseNumber;
        }

        public double getSellPrice() {
            return sellPrice;
        }

        public void setSellPrice(double sellPrice) {
            this.sellPrice = sellPrice;
        }

        public int getSellNumber() {
            return sellNumber;
        }

        public void setSellNumber(int sellNumber) {
            this.sellNumber = sellNumber;
        }
    }


    public static void main(String[] args){
        //Input Parts
        Scanner scanner =new Scanner(System.in);
        System.out.println("How many products :");
        int N = scanner.nextInt();
        scanner.nextLine();

        double sumProfitPercentage = 0;
        double sumPurchaseCost = 0;
        double sumSellPrice = 0;
        String totalProfitIndiator;

        List<Product> products = new ArrayList<>();
        for(int i = 0; i< N; i++){
            Product product = new Product();
            System.out.println("Enter the name of the product "+ (i+1));
            String name = scanner.nextLine();
            System.out.println("Enter the purchase number of the product "+ name);
            int purchaseNumber = scanner.nextInt();
            System.out.println("Enter the purchase cost of the product "+ name);
            double purchaseCost = scanner.nextDouble();
            System.out.println("Enter the sell number of the product "+ name);
            int sellNumber = scanner.nextInt();
            System.out.println("Enter the sell price of the product "+ name);
            double sellPrice = scanner.nextDouble();
            scanner.nextLine();




            product.setName(name);
            product.setPurchaseNumber(purchaseNumber);
            product.setPurchasePrice(purchaseCost);
            product.setSellNumber(sellNumber);
            product.setSellPrice(sellPrice);

            sumPurchaseCost += product.getTotalPurchaseCost();
            sumSellPrice += product.getTotalSellPrice();

            products.add(product);
        }

        //sort the products
        for(int i = 0; i< products.size()-1; i++){
            for(int j = 0; j < products.size()-1-i; j++){
                if (products.get(j).getProfitPercentage()< products.get(j+1).getProfitPercentage()){
                    Product tem = products.get(j);
                    products.set(j,products.get(j+1));
                    products.set(j+1, tem);
                }
            }
        }

        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","Product Name","Purchase Number", "Purchase Cost","Sell Number","Sell Price","TotalPurchaseCost","TotalSales","Percentage","Indicator");

        for(Product product1 : products){
            System.out.printf("%-15s %-15d %-15.2f %-15d %-15.2f %-15.2f %-15s %-15s %-15s\n",product1.name, product1.purchaseNumber,product1.purchasePrice,product1.sellNumber,product1.sellPrice,product1.getTotalPurchaseCost(),product1.getTotalSellPrice(),String.format("%.2f",product1.getProfitPercentage())+"%",product1.getProfitIndicator());

        }


        sumProfitPercentage = (sumSellPrice - sumPurchaseCost)/sumPurchaseCost * 100;
        if(sumProfitPercentage > 0){
            totalProfitIndiator = "PROFIT";
        }else if(sumProfitPercentage == 0){
            totalProfitIndiator = "BREAK-EVEN";
        }else{
            totalProfitIndiator = "LOSS";
        }
        System.out.println("the net purchase cost :"+sumPurchaseCost);
        System.out.println("the net sales :"+ sumSellPrice);
        System.out.println("the net profit/loss percentage :"+ sumProfitPercentage+"%");
        System.out.printf("%d %.2f","the overall profit indicator :" ,totalProfitIndiator);

    }
}
