package tasks;

import java.util.Scanner;

public class EighthProblem {

    /**
     * Recursion algorithm for checking string contains only digits.
     * Time complexity of algorithm is O(n)
     * Casting char at index position to int and comparing with '0' and '9' at ascii representation.
     * If char inside that interval, algorithm will be checking next character inside input.
     *
     * @param input Input string with character sequence
     * @param index Index if the current char
     * @return True if input contains only digits, false otherwise.
     */
    public static boolean isStringDigit(String input, int index) {
        if (index >= input.length()) return true;
        int onIndex = input.charAt(index);
        return onIndex >= 48 && onIndex <= 57  && isStringDigit(input, index + 1);
    }

    /**
     * Method wrapper for solving problem. Receiving input string from the user.
     *
     * @param scanner Scanner object for user input.
     */
    public static void solve(Scanner scanner) {
        String input = scanner.nextLine();
        boolean solution = isStringDigit(input, 0);
        System.out.println(solution ? "Yes" : "No");
    }
}
