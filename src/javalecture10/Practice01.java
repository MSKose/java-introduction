package javalecture10;

public class Practice01 {

	public static void main(String[] args) {
		
		int num1 = 25;
		int num2 = 30;
		
		boolean isEqual = num1 == num2;
		System.out.println(num1 + " = " + num2 + ": " + isEqual);

		boolean isBigger = num1 > num2;
		System.out.println(num1 + " > " + num2 + ": " + isBigger);
		
		boolean isSmaller = num1 < num2;
		System.out.println(num1 + " < " + num2 + ": " + isSmaller);
	}

}
