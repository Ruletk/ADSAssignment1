package tasks;

import java.util.Scanner;

public class FirstProblem {
    /**
     * This method calculates the minimum elements of the array.
     * Time complexity of the algorithm is O(n)
     * Algorithm will pass all numbers from 0 to n, so it have linear complexity.
     * This function recursively finds the minimum element in the array.
     * When index is greater than or equal than n, method will return
     *
     * @param n     Count of elements in array
     * @param array Array of numbers
     * @return Minimum element of the array
     */
    public static int minElement(int n, int[] array, int index) {
        return index < n ? Math.min(array[index], minElement(n, array, index + 1)) : Integer.MAX_VALUE;
    }

    /**
     * Wrapper function for algorithm.
     * This function reads input from user.
     * It reads first number n: count of elements
     * Then it reads every number from user input and writes it to array.
     *
     * @param scanner Scanner object for user input
     */
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        scanner.nextLine();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int solution = minElement(n, array, 0);
        System.out.println(solution);
    }
}