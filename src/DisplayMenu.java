import java.util.Scanner;

public class DisplayMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {

            // ======== In MENU =========
            System.out.println("Menu:");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            System.out.println();

            switch (choice) {
                case 1:
                    printRectangle();
                    break;

                case 2:
                    printSquareTriangle();
                    break;

                case 3:
                    printIsoscelesTriangle();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("No such choice!");
            }

            System.out.println(); // dòng trống cho dễ nhìn
        }
    }

    // =============================================
    // 1. HÌNH CHỮ NHẬT
    // =============================================
    public static void printRectangle() {
        System.out.println("Rectangle:");
        int height = 3; // chiều dài
        int width = 7;  // chiều rộng

        for (int i = 1; i <= height; i++) {       // dòng
            for (int j = 1; j <= width; j++) {    // cột
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =============================================
    // 2. CÁC HÌNH TAM GIÁC VUÔNG
    // =============================================
    public static void printSquareTriangle() {
        System.out.println("Square triangle (bottom-left):");
        for (int i = 1; i <= 5; i++) {          // dòng
            for (int j = 1; j <= i; j++) {      // số *
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nSquare triangle (top-left):");
        for (int i = 5; i >= 1; i--) {          // dòng giảm
            for (int j = 1; j <= i; j++) {      // số * giảm
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // =============================================
    // 3. TAM GIÁC CÂN
    // =============================================
    public static void printIsoscelesTriangle() {
        System.out.println("Isosceles triangle:");
        int height = 5;

        for (int i = 1; i <= height; i++) {

            // khoảng trắng
            for (int s = 1; s <= height - i; s++) {
                System.out.print(" ");
            }

            // in *
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
