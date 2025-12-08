// Ứng dụng tính tiền lãi cho vay (v.2023)
// Số_tiền_lãi = Số_tiền_gửi *  tỉ_lệ_lãi_suất (% năm) / 12 * số_tháng_gửi

import java.util.Scanner;

public class interest {
    public static void main(String[] args) {

        double money = 1.0;
        int month = 1;
        double rate = 1.0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the investment amount");
        money = input.nextDouble();
        System.out.println("Enter the annual interest rate");
        rate = input.nextDouble();
        System.out.println("Enter the total monthly interest1");
        month = input.nextInt();

        double totalInterest = 0;
        for (int i = 1; i <= month; i++) {
            totalInterest += money * (rate /100)/12;
        }

        System.out.println("The total interest is " + totalInterest);
    }
}
