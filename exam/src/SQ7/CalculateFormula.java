package SQ7;

import java.util.Scanner;


/**
 * Write a program that prints the values for the formula a2x - ax + 1
 * for a given input a and x ranging from 1 to a by an increment of 1.
 */

public class CalculateFormula {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the value of 'a'
        System.out.print("Enter the value for a: ");
        int a = scanner.nextInt();

        // Header for the output
        System.out.println("----------------------------");
        System.out.printf("%-5s %-10s\n", "x", "Result");
        System.out.println("----------------------------");

        // Loop through x from 1 to a
        for (int x = 1; x <= a; x++) {
            // Calculate the formula: a^2 * x - a * x + 1
            int result = (a * a * x) - (a * x) + 1;

            // Print the result for each x
            System.out.printf("%-5d %-10d\n", x, result);
        }

        scanner.close();
    }
}
