import java.util.Scanner;

public class Bai1_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        int a = scanner.nextInt();

        System.out.println("Nhập cạnh b: ");
        int b = scanner.nextInt();

        System.out.println("Nhập cạnh c: ");
        int c = scanner.nextInt();

        if (a > 0 && b > 0 && c > 0){
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là ba cạnh của tam giác vuông");
            }
            else {
                System.out.println("Đây không là ba cạnh của tam giác vuông");
            }
        } else {
            System.out.println("Đây không phải là ba cạnh của tam giác");
        }
    }
}
