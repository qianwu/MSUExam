package PQ3;

import java.util.Scanner;

public class TemperatureConversion {

    /**
     * Write a program that prints a table of conversion from Celsius (C)
     * to Fahrenheit (F) for American visitors to Saskatchewan for temperatures
     * ranging from -40 to +40 in increments of “inc”,
     * where inc will be input by the user. 𝐹= ×𝐶+32. A sample session is given below.
     * Do not worry about the number of decimal places.
     */

    public static void main(String[] args){
        //input section
        System.out.println("---------------------------");
        System.out.println("INPUT SECTION: \n");
        System.out.println("---------------------------");
        //user input the increment of temperature
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the increment of temperature you want to converse: ");
        int INC = scanner.nextInt();

        //OutPUt section
        System.out.println("---------------------------");
        System.out.println("OUTPUT SECTION: \n");
        System.out.println("---------------------------");
        concerseTemperature(INC);
        scanner.close();//close the scanner
    }

    public static void concerseTemperature(int increment){
        System.out.println("Celsius\t\tFahrenheit");
        double LOWEREST_TEMPERATURE = -40.00;
        double HIGHEST_TEMPERATURE = 40.00;
        for(double celsius = LOWEREST_TEMPERATURE; celsius<=HIGHEST_TEMPERATURE; celsius += increment){
            double fahrenheit = 9.0/5.0*celsius+32;
            System.out.printf("%.2f\t\t%.2f\n",celsius,fahrenheit);

        }
    }
}
