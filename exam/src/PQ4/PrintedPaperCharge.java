package PQ4;

import java.util.Scanner;

public class PrintedPaperCharge {
    /**
     *
     */
    public static void main(String[] args) {
        //INPUT SECTION: UseD input the number of students
        System.out.println("------------------ ");
        System.out.println("INPUT SECTION: \n");
        System.out.println("------------------ ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students use papers printed : ");
        int N = scanner.nextInt();
        // use arrays to store names, papers
        String[] names = new String[N];
        int[] blackCopies = new int[N];
        int[] colorCopies = new int[N];
        // read a list of student names, numbers of BW and color pages
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the name of the student " + (i + 1) + ": ");
            names[i] = scanner.next();
            System.out.println("Enter the number of black copies of the student " + names[i] + ": ");
            blackCopies[i] = scanner.nextInt();
            System.out.println("Enter the number of color copies of the student " + names[i] + ": ");
            colorCopies[i] = scanner.nextInt();
        }

        //calculate the charge, sum, average and print detailed printed info
        System.out.println("OUTPUT SECTION: \n");
        System.out.println("------------------------");
        System.out.println("No.\tName\tBW Copies\tColor Copies\tCharge");
        System.out.println("-------------------");
        calculatePaperPrinted(names, blackCopies, colorCopies);
        //close scanner scanner.close();
        scanner.close();
    }

    public static void calculatePaperPrinted(String[] names, int[] blackCopies, int[] colorCopies) {

        double sumBW = 0;

        double sumCO = 0;

        double sumCharge = 0;

        for (int i = 0; i < names.length; i++) {
            double charge = blackCopies[i] * 0.05 + colorCopies[i] * 0.10;

            sumBW = sumBW + blackCopies[i];

            sumCO = sumCO + colorCopies[i];

            sumCharge = sumCharge + charge;
            System.out.println("\t" + names[i] + "\t" + blackCopies[i] + "\t" + colorCopies[i] + "\t" + "$"+charge);
        }
        //print sum and average
        System.out.println(" ----------------------");
        System.out.println("Total\t" + sumBW + "\t" + sumCO + "\t" + sumCharge);
        System.out.println("Average\t" + sumBW/names.length + "\t" + sumCO/names.length + "\t" + "$"+sumCharge/names.length);
    }
}
