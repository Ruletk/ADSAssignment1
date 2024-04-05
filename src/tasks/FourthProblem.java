package tasks;

import java.util.Scanner;

public class FourthProblem {
    /**
     * Recursive algorithm for finding factorial of the number.
     * Algorithm complexity is O(n)
     * While n is not equal to 0, returning number n multiplied by
     * algorithm with decreased n number.
     *
     * @param n Number for factorial (n!)
     * @return Factorial of the number n.
     */
    public static long factorial(int n) {
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    /**
     * Method wrapper for solving problem.
     *
     * @param scanner Scanner object for user input.
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        long solution = factorial(n);
        System.out.println(solution);
    }
}
