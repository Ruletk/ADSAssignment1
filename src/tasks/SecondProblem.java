package tasks;

import java.util.Scanner;

public class SecondProblem {
    /**
     * This method calculates the sum of the array
     * Time complexity of the algorithm is O(n)
     * While index lesser than n, algorithm will add element from array with current index
     * Otherwise it will return 0 and recursion will be stopped.
     *
     * @param n     Count of elements in array
     * @param array Array of double numbers
     * @param index Current index of the array
     * @return Sum of the array
     */
    public static double findSum(int n, double[] array, int index) {
        if (index >= n) return 0;
        return array[index] + findSum(n, array, index + 1);
    }

    /**
     * This method calculates the average of the array based on sum of the array.
     * Time complexity of the algorithm is O(n) (because sum have O(n) complexity and O(1) for this method).
     * It will take the sum and divide by count.
     *
     * @param n     Count of elements in array
     * @param array Array of double numbers
     * @param index Current index of the array
     * @return Average of the array
     */
    public static double findAverage(int n, double[] array, int index) {
        return findSum(n, array, index) / n;
    }

    /**
     * Method-wrapper for solving the problem.
     * It takes user input and puts in the algorithm.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextDouble();
        }

        double solution = findAverage(n, array, 0);
        System.out.println(solution);
    }
}
