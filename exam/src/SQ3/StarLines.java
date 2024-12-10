package SQ3;

import java.util.Scanner;

public class StarLines {
    /**
     * Write a program that prints out lines of stars,
     * based on the values determined by the user-input.
     * The program first asks for the minimum number of stars,
     * the maximum number of stars, and the interval.
     * It then prints lines of stars, starting with a line with the minimum number of stars,
     * and ending with a line with the maximum number of stars.
     * The increment of the number of stars is specified by the interval value.
     * At the end of each line, it should also print how many stars are printed.
     * @author Charlotte Wu
     * @date 2024/12/10
     */
    public static void main(String[] args){
        //INPUT SECTION
        System.out.println("----------------------");
        System.out.println("Input Section : \n");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the minimum number of stars : ");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum number of stars : ");
        int max = scanner.nextInt();
        System.out.println("What is the interval do you want to have : ");
        int interval = scanner.nextInt();

        //OUTPUT SECTION
        System.out.println("----------------------");
        System.out.println("OUTPUT Section : \n");
        System.out.println("----------------------");
        //print the lines of stars and the sum of stars in each line
        //number of star to print
        for (int star_to_print = min; star_to_print <= max; star_to_print += interval){
            for(int i = 0; i < star_to_print; i++){
                System.out.print("*");
            }
            //print the number of stars at the end of the line
            System.out.println("(" + star_to_print + " stars)");
        }

        //Ensure the maximum line is printed
        if ((max - min) % interval != 0){
            for (int i = 0; i <max; i++){
                System.out.print("*");
            }
            System.out.println(" (" + max + " stars)");
        }

        scanner.close();
    }
}
