package Buoi1;

import java.util.Scanner;

public class BTVN_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();
		int T = sc.nextInt();
		System.out.println(Y + ","+ Z + ","+ X + ","+ T);
		System.out.println((long)X+Y+Z+T);
		System.out.println(X-Y+(long)Z*T);
	
	}

}
