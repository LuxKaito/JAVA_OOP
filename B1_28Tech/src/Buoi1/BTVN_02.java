package Buoi1;

import java.util.Scanner;

public class BTVN_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long y = sc.nextLong();
		sc.nextLine(); //Trước nextLine mà là next khác (VD nextInt thì sẽ bị trôi lệnh)
		char c = sc.nextLine().charAt(0);
		float f = sc.nextFloat();
		double d = sc.nextDouble();
		System.out.println(x + "\n" + y +"\n" +c);
		System.out.printf("%.2f\n",f);
		System.out.printf("%.9f",d);
//		int x = sc.nextInt();
//		sc.nextLine();
//		String b = sc.nextLine(); // đọc hết dòng
//		String c =sc.next(); // đọc đúng được 1 token
//		System.out.println(x);
//		System.out.println(b);
//		System.out.println(c);
	}
	
}
