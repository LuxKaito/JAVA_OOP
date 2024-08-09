package Buoi2;

import java.util.Scanner;

//Xếp loại học sinh
public class Bai4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), 
				c = sc.nextDouble(), d = sc.nextDouble();
		double diemTB = (a + b + 2 * c + 3 * d) / 7;
		if(diemTB >= 8) {
			System.out.println("GIOI");
		}
		else if(diemTB >= 6.5 && diemTB <= 8) { // có thể bỏ phần && 
			System.out.println("KHA");
		}
		else if (diemTB >= 5 && diemTB < 6.5) {
			System.out.println("TRUNG BINH");
		}
		else {
			System.out.println("YEU");
		}
	}
}
