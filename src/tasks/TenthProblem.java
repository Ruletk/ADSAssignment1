package tasks;

import java.util.Scanner;

public class TenthProblem {
    /**
     * Recursive algorithm for calculating gcd (great common divisor) of two numbers
     * Time complexity of the algorithm is O(log(min(a, b))).
     * The number of a and b decreases significantly fast. For the worst case: a and b is Fibonacci numbers,
     * the maximum time is O(log(b)).
     * When remainder is equal to 0 (b divides a without a remainder), algorithm will return a (because)
     * in last iteration a was b (dividend).
     * Then algorithm returns a copy of himself, but a now is b, and b is a % b.
     *
     * @param a The first number
     * @param b The second number
     * @return GCD of two numbers
     */
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    /**
     * Wrapper function for algorithm.
     * This function reads input from user.
     * It reads numbers a and b, then returning the answer: gcd of two numbers.
     * Order is not important.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int solution = gcd(a, b);
        System.out.println(solution);
    }
}
