import java.util.Scanner;

    // use case 8 : Linked List Based Palindrome Checker

 public class PalindromeCheckerApp {

     static class Node {
         char data;
         Node next;

         Node(char data) {
             this.data = data;
             this.next = null;
         }
     }

     // Step 1 : Converting the string into linked list
     public static  Node  createLinkedList(String str){
         Node head = null , tail = null;

         for(char c: str.toCharArray()){
             Node = newNode = new Node(c);

             if(head == null){
                 head = newNode;
                 tail = newNode;
             }else{
                 tail.next = newNode;
                 tail = newNode;
             }
         }
         return  head;
     }

     // Step 2 : Checking Palindrome
          public static boolean isPalindrome(Node head) {

           if(head == null) || head.next == null)
              return true;

            Node slow = head;
            Node fast = head;


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
