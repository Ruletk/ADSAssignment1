package tasks;

import java.util.Scanner;

public class ThirdProblem {
    /**
     * Recursive algorithm to check prime numbers n.
     * Complexity of the algorithm is O(sqrt(n)) (sqrt is a square root)
     * Firstly, algorithm setting upper bound of checking number.
     * Then checking if current greater than max. Returning true if it is.
     * Check if the number n is not divisible by the current divisor without a remainder.
     * Then calling a recursive method with increased current value.
     * If in any of recursion level number n have a remainder, it will return false
     * because of 'And' operation have one false.
     *
     * @param n       Number that checking.
     * @param current Current number for division checking. Default is 0.
     * @param max     Upper bound for current number. Default 0.
     * @return Is number n is prime.
     */
    public static boolean isPrime(int n, int current, int max) {
        if (max == 0) max = (int) Math.sqrt(n) + 1;
        if (current >= max) return true;
        return n % current != 0 && isPrime(n, current + 1, max);
    }

    /**
     * Taking a number from user then saving the solution to the variable.
     * Then bringing the result to 'Prime' and 'Composite' words.
     * And sending the result to the user.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        boolean solution = isPrime(n, 2, 0);
        System.out.println(solution ? "Prime" : "Composite");
    }
}
