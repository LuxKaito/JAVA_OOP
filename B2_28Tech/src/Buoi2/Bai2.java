package Buoi2;

import java.util.Scanner;
// N có phải là số có 2 chữ số có chữ tận cùng là số nguyên tố
public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dv = n % 10;
		if((n >= 10 && n <= 99) && ( dv % 2 == 0 || dv % 3 == 0 || dv % 5 == 0 || dv % 7 == 0 )) {
			System.out.println("YES");		
		}
		else {
			System.out.println("NO");
		}
	}
}
