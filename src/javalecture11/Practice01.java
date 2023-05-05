package javalecture11;

public class Practice01 {

	public static void main(String[] args) {
		
		int num = 25;
		boolean trial1 = num > 0 && num < 50;
		boolean trial2 = num >= 50 && num < 100;
		boolean trial3 = num > 0 && num < 50 && num % 2 == 0;
		boolean trial4 = num >= 50 && num < 100 && num % 2 == 0;
		boolean trial5 = num > 0 && num < 50 && num % 2 != 0;
		boolean trial6 = num >= 50 && num < 100 && num % 2 != 0;
		
		System.out.println(trial1);
		System.out.println(trial2);
		System.out.println(trial3);
		System.out.println(trial4);
		System.out.println(trial5);
		System.out.println(trial6);

	}

}
