package SET2.SQ7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MortageCalculation {

    /**
     * This is a complicated problem!
     * Break down:
     * What is the purpose of the program?
     * In this case: To recalculate mortgage repayment details for multiple customers based on additional payments and show their savings.
     * What are the key outputs?
     * What the program should produce (e.g., new monthly payments, durations, interest amounts, savings, etc.).
     *
     * Break the Requirement into Components
     *
     * Mortgage Calculation Program
     * ├── Inputs
     * │   ├── Borrower Names
     * │   ├── Mortgage Balances
     * │   ├── Interest Rates
     * │   ├── Current Monthly Payments
     * │   └── Extra Monthly Payments
     * ├── Processes
     * │   ├── New Payment = Current Payment + Extra Payment
     * │   ├── Duration Formulas
     * │   │   ├── Current Duration
     * │   │   └── New Duration
     * │   ├── Interest Calculations
     * │   │   ├── Current Interest
     * │   │   └── New Interest
     * │   └── Savings = Current Interest - New Interest
     * ├── Outputs
     * │   ├── Current Payment Details
     * │   ├── New Payment Details
     * │   ├── Savings
     * │   └── Fee Indicator (Extra Fees/No Fee)
     * └── Sorting
     *     └── By Savings (Descending)
     *
     * Rephrase the Requirement in my understanding
     * 1. Inputs: I need to input customer data(names, balances, payments).
     * 2. Processes:
     *"For each customer, I need to:
     * Calculate the new payment by adding the extra payment.
     * Use a formula to find the current and new durations in months.
     * Calculate the interest amounts.
     * Find the savings by subtracting the new interest from the current interest.
     * Check if there are extra fees based on the new duration."
     * 3. Outputs:
     * "I need to display all the calculated data, sorted by savings."
     *
     * Formulas:
     * log
     *
     * 1. Read the number of customers, n.
     * 2. Create arrays for names, balances, interest rates, current payments, extra payments.
     * 3. For i = 1 to n:
     *       Input customer data into arrays.
     *
     * 4. For each customer:
     *       Calculate NewPayment = CurrentPayment + ExtraPayment.
     *       Calculate i = InterestRate / 100 / 12.
     *       Calculate CurrentDuration = log(CurrentPayment / (CurrentPayment - i * MortgageBalance)) / log(1 + i).
     *       Calculate NewDuration = log(NewPayment / (NewPayment - i * MortgageBalance)) / log(1 + i).
     *       Calculate CurrentInterest = (CurrentPayment * CurrentDuration) - MortgageBalance.
     *       Calculate NewInterest = (NewPayment * NewDuration) - MortgageBalance.
     *       Calculate Savings = CurrentInterest - NewInterest.
     *       If NewDuration <= CurrentDuration / 2:
     *           Mark as "Extra Fees".
     *       Else:
     *           Mark as "No Fee".
     *
     * 5. Sort customers by Savings (descending).
     *
     * 6. For each customer:
     *       Print name, balance, interest rate.
     *       Print Current payment, duration, interest.
     *       Print New payment, duration, interest.
     *       Print Savings and Fee Indicator.
     *
     *
     * Fake code:
     * 1. Read the number of customers, n.
     * 2. Create arrays for names, balances, interest rates, current payments, extra payments.
     * 3. For i = 1 to n:
     *       Input customer data into arrays.
     *
     * 4. For each customer:
     *       Calculate NewPayment = CurrentPayment + ExtraPayment.
     *       Calculate i = InterestRate / 100 / 12.
     *       Calculate CurrentDuration = log(CurrentPayment / (CurrentPayment - i * MortgageBalance)) / log(1 + i).
     *       Calculate NewDuration = log(NewPayment / (NewPayment - i * MortgageBalance)) / log(1 + i).
     *       Calculate CurrentInterest = (CurrentPayment * CurrentDuration) - MortgageBalance.
     *       Calculate NewInterest = (NewPayment * NewDuration) - MortgageBalance.
     *       Calculate Savings = CurrentInterest - NewInterest.
     *       If NewDuration <= CurrentDuration / 2:
     *           Mark as "Extra Fees".
     *       Else:
     *           Mark as "No Fee".
     *
     * 5. Sort customers by Savings (descending).
     *
     * 6. For each customer:
     *       Print name, balance, interest rate.
     *       Print Current payment, duration, interest.
     *       Print New payment, duration, interest.
     *       Print Savings and Fee Indicator.
     */




    public static void main(String[] args){

        class Borrower {
            String name;
            double balance;
            double interestRate;
            double currentPayment;
            double extraPayment;
            double newPayment;
            double currentDuration;
            double newDuration;
            double currentInterest;
            double newInterest;
            double savings;
            String feeIndicator;

            // Constructor to initialize the borrower
            public Borrower(String name, double balance, double interestRate, double currentPayment, double extraPayment) {
                this.name = name;
                this.balance = balance;
                this.interestRate = interestRate;
                this.currentPayment = currentPayment;
                this.extraPayment = extraPayment;
            }
        }
        //Input section
        System.out.println("Enter the number of borrowers: " );
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[n];
        double[] balances = new double[n];
        double[] interestRates = new double[n];
        double[] currentPayments = new double[n];
        double[] extraPayments = new double[n];

        List<Borrower> borrowers = new ArrayList<>();

        for(int i = 0;i< n; i++){
            System.out.println("Enter the name of borrowers " + i+1);
            names[i] = scanner.nextLine();
            System.out.println("Enter the balances of borrowers " + (i+1));
            balances[i] = scanner.nextDouble();
            System.out.println("Enter the interest rates of borrowers " + (i+1));
            interestRates[i] = scanner.nextDouble();
            System.out.println("Enter the current monthly payments of borrowers " + (i+1));
            currentPayments[i] = scanner.nextDouble();
            System.out.println("Enter the extra monthly payments of borrowers " + (i+1));
            extraPayments[i] = scanner.nextDouble();
            scanner.nextLine();

            Borrower borrower = new Borrower(names[i],balances[i],interestRates[i],currentPayments[i],extraPayments[i]);
            borrowers.add(borrower);
        }


        //for each borrower, calculate for the requirement
        for(Borrower borrower : borrowers){
            borrower.newPayment = borrower.currentPayment + borrower.extraPayment;
            double i = borrower.interestRate / 100 / 12;
            // Calculate CurrentDuration = log(CurrentPayment / (CurrentPayment - i * MortgageBalance)) / log(1 + i).
            borrower.currentDuration = Math.log(borrower.currentPayment / (borrower.currentPayment - i * borrower.balance)) / Math.log(1 + i);
            // Calculate NewDuration = log(NewPayment / (NewPayment - i * MortgageBalance)) / log(1 + i).
            borrower.newDuration = Math.log(borrower.newPayment / (borrower.newPayment - i * borrower.balance)) / Math.log(1 + i);
            // Calculate CurrentInterest = (CurrentPayment * CurrentDuration) - MortgageBalance.
            borrower.currentInterest = (borrower.currentPayment * borrower.currentDuration) - borrower.balance;
            // Calculate NewInterest = (NewPayment * NewDuration) - MortgageBalance.
            borrower.newInterest = (borrower.newPayment * borrower.newDuration) - borrower.balance;
            //Calculate Savings = CurrentInterest - NewInterest.
            borrower.savings = borrower.currentInterest - borrower.newInterest;
            // indicate fee
            borrower.feeIndicator = borrower.newDuration <= borrower.currentDuration / 2 ? "Extra Fees" : "No Fee";

        }
        // sort borrowers by savings
        for(int i = 0; i<borrowers.size()-1; i++){
            for(int j = 0; j<borrowers.size()-1-i;j++){
                if(borrowers.get(j).savings < borrowers.get(j+1).savings){
                    Borrower temp = borrowers.get(j);
                    borrowers.set(j,borrowers.get(j+1));
                    borrowers.set(j+1,temp);
                }
            }
        }

        // print out
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s\n",
                "Name", "Balance", "Savings", "New Payment", "New Duration", "Fee");
        for (Borrower borrower : borrowers) {
            System.out.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f %-15s\n",
                    borrower.name, borrower.balance, borrower.savings, borrower.newPayment,
                    borrower.newDuration, borrower.feeIndicator);
        }


    }


}
