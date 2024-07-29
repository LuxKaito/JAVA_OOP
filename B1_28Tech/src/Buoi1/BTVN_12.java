package Buoi1;

import java.util.Scanner;

public class BTVN_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		long F = 5 * x + 2 * y + 1L * x * y;
		System.out.println(F);
	
	}
}
