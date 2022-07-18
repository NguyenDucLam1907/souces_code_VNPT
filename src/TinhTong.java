import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bắt đầu: ");
        int soBatDau = scanner.nextInt();

        System.out.println("Nhập số kết thúc: ");
        int soKetThuc = scanner.nextInt();

        int tongChan = 0, tongLe = 0;
        for ( int i = soBatDau; i <= soKetThuc; i++)
            if (i != 0 && i != 1 && i % 2 == 0){
                tongChan += i;
            } else {
                tongLe += i;
            }

        System.out.println("Tổng chẵn : "+tongChan);
        System.out.println("Tổng lẻ : "+tongLe);
    }
}
