import java.util.Scanner;

public class IsPrime {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter the number of test cases to test :");
        int n = scanner.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.println("Enter the number ");
            int number = scanner.nextInt();
            isPrime(number);
        }
    }
    public static void isPrime(int number){
        if(number <= 1 ){
            System.out.println("NO");
        }
        for(int j = 2; j<= Math.sqrt(number); j++){
            if((number % j) == 0){
                System.out.println("N0");
                return;
            }
        }System.out.println("YES");
        return ;
    }
}
