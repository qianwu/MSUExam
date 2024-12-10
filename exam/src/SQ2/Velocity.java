package SQ2;

import java.util.Scanner;

public class Velocity {

    /**
     * Write a program that prints a table that shows each second,
     * the height from the ground (meters), and the velocity (m/s)
     * of a free-falling object from an initial height (metres).
     * The initial height is given by the user.
     * Please find out the necessary formulae and use 9.8 (m/s2) for the gravitational acceleration.
     */

    public static void main(String[] args) {
        //velocity formula for a free-falling object is : v=g⋅t
        // Height at time t: h = h⁰-1/2*g*t²
        //INPUT SECTION
        System.out.println("----------------------");
        System.out.println("Input Section : \n");
        System.out.println("----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the initial height : ");
        double H = scanner.nextDouble();

        final double GRAVITY = 9.8;

        //Output Section
        System.out.println("----------------------");
        System.out.println("Output Section : \n");
        System.out.println("----------------------");
        // print a table : each second, height from the ground, velocity
        double height = H;
        double velocity = 0.0;
        int time = 0;
        System.out.printf("%10s %10s %10s\n","t(s)","Height(m)","Velocity(m/s)");
        while (height > 0) {
            //print the current state
            System.out.printf("%10d %10.2f %10.2f\n", time, height, velocity);

            time++;
            // v = g*t
            velocity = GRAVITY * time;
            //h = h0 - 0.5 * g * t2
            height = H - 0.5 * GRAVITY * time * time;

            // Ensure height is not negative
            if (height < 0) {
                height = 0;
            }

        }
        scanner.close();
    }
}
