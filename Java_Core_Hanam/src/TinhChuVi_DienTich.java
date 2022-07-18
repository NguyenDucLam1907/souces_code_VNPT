import java.util.Scanner;

public class test {
    public static int tinhChuViHinhChuNhat(int chieuDai, int chieuRong){
        int chuVi = (chieuDai+chieuRong)*2;
        return chuVi;
    }
    public static int tinhDienTichHinhChuNhat(int chieuDai, int chieuRong) {
        int dientich = (chieuDai * chieuRong);
        return dientich;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap thong hinh chu nhat");
        System.out.println("Nhap chieu dai");
        int chieuDai = sc.nextInt();
        System.out.println("Nhap chieu rong");
        int chieuRong = sc.nextInt();
        System.out.println("Ban chon tinh dien tich (dien1) hoac chu vi (dien2)");
        int choice = sc.nextInt();
        if (choice ==1){
            int tong=tinhDienTichHinhChuNhat(chieuDai,chieuRong);
            System.out.println("Dien tich la "+tong);
        } else if (choice ==2) {
            int tong=tinhChuViHinhChuNhat(chieuDai,chieuRong);
            System.out.println("Chu vi la "+tong);
        }
    }
}
