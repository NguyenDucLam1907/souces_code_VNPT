import java.util.Scanner;

public class Bai3_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("Không có số nguyên tố nào");
        } else {
            System.out.println("Tất cả các số nguyên tố từ 1 đến " + n + " là: ");
            for (int i = 2; i <= n; i++) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.println(i + " ");
                }
            }
        }
    }
}
