package javalecture20;

import java.util.Scanner;

public class Practice03 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Your mid-term results: ");
		int midTerms = input.nextInt();
		
		System.out.println("Your final results: ");
		int finals = input.nextInt();
		
		int avg = midTerms * 40/100 + finals * 60/100;
		
		System.out.println("Your average: " + avg);

	}

}
