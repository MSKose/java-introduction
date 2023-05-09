package javalecture21;

import java.util.Scanner;

public class Practice02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many cups of tea are you drinking?");
		double cups = input.nextDouble();
		
		System.out.println("How many sugar cubes are your using for your tea cups?");
		double sugar = input.nextDouble();
		
		double yearly = cups * sugar * 3 * 365 / 1000;
		
		if (cups == 0) {
			System.out.println("Man, you aint even drinking tea");
		} else if (sugar == 0) {
			System.out.println("Congrats on a healthy diet");
		} else {			
			System.out.println("Your yearly sugar intake in grams are: " + yearly);
		}
		

	}

}
