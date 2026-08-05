import java.util.Scanner;

public class NumberOperations {

    static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {

            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    static int factorial(int number) {

        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }

        if (number >= 0) {
            System.out.println("Factorial = " + factorial(number));
        }

        sc.close();
    }
}
