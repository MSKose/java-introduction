package javalecture20;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String name = input.next();
		
		System.out.println("Please enter your age:");
		int  age = input.nextInt();
		
		System.out.println("Your name: " + name);
		System.out.println("Your age: " + age);

	}

}
