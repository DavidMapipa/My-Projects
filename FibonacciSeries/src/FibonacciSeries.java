import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = scanner.nextInt();
        scanner.close();

        if (n <= 0) {
            System.out.println("The fibonacci series is empty");
            return;
        }
            int first = 0, second = 1;

            System.out.println("The fibonacci series : ");
            for (int i = 0; i <= n; i++) {
                System.out.print(first + " ");

                int next = first + second;
                first = second;
                second = next;
        }
    }
}
