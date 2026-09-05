import java.util.Scanner;

public class PalindromeChecker {

    // Approach 1: Reverse the string
    public static boolean isPalindromeReverse(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    // Approach 2: Two-pointer approach
    public static boolean isPalindromeTwoPointer(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left))
                    != Character.toLowerCase(str.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // Approach 3: Recursion
    public static boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (Character.toLowerCase(str.charAt(left))
                != Character.toLowerCase(str.charAt(right))) {
            return false;
        }

        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("\nResults:");

        System.out.println("Reverse approach: "
                + isPalindromeReverse(input));

        System.out.println("Two-pointer approach: "
                + isPalindromeTwoPointer(input));

        System.out.println("Recursive approach: "
                + isPalindromeRecursive(input, 0, input.length() - 1));

        scanner.close();
    }
}
