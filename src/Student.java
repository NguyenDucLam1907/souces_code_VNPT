import java.util.Scanner;

public class Student {

    //hàm trong java
    public int tinhTong(int a, int b) {
        int tong = a + b;
        System.out.println("tổng là "+ tong);
        return tong;
    }
    public int nhanHaiSo(int a, int b) {
        int tich = a * b;
        System.out.println("tích là "+ tich);
        return tich;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ 1");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ 1");
        int b = scanner.nextInt();

        //khởi tạo mới 1 đối tượng
        Student student = new Student();
        int soNhanVe = student.tinhTong(a, b);
        int tich = student.nhanHaiSo(a, b);
    }
}