package Buoi2;

import java.util.Scanner;

public class BaiHoc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 100;
		int m = a++; // m = a = 100 và  a = 101
		int b = 100;
		int k = ++b; // n = tăng b = 101 và a = 101
		int d = 200;
		int n = 20;
		System.out.println(a);
		System.out.println(m);
		System.out.println(b);
		System.out.println(k);
		if(d>100 && d>300) {
			System.out.println("YES!");
		}
		else {
			System.out.println("NO!");
		}
	
		if(n % 10 == 0) {
			System.out.println("CHẲN");
		}
		else {
			System.out.println("LẺ");
		}
	}
	
}
