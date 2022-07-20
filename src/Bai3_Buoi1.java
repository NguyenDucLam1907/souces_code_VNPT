import java.util.Scanner;

public class Bai3_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int n = scanner.nextInt();

        System.out.println("Các số nguyên tố từ 1 đến " + n + " là:");
        for (int i = 1; i <= n; i++){
            int dem = 0;
            for (int j = 1; j <= i; j++){
                if (i % j == 0) {
                    dem++;
                }
            }
            if (dem == 2) {
                System.out.println(i);
            }
        }
    }
}
