package tasks;

import java.util.Scanner;

public class SixthProblem {
    /**
     * Recursion algorithm to get the power of the number
     * Time complexity is O(b)
     * Because b passing all integer numbers from b to 0, this algorithm is linear.
     * If power number equals 0, it will be return 0.
     * If power number greater than 0, algorithm will multiply number a
     * by the algorithm, but power will be decreased
     * Otherwise, if power lesser than 0, algorithm will increase the power number.
     *
     * @param a The base number.
     * @param b The power number.
     * @return The result of raising the base number to the power number.
     */
    public static double recursionPower(int a, int b) {
        if (b == 0) return 1;
        if (b > 0)
            return a * recursionPower(a, b - 1);
        return (double) 1 / a * recursionPower(a, b + 1);
    }

    /**
     * Method wrapper for solution.
     * It receives two numbers from user: base and a power
     * and returns the raising number a to the power of b.
     * Then it prints the result to the user.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        double solution = recursionPower(a, b);
        System.out.println(solution);
    }
}
