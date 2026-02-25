import java.util.Scanner;
import java.util.Deque;
import java.util.LinkedList;


    // use case 7 : Deque-Based Optimized Palindrome Checker

 public class PalindromeCheckerApp {

          public static boolean isPalindrome(String str) {

             Deque<Character> deque = new LinkedList<>();


             // Step : 1 Inserting characters into Deque

              for (int i=0;i<str.length();i++){
                  deque.addLast(str.charAt(i));
              }

              // Step : 2 Comparing front and rear

            while(deque.size()>1){
                char front = deque.removeFirst();
                char rear = deque.removeLast();

                if(front != rear){
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
