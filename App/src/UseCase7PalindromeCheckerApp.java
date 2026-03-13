import java.util.Deque;
import java.util.ArrayDeque;
import java.util.Scanner;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {

            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (Character.toLowerCase(first) != Character.toLowerCase(last)) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if (isPalindrome) {
            System.out.println(" is a Palindrome?"+input);
        } else {
            System.out.println(input + " is not a Palindrome");
        }

        sc.close();
    }
}