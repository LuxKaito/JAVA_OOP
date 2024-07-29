package Buoi1;

import java.util.Scanner;

public class BTVN_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int t = sc.nextInt();
		System.out.println(x + "  "+ y + "  " + z + "  " + t);
		System.out.println();
		System.out.println(y + "--" + z + "--" + x + "--" + t);
		System.out.println();
		System.out.println(2*x + "," + (long)3*y + "," + (long)4*z + "," + (long)5*t);
		System.out.println();
		System.out.println("KET THUC !!");
	}
}
