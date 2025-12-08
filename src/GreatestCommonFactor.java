// Tìm ước số chung lớn nhất (v.2023)
//Mục tiêu: Luyện tập sử dụng vòng lặp while.

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        a = scanner.nextInt();
        System.out.println("Enter b:");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b ==0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else  {
                b = b - a;
            }
        }
        System.out.println("The greatest common factor is " + a);
    }
}
