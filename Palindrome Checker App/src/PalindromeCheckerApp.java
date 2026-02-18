import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        //use case : 2  Hardcoded Palindrome validation


        Scanner input = new Scanner(System.in);
        // Hardcoded String

        System.out.println("Enter a string : ");
        String word = input.nextLine();

        boolean isPalindrome = true;

        // checking palindrome
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is it palindrome? " + isPalindrome);

        input.close();
    }
}


