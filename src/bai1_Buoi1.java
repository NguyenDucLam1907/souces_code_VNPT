import java.util.Scanner;

public class bai1_Buoi1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        float a = scanner.nextInt();

        System.out.println("Nhập cạnh b: ");
        float b = scanner.nextInt();

        System.out.println("Nhập cạnh c: ");
        float c = scanner.nextInt();

        if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
            System.out.println("Đây là ba cạnh của tam giác vuông");
        }
        else {
            System.out.println("Đây không là ba cạnh của tam giác vuông");
        }
    }
}
