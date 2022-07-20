import java.util.Scanner;

public class Bai2_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số nguyên:");
        int a = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            int result = a * i;
            System.out.println(a + " x " + i + " = " + result);
        }
    }
}
