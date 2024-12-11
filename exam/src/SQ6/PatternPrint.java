package SQ6;

import java.util.Scanner;

public class PatternPrint {

    /**
     * Write a program that prints the following pattern for
     * a given input n containing numbers from 1 to n.
     *
     * Analyse :
     * The first and last rows/columns are all
     * The second and second-to-last rows/columns have 2, except for the corners.
     * This continues until the center reaches n
     *
     *
     *
     */

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Input the value of n
        System.out.print("Enter the value for n: ");
        int n = scanner.nextInt();
        // Size of the grid
        int size = 2 * n - 1;

        // Generate the pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                // Calculate the value for the current cell
                int value = n - Math.min(Math.min(i, j), Math.min(size - i - 1, size - j - 1));
                System.out.print(value + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
