package javalecture10;

public class Practice02 {

	public static void main(String[] args) {
		
		int num = 345;
		int ones = num % 10;
		num /= 10;
		int tens = num % 10;
		num /= 10;
		int hundreds = num % 10;
		
		System.out.println("ones: " + ones);
		System.out.println("tens: " +  tens);
		System.out.println("hundreds: " +  hundreds);
		System.out.println("Sum: " + (ones + tens + hundreds));

	}

}
