import java.util.Scanner;

public class HinhChuNhat {
    public static int tinhChuViHinhChuNhat(int chieuDai, int chieuRong) {
        int chuVi = (chieuDai + chieuRong) * 2;
        return chuVi;
    }

    public static int tinhDienTichHinhChuNhat(int chieuDai, int chieuRong) {
        int dienTich = chieuDai * chieuRong;
        return dienTich;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin hình chữ nhật");
        System.out.println("Nhập chiều dài");
        int chieuDai = scanner.nextInt();
        System.out.println("Nhập chiều rộng");
        int chieuRong = scanner.nextInt();

        int result = tinhDienTichHinhChuNhat(chieuDai,chieuRong);
        System.out.println("Diện tích hình chữ nhật là : " + result);
        int result1 = tinhChuViHinhChuNhat(chieuDai,chieuRong);
        System.out.println("Chu vi hình chữ nhật là : " + result1);


//        System.out.println("Tính diện tích (1) or chu vi (2)");
//        int choice = scanner.nextInt();
//
//        if (choice == 1){
//            int result = tinhDienTichHinhChuNhat(chieuDai,chieuRong);
//            System.out.println("Diện tích là: " + result);
//        } else if (choice == 2) {
//            int result = tinhChuViHinhChuNhat(chieuDai,chieuRong);
//            System.out.println("Chu vi là: " + result);
//        }
    }
}