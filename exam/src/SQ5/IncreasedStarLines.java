package SQ5;

import java.util.Scanner;

public class IncreasedStarLines {

    /**
     * Write a program that prints out lines of stars,
     * based on the values determined by the user-input.
     * The program should print the number of stars
     * that increases on each line from the minimum number
     * until it reaches the maximum number and then decreases
     * until it goes back to the minimum number.
     * After printing out the lines of stars,
     * it should also print the total number
     * of stars printed.
     */

    public static void main(String[] args) {
        // Input Section
        System.out.println("----------------------");
        System.out.println("Input Section: ");
        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum number of stars: ");
        int minStars = scanner.nextInt();

        System.out.print("Enter the maximum number of stars: ");
        int maxStars = scanner.nextInt();

        if (minStars > maxStars) {
            System.out.println("Error: Minimum number of stars cannot be greater than the maximum.");
            scanner.close();
            return;
        }

        // Output Section
        System.out.println("----------------------");
        System.out.println("Output Section: ");
        System.out.println("----------------------");

        int totalStars = 0;

        // Increasing part
        for (int stars = minStars; stars <= maxStars; stars++) {
            printStars(maxStars,stars);
            totalStars += stars;
        }

        // Decreasing part
        for (int stars = maxStars - 1; stars >= minStars; stars--) {
            printStars(maxStars,stars);
            totalStars += stars;
        }

        // Print total stars
        System.out.println("----------------------");
        System.out.println("Total stars printed: " + totalStars);
        System.out.println("----------------------");

        scanner.close();
    }

    // Helper method to print stars on one line
    private static void printStars(int maxStars, int currentStars) {
        // Number of spaces to center-align
        int spaces = maxStars - currentStars;
        for (int i = 0; i < spaces; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < currentStars; i++) {
            System.out.print("* ");
        }
        System.out.println(); // Move to the next line
    }
}
