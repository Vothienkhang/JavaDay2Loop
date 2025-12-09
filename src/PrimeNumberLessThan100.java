public class PrimeNumberLessThan100 {
    public static void main(String[] args) {
        // Bước 2: Duyệt các số từ 2 đến 99

        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            // Bước 1: Kiểm tra number có phải số nguyên tố không
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(number + " is prime");
            }
        }
    }
}
