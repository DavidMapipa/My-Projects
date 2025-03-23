import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        int number, remainder;
        System.out.println("Welcome to EvenOdd Program");
        System.out.println("Please enter a number");
        Scanner scan = new Scanner(System.in);
        number = scan.nextInt();
        scan.close();

        remainder = number % 2;

        if(remainder == 0)
            System.out.println(number + " Is an Even Number");

        else if (remainder == 1)
            System.out.println(number + " Is an Odd Number");
    }
}
