package Buoi1;

import java.util.Scanner;

public class BaiHoc {
	public static void main(String[] args) {
		int a = 5530;
		int c = 200;
		long b = 2435873597989L;
		float Pi = 3.14F;
		double d = 1.234355232D;
		boolean check = false;
		System.out.println("Gia tri cua a la: " + a);
		System.out.println("Gia tri cua b la: " + b);
		System.out.printf("Gia tri cua Pi la: %.2f\n",Pi);
		System.out.printf("%.5f\n",d);
		System.out.println("Gia tri cua a va b la: " + a + " " + b);
		System.out.println(check);
		Scanner sc = new Scanner(System.in);
		Scanner sa = new Scanner(System.in);
		System.out.printf("Gia tri nhap k: ");
		int k = sc.nextInt(); //Hàm nhập giá trị từ bàn phím
		System.out.println("Gia tri nhap tu ban phim cua k: " + k); 
		//Hàm xuất giá trị ra từ bàn phím
		char kiTu = sa.nextLine().charAt(0); //Nhập một kí tự
		System.out.println(kiTu);
		int tong = a+c;
		float res = (float)a/c;
		System.out.println(tong);
		System.out.println(res);
		System.out.printf("%.3f\n",res); //lấy ba số sau dấu chấm thì để printf
		int s = 1000000;
		int h = 1000000;
		long l =  1L * s * h ; // hoặc ép kiểu (long)
		System.out.println(l);
		System.out.println(a>b);
		int q = -100;
		int g = 2;
		System.out.println(Math.abs(q)); // hàm trị tuyệt đối abs
		System.out.println(Math.sqrt(c)); //hàm căn bậc hai
		System.out.println((int)Math.pow(c, g)); // hàm lũy thừa
		System.out.println(Math.min(a, b));
		System.out.println(Math.max(a, b));
		System.out.println(Math.ceil(Pi)); //làm tròn lên
		System.out.println(Math.floor(Pi)); //làm tròn xuống
		System.out.println(Math.round(Pi)); //làm tròn
	}
}
