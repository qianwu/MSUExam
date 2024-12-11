package SET2.SQ2;

import java.util.Scanner;

public class TennisTracker {
    /**
     * Write a program that:
     * • asks the user for the number of records for tennis players, N
     * • uses one array of Strings of length N to store track player names,
     * an array of integers of length N to store the matches won,
     * and an array of integers to store the matches lost.
     * • reads a list of N player names, the number of matches won,
     * and the number of matches lost, and stores them in the corresponding arrays
     * • calculates the winning ratio (in percent) for each player as:
     * 100×Matcheswon/TotalnumberOfMatchesPlayed
     * • keeps track of the total number of matches won by each player,
     * and the total number of matches lost by them
     * • prints all N player names, matches won, matches lost, and winning ratios
     * • At the end, prints the total matches won, total matches lost, and the overall winning ratio
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number of records
        System.out.print("Enter the number of tennis players (N): ");
        int N = scanner.nextInt();

        // Initialize arrays
        String[] playerNames = new String[N];
        int[] matchesWon = new int[N];
        int[] matchesLost = new int[N];

        // Input Section
        for (int i = 0; i < N; i++) {
            System.out.print("Enter the name of player " + (i + 1) + ": ");
            playerNames[i] = scanner.next();

            System.out.print("Enter the number of matches won by " + playerNames[i] + ": ");
            matchesWon[i] = scanner.nextInt();

            System.out.print("Enter the number of matches lost by " + playerNames[i] + ": ");
            matchesLost[i] = scanner.nextInt();
        }

        // Print header for output
        System.out.println("\nOutput Section:");
        System.out.printf("%-15s %-15s %-15s %-15s\n", "Name", "Matches Won", "Matches Lost", "Winning Ratio (%)");

        // Variables to track totals
        int totalMatchesWon = 0;
        int totalMatchesLost = 0;

        // Calculate and print player stats
        for (int i = 0; i < N; i++) {
            //total matches played by the player
            int totalMatchesPlayed = matchesWon[i] + matchesLost[i];
            // handle zero matches played
            double winningRatio = totalMatchesPlayed > 0
                    ? (100.0 * matchesWon[i]) / totalMatchesPlayed
                    : 0.0;

            // Add to totals
            totalMatchesWon += matchesWon[i];
            totalMatchesLost += matchesLost[i];

            // Print player stats
            System.out.printf("%-15s %-15d %-15d %-15.2f\n",
                    playerNames[i], matchesWon[i], matchesLost[i], winningRatio);
        }

        // Calculate and print overall stats
        int totalMatchesPlayed = totalMatchesWon + totalMatchesLost;
        double overallWinningRatio = totalMatchesPlayed > 0
                ? (100.0 * totalMatchesWon) / totalMatchesPlayed
                : 0.0;

        System.out.printf("%-15s %-15d %-15d %-15.2f\n","Total",totalMatchesWon,totalMatchesLost,overallWinningRatio);

        scanner.close();
    }
}
