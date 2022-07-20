import java.util.Scanner;

public class BangCuuChuong {
    public static void main(String[] args) {

        // dùng: while (true)
//        while (true){
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Nhập số");
//            int n = scanner.nextInt();
//
//            for (int i = 1; i <= 9; i ++){
//                System.out.println(n + " x " + i + " = " + n * i);
//            }
//        }

        // dùng: do while
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập số");
            int n = scanner.nextInt();

            for (int i = 1; i <= 9; i ++){
                System.out.println(n + " x " + i + " = " + n * i);
            }
        } while (true);
    }
}
