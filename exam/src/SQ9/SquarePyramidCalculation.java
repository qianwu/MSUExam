package SQ9;

import java.util.Scanner;

public class SquarePyramidCalculation {
    /**
     * Write a program to calculate the volume,
     * Lateral Surface Area (LSA), Total Surface Area (TSA),
     * and Slant Height (SH) of a square pyramid having height h
     * being an odd number ranging from 1 to N and side length a,
     * where N and a are inputs provided by the user.
     * Please find out the formulae for volume, LSA, TSA, and SH of a square pyramid.
     * (* Hint: Round off the value of Volume of the square pyramid)
     */

    //analysis : What is the Lateral Surface Area (LSA), Total Surface Area (TSA) and Slant Height (SH)
    //an odd number : 1, 3, 5, 7, 9, 11, 13, etc.
    // formulae : V = 1/3*a²*h; Slant Height (SH)= sqrt((a/2)² + h²); LSA = 2 * a * SH;TSA = a² + LSA

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Maximum height and side length
        System.out.print("Enter the maximum height (N): ");
        int N = scanner.nextInt();
        System.out.print("Enter the side length of the base (a): ");
        double a = scanner.nextDouble();
        // ensure N is an odd number
        if (N < 1 || N % 2 == 0) {
            System.out.println("Error: The maximum height (N) must be an odd number greater than or equal to 1.");
            scanner.close();
            return;
        }

        // Output Header
        System.out.println("---------------------------------------------------------");
        System.out.printf("%-5s %-10s %-10s %-10s %-10s\n", "h", "Volume", "LSA", "TSA", "Slant Height");
        System.out.println("---------------------------------------------------------");

        // Loop through odd heights from 1 to N, the increment of odd number is 2
        for (int h = 1; h <= N; h += 2) {
            // Calculate slant height (SH)
            double slantHeight = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(h, 2));

            // Calculate volume (V)
            double volume = (1.0 / 3.0) * Math.pow(a, 2) * h;

            // Calculate lateral surface area (LSA)
            double lateralSurfaceArea = 2 * a * slantHeight;

            // Calculate total surface area (TSA)
            double totalSurfaceArea = Math.pow(a, 2) + lateralSurfaceArea;

            // Print the results for the current height
            System.out.printf(
                    "%-5d %-10s %-10s %-10s %-10s\n",
                    h,
                    String.format("%d m³",Math.round(volume)),
                    String.format("%.2f m²",lateralSurfaceArea),
                    String.format("%.2f m²",totalSurfaceArea),
                    String.format("%.2f m",slantHeight)
            );
        }

        scanner.close();
    }
}
