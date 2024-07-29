package Buoi2;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if((n % 400 == 0) || (n % 4 == 0 && n % 100 != 0) ) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}
}
