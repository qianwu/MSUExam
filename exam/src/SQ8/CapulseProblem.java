package SQ8;

import java.util.Scanner;

public class CapulseProblem {
    /**
     * Write a program to calculate the volume,
     * surface area, and circumference of a capsule having radius r
     * ranging from 6 to N in increments of 6 and side length a,
     * where N and a are determined by the user.
     * Please find out the formulae to calculate the volume,
     * surface area and circumference of a capsule.
     * Note that the resulting values in the examples were based on
     * the PI value of 3.14159265358979 and may differ accordingly
     * if you use other values/built-in constants.
     */

    //analyze : what is the capsule? And what is the formula for this problem?
    //A capsule is a cylinder capped with two hemispheres at both ends.
    //V = πr²a+4/3*πr³( two hemispheres equivalent to an sphere)
    //Area = 2πr(2r+a)
    //Circumference = 2πr

    public static void main(String[] args){
        // Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------");
        System.out.println("INPUT SECTION: ");
        System.out.println("---------------------");
        //user input
        System.out.println("Please enter the high radius: ");
        int N = scanner.nextInt();

        System.out.println("Please enter the side length: ");
        double a = scanner.nextDouble();

        //OUTPUT
        System.out.println("---------------------");
        System.out.println("OUTPUT SECTION: ");
        System.out.println("---------------------");

        // constant
        final double PI = 3.14159265358979;

        // calculate and print
        System.out.printf("%-10s %-10s %-10s %-10s","Radius","volume","area","Circumference\n");
        for(int r = 6; r <= N; r += 6){
            //V = πr²a+4/3*πr³
            double volume =  PI*r*r*a + (4.0/3.0)*PI*r*r*r;
            //Area = 2πr(2r+a)
            double area = 2*PI*r*(2*r+a);
            //Circumference = 2πr
            double C = 2*PI*r;

            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f\n",r,volume,area,C);
        }

        scanner.close();

    }


}
