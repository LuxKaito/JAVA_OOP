package Buoi1;

import java.util.Scanner;

public class BTVN_05 {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.printf("%.2f\n",Math.sqrt(N));
		System.out.printf("%.3f",Math.cbrt(N)); //Hamf cbrt là hàm căn bậc 3 
	 }
}
