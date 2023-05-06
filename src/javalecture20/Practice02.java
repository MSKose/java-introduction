package javalecture20;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int num1 = input.nextInt();
		
		System.out.println("Enter the second number: ");
		int num2 = input.nextInt();
		
		System.out.println("Your sum: " + (num1 + num2));
	}

}
