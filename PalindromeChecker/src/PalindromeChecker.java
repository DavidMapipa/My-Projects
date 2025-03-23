import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        String original = input.toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println("It is a palindrome :)");
        }
        else {
            System.out.println("It is not a palindrome :( ");
        }
    }
}
