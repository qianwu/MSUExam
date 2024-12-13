package SET2.SQ3;

import java.util.Scanner;

public class OrderCalculator {

    /**
     * Write a program that calculates the prices of the orders (apple cider and apple juice).
     * Your program should:
     * • ask for the number of people who ordered
     * • use an array of Strings to store names,
     * an array of integers to store the number of orders of apple cider (each priced at $5.50),
     * and an array of integers to store the number of orders of apple juice (each priced at $4.50)
     * • read a list of names, numbers of apple cider orders, and numbers of apple juice
     * • store them in the corresponding arrays
     * • keep track of the total number of apple cider orders and the total number of apple juice orders
     * • print all the names, the numbers of orders for each kind, the subtotal prices for each kind,
     * and the total price for each person
     * • At the end, it should also print:
     * • the total number of orders for each kind, the subtotal prices of the total orders,
     * and the grand total price
     * • an average number of orders for each kind,
     * an average subtotal price of each kind, and an average price
     * for each person Do not worry about having exactly two decimal points and other fancy formatting.
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Constants for prices
        final double PRICE_CIDER = 5.50;
        final double PRICE_JUICE = 4.50;

        // Input Section
        System.out.print("Enter the number of people who ordered: ");
        int numberOfPeople = scanner.nextInt();

        // Arrays to store data
        String[] names = new String[numberOfPeople];
        int[] appleCiderOrders = new int[numberOfPeople];
        int[] appleJuiceOrders = new int[numberOfPeople];

        // Variables to keep track of totals
        int totalCiderOrders = 0;
        int totalJuiceOrders = 0;
        double totalCiderPrice = 0;
        double totalJuicePrice = 0;
        double grandTotalPrice = 0;

        // Input: Names and orders
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter the number of apple cider orders for " + names[i] + ": ");
            appleCiderOrders[i] = scanner.nextInt();

            System.out.print("Enter the number of apple juice orders for " + names[i] + ": ");
            appleJuiceOrders[i] = scanner.nextInt();

            // Update totals
            totalCiderOrders += appleCiderOrders[i];
            totalJuiceOrders += appleJuiceOrders[i];
        }

        // Output: Individual orders
        System.out.println("\nOrder Summary:");
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "Name", "Cider", "Juice", "Subtotal", "Total");

        for (int i = 0; i < numberOfPeople; i++) {
            // Calculate prices for each person
            double ciderPrice = appleCiderOrders[i] * PRICE_CIDER;
            double juicePrice = appleJuiceOrders[i] * PRICE_JUICE;
            double totalPrice = ciderPrice + juicePrice;

            // Update overall totals
            totalCiderPrice += ciderPrice;
            totalJuicePrice += juicePrice;
            grandTotalPrice += totalPrice;

            // Print person's order summary
            System.out.printf("%-10s %-10d %-10d $%-9.2f $%-9.2f\n",
                    names[i], appleCiderOrders[i], appleJuiceOrders[i], ciderPrice, totalPrice);
        }

        // Output: Totals
        System.out.println("---------------------------------------------------------");
        System.out.printf("Total      %-10d %-10d $%-9.2f $%-9.2f\n",
                totalCiderOrders, totalJuiceOrders, totalCiderPrice, grandTotalPrice);

        // Output: Averages
        System.out.println("---------------------------------------------------------");
        System.out.println("Averages:");
        double averageCiderOrders = totalCiderOrders / (double) numberOfPeople;
        double averageJuiceOrders = totalJuiceOrders / (double) numberOfPeople;
        double averagePricePerPerson = grandTotalPrice / numberOfPeople;

        System.out.printf("Cider Orders: %.2f, Juice Orders: %.2f, Average Price: $%.2f\n",
                averageCiderOrders, averageJuiceOrders, averagePricePerPerson);

        scanner.close();
    }
}
