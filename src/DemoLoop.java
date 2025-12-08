import java.util.Scanner;

public class DemoLoop {
    public static void main(String[] args) {
        // VIết chương trình nhập vào từ bàn phím một số nguyên dương n >0 và  n <1000
        // Hiển thị tổng các số từ 1 đến n

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();

        int sum = 0;

        if (num <=0 || num >=1000) {
            System.out.println("Giá tri ko hop le");
        } else {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
        }

        System.out.println("Tổng các số từ 1 đến n là: " + sum);
    }
}
