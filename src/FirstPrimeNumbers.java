import java.util.Scanner;

public class FirstPrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bước 1: Nhập số lượng số nguyên tố cần in
        System.out.println("Enter qty of prime number");
        int num = scanner.nextInt();

        // Bước 2: Biến đếm số lượng số nguyên tố đã in
        int count = 0;

        // Bước 3: Bắt đầu kiểm tra từ số 2
        int N = 2;

        // Bước 4: Lặp cho đến khi đủ số lượng số nguyên tố
        while (count < num) {
            boolean isPrime = true;


            // Kiểm tra N có phải số nguyên tố không
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            // Nếu là số nguyên tố thì in ra
            if (isPrime) {
                System.out.println("Prime number is " + N);
                count++;
            }
            // Tăng N để kiểm tra số tiếp theo
            N++;
        }
    }
}
