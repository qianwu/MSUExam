package SET2.SQ4;

import java.util.Scanner;

public class StudentMarkCalculate {

    /**
     * Write a program that will:
     * • read the number of students N
     * • use a couple of arrays of length N to store student names
     * and scores obtained for each course - English, Mathematics,
     * and Science (marks range from 0-100)
     * • read a list of N student names, and scores obtained in each course,
     * and store them in the corresponding arrays
     * • calculate the total score for each student
     * • calculate the corresponding percentage (percentage = total/3)
     * • keep track of the student grades based on the two conditions:
     *      o If the score obtained by the student in any of the courses
     *      (English, Mathematics and Science) is less than 50 then mark the student as a Fail
     *      o If the scores in all the courses (English, Mathematics and Science)
     *      are 50 and above, then mark the student as Pass
     * • print all the student names, the scores obtained in all the courses,
     * their corresponding total, percentage, and pass or fail in a tabular format
     * • and at the end, print the overall average score for each course,
     * their Total and Percentage values.
     * • Do not worry about having exact decimal points and other number formatting.
     */

    public static void main(String[] args){
        //Input Section: the number of students N, a list of student names, score obtained in
        //English, Mathematics,and Science
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int N = scanner.nextInt();
        scanner.nextLine();

        //initialize arrays for student names, scores in different lessons
        String[] names = new String[N];
        double[] englishScore = new double[N];
        double[] mathScore = new double[N];
        double[] scienceScore = new double[N];

        for(int i=0; i<N;i++){
            System.out.println("Enter the student name : ");
            names[i] = scanner.nextLine();
            System.out.println("Enter the English score for "+ names[i]+" :");
            englishScore[i] = scanner.nextDouble();
            System.out.println("Enter the Math score for "+ names[i]+" :");
            mathScore[i] = scanner.nextDouble();
            System.out.println("Enter the Science score for "+ names[i]+" :");
            scienceScore[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        //read a list of inputs of student names and scores
        //Output Section: (TotalScore)total score for each student,(PercentageScore)percentage
        //(Grades)student grades
        readStudentScores(names,englishScore,mathScore,scienceScore);

        //close scanner
        scanner.close();
    }

    public static void readStudentScores(String[] names,double[] englishScore,double[] mathScore,double[] scienceScore){
        System.out.println("-----------------------------");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-15s\n","Student Name","English Score","Math Score","Science Score","Total Score","Percentage","Grade");
        double total = 0;
        String studentGrade;
        double average =0;
        double overallEnglish = 0;
        double overallMath = 0;
        double overallScience = 0;
        double overalltotal = 0;
        double totalSum = 0;
        double averageSum = 0;
        for(int i = 0; i< names.length; i++){
            if(englishScore[i]<50||mathScore[i]<50||scienceScore[i]<50){
                studentGrade = "Fail";
            }else {
                studentGrade = "Pass";
            }
            total = englishScore[i]+mathScore[i]+scienceScore[i];
            overallEnglish = englishScore[i]+overallEnglish;
            overallMath = mathScore[i]+overallMath;
            overallScience = scienceScore[i] + overallScience;
            overalltotal = total+overalltotal;

            average = total/3;
            averageSum = average+ averageSum;
            System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15s %-15s\n",names[i],englishScore[i],mathScore[i],scienceScore[i],total,String.format("%.2f",average)+"%",studentGrade);
        }

        double overallAverage = totalSum/names.length;
        double overallPercentage = (overalltotal/(3* names.length));
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n","English Average","Math Average","Science Average","Total Score","Percentage");
        System.out.printf("%-15.2f %-15.2f %-15.2f %-15.2f %-15s\n",overallEnglish/names.length,overallMath/names.length,overallScience/ names.length,overalltotal/names.length,String.format("%.2f",overallPercentage)+"%");
    }
}
