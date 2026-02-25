import java.util.Scanner;
import java.util.Stack;


    // use case : Stack-Based Palindrome Checker

 public class PalindromeCheckerApp {

          public static boolean isPalindrome(String str) {

             Stack<Character> stack = new Stack<>();

             // Step : 1 Pushing all the characters into stack

              for (int i=0;i<str.length();i++){
                  stack.push(str.charAt(i));
              }

              // Step : 2 Pop and comparing

              for(int i=0;i<str.length();i++){
                  if(str.charAt(i) != stack.pop()){
                      return false;
                  }
              }
              return true;
          }
          public static void main(String[] args) {

         Scanner sc = new Scanner(System.in);

         System.out.println("Enter a string: ");
         String input = sc.nextLine();

              if (isPalindrome(input)) {
                  System.out.println("It is a Palindrome.");
              } else {
                  System.out.println("It is NOT a Palindrome.");
              }

        sc.close();
    }
}
