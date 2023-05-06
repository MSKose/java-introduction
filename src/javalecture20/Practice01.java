package javalecture20;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a byte: ");
		byte val1 = input.nextByte();
		
		System.out.println("Enter a short: ");
		short val2 = input.nextShort();
		
		System.out.println("Enter a Int: ");
		int val3 = input.nextInt();
		
		System.out.println("Enter a long: ");
		long val4 = input.nextLong();
		
		System.out.println("Enter a float: ");
		float val5 = input.nextFloat();
		
		System.out.println("Enter a double: ");
		double val6 = input.nextDouble();
		
		System.out.println("Enter a boolean: ");
		boolean val7 = input.nextBoolean();
		
		System.out.println("Enter a char: ");
		char val8 = input.next().charAt(0);
		
		System.out.println("Byte: " + val1);
		System.out.println("Short: " + val2);
		System.out.println("Int: " + val3);
		System.out.println("Long: " + val4);
		System.out.println("Float: " + val5);
		System.out.println("Double: " + val6);
		System.out.println("Boolean: " + val7);
		System.out.println("Char: " + val8);
		
		

	}

}
