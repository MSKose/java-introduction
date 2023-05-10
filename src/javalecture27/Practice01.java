package javalecture27;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("First num: ");
		int s1 = input.nextInt();
		

		System.out.println("Second num: ");
		int s2 = input.nextInt();
		
		int bigNum = s2 > s1 ? s2 : s1;
		
	}

}
