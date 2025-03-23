import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();

        int sum = 0;

        if (number < 0) {
            number = -number;
        }
        while (number > 0) {
            int digit = number % 10;
            sum =sum + digit;
            number= number / 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
}
