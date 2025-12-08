import java.util.Scanner;

// Kiem tra so nguyen to

public class check_prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        if (num <2) {
            System.out.println(num + " is not a prime number");
        } else {
            int i = 2;
            boolean isPrime = true;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }
    }
}
