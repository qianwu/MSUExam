package PQ1;

import java.util.Scanner;

public class VolumeWaterCylinder {
    /**
     * Write a program that prints a table of how much volume of water a cylinder
     * (with a radius r of 3 meters) is holding, as the height of water rises from
     * 10 to N meters in increments of 2, where the value of N is input by the user
     * (use the formula 𝑣𝑜𝑙𝑢𝑚𝑒=𝜋×𝑟 )
     */

    public static void main(String[] args){
        // user input the increment
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the height: ");
        int height = scanner.nextInt();

        //print a table of how much volume of water a cylinder ( radius equal to 3 meters) is holding
        printVolume(height);

        scanner.close();

    }

    public static void printVolume(int height){
        System.out.println("--------------------");
        System.out.println("height\t\tvolume");
        System.out.println("--------------------");
        int INCREMENT = 2;
        for(int i=10; i<=height; i += INCREMENT ){
            double v = i*Math.PI*3*3;
            System.out.printf("%d\t\t%.2f\n",i,v);
        }


    }
}
