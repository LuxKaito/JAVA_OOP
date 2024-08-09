package Buoi2;

import java.util.Scanner;
//N có chữ số tận cùng là bội số của 3
public class Bai3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int dv = n % 100;
	if(dv % 3 == 0) {
		System.out.println("YES");
	}
	else {
		System.out.println("NO");
	}
}
}
