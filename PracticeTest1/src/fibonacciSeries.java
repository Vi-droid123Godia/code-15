import java.util.Scanner;

public class fibonacciSeries {
    private static Scanner scanner = new Scanner (System.in);
    // Java program for Fibonacci Series using Space
    // Optimized Method
        public static int fib(int n)
        {
            int a = 0, b = 1, c;
            if (n == 0)
                return a;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return b;
        }

        public static void main(String args[])
        {
            System.out.print("Enter the Nth value :");
            int n = scanner.nextInt();
            System.out.println(fib(n));
        }
    }


