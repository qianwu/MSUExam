package SQ4;

import java.util.Scanner;

public class CubeAreaVolume {
    /**
     * Write a program to calculate the volume and surface area of a cube
     * having equal faces with equal length, breadth and height, accepting the
     * length of the side ranging from 10 to N in increments of 5,
     * where the value of N is input by the user.
     * Please find out the formulae for the volume and surface area of a cube.
     *
     * //Volume=side³
     * //Surface Area=6⋅side²
     */

    public static void main(String[] args){
        // Input Section
        System.out.println("----------------------");
        System.out.println("Input Section: ");
        System.out.println("----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum length of the cube's side (N): ");
        int N = scanner.nextInt();

        if (N < 10) {
            System.out.println("Error: N must be greater than or equal to 10.");
            scanner.close();
            return;
        }

        // Output Section
        System.out.println("----------------------");
        System.out.println("Output Section: ");
        System.out.println("----------------------");
        System.out.printf("%-10s %-15s %-15s\n", "Side", "Volume", "Surface Area");
        System.out.println("--------------------------------------------");

        for (int side = 10; side <= N; side += 5) {
            //Volume=side³
            double volume = Math.pow(side, 3);
            //Surface Area=6⋅side²
            double surfaceArea = 6 * Math.pow(side, 2);
            System.out.printf("%-10d %-15.2f %-15.2f\n", side, volume, surfaceArea);
        }

        scanner.close();



    }
}
