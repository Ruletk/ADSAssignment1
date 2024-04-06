package tasks;

import java.util.Scanner;

public class NinthProblem {
    /**
     * This method calculates the binomial coefficient by two numbers.
     * Time complexity of the algorithm is O(2^n).
     * The upper bound of complexity of this algorithm is 2^n for k = n/2.
     * We have n/2 steps of the algorithm and every step have extra operation inside.
     * This function recursively finds the binomial coefficient by formula.
     * When k is equals to n or equals to 0, algorithm will return 1.
     *
     * @param k Count of elements in array
     * @param n Array of numbers
     * @return Binomial coefficient of two numbers
     */
    public static int binomialCoefficient(int k, int n) {
        if (k == n || k == 0) return 1;
        return binomialCoefficient(k - 1, n - 1) + binomialCoefficient(k, n - 1);
    }

    /**
     * Wrapper function for algorithm.
     * This function reads input from user.
     * It reads the numbers n and k.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int solution = binomialCoefficient(k, n);
        System.out.println(solution);
    }
}
