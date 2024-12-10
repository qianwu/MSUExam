package SQ1;

import java.util.Scanner;

public class AreaVolume {
    /**
     * Write a program that prints a table of surface area and volume of spheres
     * for radii ranging from 10 to N in increments of 10,
     * where the value of N is input by the user.
     * Please find out the formulae for the surface area and volume of a sphere on your own.
     * @author Charlotte Wu
     * @date 2024/12/10
     */

    public static void main(String[] args){
        /**
         * formulae for surface area : area = 4πr²
         * formulae for volume of a sphere: volume = 4୵3πr³
         */
        //INPUT SECTION
        System.out.println("----------------------");
        System.out.println("Input Section : \n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the second radii : ");
        int N = scanner.nextInt();
        //print a table of surface area and volume of spheres
        System.out.println("----------------------");
        System.out.println("Output Section : \n");
        System.out.println("----------------------");
        System.out.println("r\t\tarea\t\tvolumes");
        for(int i = 10; i<= N; i += 10){
            double area = 4*Math.PI*Math.pow(i,2);
            double volume = (4.0/3.0)*Math.PI*Math.pow(i,3);
            System.out.printf("%d\t\t%.2f\t\t%.2f\n",i,area,volume);
        }

        //close scanner
        scanner.close();
    }
}
