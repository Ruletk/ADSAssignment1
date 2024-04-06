package tasks;

import java.util.Scanner;

public class SeventhProblem {
    /**
     * Recursion algorithm for printing numbers in reverse order.
     * Time complexity is O(n)
     * This algorithm saves current number and calls this algorithm again, with decreased iter number.
     * When iter reaches 0, algorithm will stop receiving numbers and prints numbers from last to first.
     *
     * @param scanner Scanner object for user input.
     * @param iter    Remaining number of iterations.
     */
    private static void solve(Scanner scanner, int iter) {
        if (iter == 0) return;
        int t = scanner.nextInt();
        solve(scanner, iter - 1);
        System.out.print(t + " ");
    }

    /**
     * Method wrapper for solving problem. Overloaded method.
     *
     * @param scanner Scanner object for user input.
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        solve(scanner, n);
    }
}
