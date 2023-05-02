package javalecture6;

public class MainClass {

	public static void main(String[] args) {
		int year = 2023;
		System.out.println(year);
		
		// byte data type is a whole number between -128 and 127 and is of 8 bits (1 byte) size
		// short type is a whole number between -32,768 and 32,767 and is of 16 bits (2 byte) size
		// int type is a whole number between -2,147,483,648 and 2,147,483,647 and is of 32 bits (4 byte) size
		// long type is a whole number between -9,223,372,036,854,775,808 and 9,223,372,036,854,775,807 and is of 64 bits (8 byte) size
		byte age01 = 56;
		short age02 = 30000;
		int age03 = 2000000000;
		long age04 = 2147483648L;
		System.out.println(age01);
		System.out.println(age02);
		System.out.println(age03);
		System.out.println(age04);
		
		// float stores fractional numbers. Sufficient for storing 6 to 7 decimal digits. It is of 32 bits (4byte) size
		// double stores fractional numbers. Sufficient for storing 15 decimal digits. It is of 64 bits (8byte) size
		float height = 167.7F;
		double length = 153.2871D;
		System.out.println(height);
		System.out.println(length);
		
		char word = 'a';
		boolean isTrue = true;
		System.out.println(word);
		System.out.println(isTrue);
	}

}
