import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Số nguyên
//        System.out.println("Nhập số:");
//        int a = scanner.nextInt();
//
//        switch (a){
//            case 1:
//                System.out.println("Một");
//                break;
//            case 2:
//                System.out.println("Hai");
//                break;
//            default:
//                System.out.println("Không hiểu");
//                break;
//        }

        //Chuỗi
        System.out.println("Nhập chuỗi:");
        String name = scanner.nextLine();

        switch (name){
            case "Lamnd":
                System.out.println(name);
                break;
            case "Toanck":
                System.out.println(name);
                break;
            default:
                System.out.println("Không hiểu");
                break;
        }
    }
}
