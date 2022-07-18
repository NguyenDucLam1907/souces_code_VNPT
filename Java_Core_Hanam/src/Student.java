public class Student {
    //hàm trong java
    public static int tinhTong(int a, int b){
        int tong = a+b;
        System.out.println("tong la" +(tong));
        return tong;
    }

    public int nhanHaiSo(int a, int b){
        int result =a*b;
        return result;
    }
    public static void main(String[] args){
        int tong = tinhTong(9, 10);
        Student st = new Student();
        int result = st.nhanHaiSo(7, 8);
        System.out.println(tong);
        System.out.println(result);
    }

//    public static void main(String[] args) {
//        int number = 8;
//        String name = "ict";
//        long number2 = 8;
//        float number3 = 7;
//        double number4 = 8;
//        System.out.println(number);
//        System.out.println(name);
//        System.out.println(number2);
//        System.out.println(number3);
//        System.out.println(number4);
//
//        //tinh toán
//        long sum =  (number + number2);
//        double sum1 = (8 + 8.5);
//        int sum2 = (int) (8 + 8.5);
//        System.out.println(sum);
//        System.out.println(sum1);
//        System.out.println(sum2);
//
//        //cấu trúc điều kiện
//        int age = 18;
//        String nameStudent = "toan";
//        if(age == 18  && nameStudent.equals("toanck")) {
//            //do something
//            System.out.println("18 tuoi");
//
//        }else {
//            System.out.println("khac 18 tuoi");
//        }
//
//        if (age == 19 || nameStudent.equals("toanck")) {
//            System.out.println("thoa man 1 trong 2 dieu kien");
//        }else {
//            System.out.println("khong thoa man dieu kien");
//        }
//
//        //LOOP (vòng lặp)
//        for (int i=0; i <= 5; i++){
//            //do something
//            System.out.println("bước chạy");
//            System.out.println("gia tri thứ: "+i);
//        }

}

