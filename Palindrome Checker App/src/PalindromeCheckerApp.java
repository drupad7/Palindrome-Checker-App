import java.util.Scanner;

// Use Case 10 : Case-Insensitive & Space-Ignored Palindrome Checker

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        // Step 1: Normalize string (remove spaces & convert to lowercase)
        str = str.replaceAll("\\s+", "").toLowerCase();

        // Step 2: Convert to char array
        char[] arr = str.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        // Step 3: Compare characters
        while (start < end) {

            if (arr[start] != arr[end]) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println("It is a Palindrome.");
        } else {
            System.out.println("It is NOT a Palindrome.");
        }

        sc.close();
    }
}