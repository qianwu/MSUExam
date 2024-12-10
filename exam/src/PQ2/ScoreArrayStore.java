package PQ2;

import java.util.Scanner;

public class ScoreArrayStore {
    /**
     * • reads a number N
     * • uses one array of Strings of length N to store student names,
     * an array of doubles of length N to store the marks in the midterm
     * (marks range from 0-100 and weighted 35% of total),
     * and an array of doubles to store the marks in final examination
     * (marks range from 0-100 and weighted 65% of total)
     * • reads a list of student names, midterm and final examination marks,
     * stores them in the corresponding arrays
     * • calculates the total marks for each student
     * • keeps track of the sum of marks for the midterm and final examination
     * • prints all student names, midterm, final examination, and total marks, as well as the grade in a table
     * • At the end, prints the average for midterm, final examination, and total marks, as well as the average grade
     * @author Charlotte Wu
     * @date 2024/12/9
     */

    public static void main(String[] args) {
        // Read my input: N and list of student names, midterm and final examination marks
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students will you record: ");
        int N = scanner.nextInt();
        // array set up for names , marks
        String[] names = new String[N];
        double[] marks1 = new double[N];
        double[] marks2 = new double[N];
        // populate these arrays by reading student names and marks
        readList(scanner, names, marks1, marks2);
        printResultes(names,marks1,marks2);
    }

    public static void readList(Scanner scanner, String[] names, double[] marks1, double[] marks2) {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter the name of the student #" + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.println("Enter midterm marks for " + names[i] + ": ");
            marks1[i] = scanner.nextDouble();

            System.out.println("Enter final marks for " + names[i] + ": ");
            marks2[i] = scanner.nextDouble();

        }

    }
    public static void printResultes(String[] names, double[] marks1, double[] marks2){
        double totalMidterm = 0, totalFinal = 0, totalMarks = 0;
        double averageGrade = 0;

        //print the header for the table
        System.out.println("----------------------------------------");
        System.out.println("Name\t\tMidterm\tFinal\tTotal\tGrade");
        System.out.println("----------------------------------------");


        for(int i = 0; i< names.length; i++){
            // calculate tot of student
            totalMarks = marks1[i]*0.35+marks2[i]*0.65;
            System.out.println(names[i]+"\t\t" + marks1[i] + "\t" + marks2[i] + "\t" + totalMarks);
            // calculate average
            totalMidterm = totalMidterm + marks1[i];
            totalFinal = totalFinal + marks2[i];
        }
        System.out.println("Average\t\t"+(totalMidterm/marks1.length)+"\t"+(totalFinal/marks2.length)
                +"\t"+ (totalMidterm*0.35+totalFinal*0.65)/marks1.length);
        System.out.println("----------------------------------------");
    }
}
