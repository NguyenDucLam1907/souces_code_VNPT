import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số: ");
        int a = scanner.nextInt();

        do {
            System.out.println("Lamnd");
            a++;
        } while (a < 5);
    }
}
