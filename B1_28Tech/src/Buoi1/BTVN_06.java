package Buoi1;

import java.util.Scanner;

public class BTVN_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float Pi = sc.nextFloat();
		System.out.println(Math.ceil(Pi)); //làm tròn lên
		System.out.println(Math.floor(Pi)); //làm tròn xuống
		System.out.println(Math.round(Pi)); //làm tròn
	}

}
