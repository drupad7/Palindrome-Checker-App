import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // use case : 3  Palindrome Check Using String Reverse

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String word = input.nextLine();

        String reverse = "";  // removed space

        // reversing the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);   // removed break
        }

        boolean isPalindrome = word.equals(reverse);

        // Print result
        System.out.println("Reversed string: " + reverse);
        System.out.println("Is it palindrome? " + isPalindrome);

        input.close();
    }
}
