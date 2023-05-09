package javalecture21;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your height");
		float height = input.nextFloat();
		
		System.out.println("Please enter your weight");
		float weight = input.nextFloat();
		
		float bmi = weight / (height * height);
		
		System.out.println("Your body mass index is: " + bmi);
		
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		} else if (18.5 <= bmi && bmi < 25) {
			System.out.println("You are normal weight");
		} else if (25 <= bmi && bmi < 30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}

	}

}
