import java.util.Scanner;


    // use case : 4   Character Array Based Palindrome Check
 public class PalindromeCheckerApp {

          public static boolean isPalindrome(String str) {

              // Convert the string into character array

              char[] arr = str.toCharArray();
              int left = 0;
              int right = arr.length - 1;

              // Two pointer comparison

              while (left < right) {
                  if (arr[left] != arr[right]) {
                      return false;
                  }
                  left++;
                  right--;
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
