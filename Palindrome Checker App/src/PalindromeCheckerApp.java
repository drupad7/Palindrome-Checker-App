import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


    // use case : Queue + Stack Based Palindrome Check

 public class PalindromeCheckerApp {

          public static boolean isPalindrome(String str) {

             Stack<Character> stack = new Stack<>();
             Queue<Character> queue = new LinkedList<>();

             // Step : 1 Inserting characters into Queue and Stack

              for (int i=0;i<str.length();i++){
                  stack.push(str.charAt(i));
                  queue.add(str.charAt(i));
              }

              // Step : 2 Comparing and pop for stack , for queue remove

            while(!queue.isEmpty()){
                if(queue.remove() != stack.pop())
                    return false;
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
