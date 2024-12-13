package SET2.SQ5;

import java.util.Scanner;

public class SalariesCalculation {
    /**
     * Write a program to calculate the employee’s salaries based on their yearly performance.
     * The program should:
     * • Read the number of employees N;
     * • Use a few arrays of length N to store employee names,their current salaries,
     * and their ratings obtained for each quarter - Q1, Q2, Q3, and Q4(ratings ranging from 1-10);
     * • Read a list of N employee names, current salaries,
     * and quarterly ratings, and store them in the corresponding arrays;
     * • Calculate the overall (i.e., average) rating for each employee for the year (total rating/4);
     * • Calculate the expected salary for the next year based on the overall performance;
     * • increase in salary next year = current salary *(overall rating/100)
     * • Expected salary = current salary + amount increased
     * • Keep track of the employee’s performance based on the three conditions:
     * o If the employee’s overall rating is greater than or equal to 7 then the performance is tagged “BEST”.
     * o If the employee’s overall rating is greater than or equal to 5 and less than 7
     * then the performance is tagged “AVERAGE”.
     * o If the employee’s overall rating is less than 5 then the performance is tagged “ON-TRACK”.
     * • Sort the records based on the overall rating in descending order,
     * starting with the best performance to the ontrack performance; and,
     * Print all the employee names, the ratings obtained from Q1 through Q4,
     * the overall ratings, and the performance indicators in a tabular format.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of employees
        System.out.print("Enter the number of employees: ");
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Initialize arrays for employee names, salaries, and quarterly ratings
        String[] employeeName = new String[N];
        double[] currentSalaries = new double[N];
        double[] ratingQ1 = new double[N];
        double[] ratingQ2 = new double[N];
        double[] ratingQ3 = new double[N];
        double[] ratingQ4 = new double[N];
        double[] overallRatings = new double[N];
        double[] expectedSalaries = new double[N];
        String[] performances = new String[N];

        // Input employee data
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the name of employee " + (i + 1) + ": ");
            employeeName[i] = scanner.nextLine();

            System.out.print("Enter the current salary of " + employeeName[i] + ": ");
            currentSalaries[i] = scanner.nextDouble();

            System.out.print("Enter the rating for Q1: ");
            ratingQ1[i] = scanner.nextDouble();
            System.out.print("Enter the rating for Q2: ");
            ratingQ2[i] = scanner.nextDouble();
            System.out.print("Enter the rating for Q3: ");
            ratingQ3[i] = scanner.nextDouble();
            System.out.print("Enter the rating for Q4: ");
            ratingQ4[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character

            // Calculate overall rating (average of the four quarters)
            overallRatings[i] = (ratingQ1[i] + ratingQ2[i] + ratingQ3[i] + ratingQ4[i]) / 4;

            // Calculate expected salary (current salary + increase based on overall rating)
            expectedSalaries[i] = currentSalaries[i] + (currentSalaries[i] * (overallRatings[i] / 100));

            // Determine performance
            if (overallRatings[i] >= 7) {
                performances[i] = "BEST";
            } else if (overallRatings[i] >= 5) {
                performances[i] = "AVERAGE";
            } else {
                performances[i] = "ON-TRACK";
            }
        }

        // Sort the employees based on overall rating in descending order
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (overallRatings[i] < overallRatings[j]) {
                    // Swap ratings
                    double tempRating = overallRatings[i];
                    overallRatings[i] = overallRatings[j];
                    overallRatings[j] = tempRating;

                    // Swap salaries
                    double tempSalary = currentSalaries[i];
                    currentSalaries[i] = currentSalaries[j];
                    currentSalaries[j] = tempSalary;

                    // Swap expected salaries
                    double tempExpectedSalary = expectedSalaries[i];
                    expectedSalaries[i] = expectedSalaries[j];
                    expectedSalaries[j] = tempExpectedSalary;

                    // Swap employee names
                    String tempName = employeeName[i];
                    employeeName[i] = employeeName[j];
                    employeeName[j] = tempName;

                    // Swap performances
                    String tempPerformance = performances[i];
                    performances[i] = performances[j];
                    performances[j] = tempPerformance;

                    // Swap quarterly ratings
                    double tempQ1 = ratingQ1[i];
                    ratingQ1[i] = ratingQ1[j];
                    ratingQ1[j] = tempQ1;

                    double tempQ2 = ratingQ2[i];
                    ratingQ2[i] = ratingQ2[j];
                    ratingQ2[j] = tempQ2;

                    double tempQ3 = ratingQ3[i];
                    ratingQ3[i] = ratingQ3[j];
                    ratingQ3[j] = tempQ3;

                    double tempQ4 = ratingQ4[i];
                    ratingQ4[i] = ratingQ4[j];
                    ratingQ4[j] = tempQ4;
                }
            }
        }

        // Print the header for the table
        System.out.println("----------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n",
                "Employee Name", "Q1 Rating", "Q2 Rating", "Q3 Rating", "Q4 Rating", "Overall Rating", "Expected Salary", "Performance");

        // Print the employee details in sorted order
        for (int i = 0; i < N; i++) {
            System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15.2f %-15s %-15s\n",
                    employeeName[i], ratingQ1[i], ratingQ2[i], ratingQ3[i], ratingQ4[i], overallRatings[i], String.format("%.2f",expectedSalaries[i])+"$", performances[i]);
        }

        scanner.close();
    }
}
