package SET2.SQ1;

import java.util.Scanner;

public class EmployeeTaxCalculate {
    /**
     * Write a program that:
     * • asks the user for the number of records, N
     * • uses one array of Strings of length N to store employee names,
     * an array of doubles of length N to store the hourly wage,
     * and an array of doubles to store the number of hours worked.
     * • reads a list of N employee names, hourly wages, and hours worked,
     * stores them in the corresponding arrays
     * • calculates the gross wages for each employee as the product of hourly wages and hours worked
     * • calculates the tax for each employee as 10% of the gross wages
     * • calculates net wages as gross wages minus tax
     * • keeps track of total gross wages, total taxes, and total net wages
     * • prints all N employee names, gross wages, tax, and net wages in a table
     * • At the end, prints total gross wages, total taxes, and total net wages
     */

    //Input : the number of records, a list of N employee names, hourly wages, and hours worked

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("---------------------------");
        System.out.println("How many records for employees : ");
        int N = scanner.nextInt();

        String[] names = new String[N];
        double[] hourly_wages = new double[N];
        double[] workHours = new double[N];

        //store names, wages, and workhours
        for(int i = 0; i < N; i++){
            System.out.println("Enter the "+ i +" employee name:  ");
            names[i] = scanner.next();
            System.out.println("Enter the hourly wages for "+ names[i]+": ");
            hourly_wages[i] = scanner.nextDouble();
            System.out.println("Enter the work hours for "+ names[i]+": ");
            workHours[i] = scanner.nextDouble();
        }

        //* • calculates the gross wages for each employee as the product of hourly wages and hours worked
        //     * • calculates the tax for each employee as 10% of the gross wages
        //     * • calculates net wages as gross wages minus tax

        double grossWages = 0;
        double tax = 0;
        double totalgrosswages = 0;
        double totalTax = 0;
        double totalNetWages = 0;
        System.out.printf("%-15s %-15s %-15s %-15s\n","Employee Name","Gross Wages","Tax","Net Wages");
        for(int j = 0; j< N; j++){
            grossWages = hourly_wages[j]*workHours[j];
            totalgrosswages = grossWages + totalgrosswages;

            tax = 0.10 * grossWages;
            totalTax = tax + totalTax;
            totalNetWages = totalgrosswages - totalTax;
            System.out.printf("%-15s %-15.2f %-15.2f %-15.2f\n",names[j],grossWages,tax,grossWages-tax);

        }
        System.out.println("-----------------------------------------------");
        System.out.printf("%-15s %-15s %-15s\n","Total Gross Wages","total taxes","total net wages");
        System.out.printf("%-15.2f %-15.2f %-15.2f\n",totalgrosswages,totalTax,totalNetWages);

        scanner.close();

    }

}
