package tasks;

import java.util.Scanner;

public class FifthProblem {
    private static final long[] cache = new long[1000];

    /**
     * Cached algorithm for finding Fibonacci number.
     * Time complexity of the algorithm is O(n).
     * Because algorithm caches all previous Fibonacci numbers, they don't count again.
     * Algorithm will pass only one branch (left), other branches already calculated and
     * waiting in the cache. So this algorithm have linear complexity.
     * If number lesser than 2, it will return the n number (0 or 1)
     * Then algorithm checking the cache and if it has empty value,
     * it will be filled by Fibonacci number using recursion.
     * This algorithm will be working until it not reaches the number 1 or 0.
     * After calculating the first (left) summand, the second one already will be in cache.
     *
     * @param n Index of the Fibonacci number.
     * @return N'th number of Fibonacci sequence.
     */
    public static long cachedFibonacci(int n) {
        if (n <= 1) return n;
        if (cache[n] == 0)
            cache[n] = cachedFibonacci(n - 1) + cachedFibonacci(n - 2);
        return cache[n];
    }

    /**
     * Method wrapper for solution. It's receiving the number n from user
     * and calls the cachedFibonacci function.
     * Then solution returns to user.
     *
     * @param scanner Scanner object for user input.
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        long solution = cachedFibonacci(n);
        System.out.println(solution);
    }
}
