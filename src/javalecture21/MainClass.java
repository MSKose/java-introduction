package javalecture21;

public class MainClass {

	public static void main(String[] args) {
		long num = 782364;
		
		if (num < 1983649813) {
			System.out.println("Yup");
		} else {
			System.out.println("Nope");
		}
		
		String languages = "Spanish, English, Turkish";
		
		if (languages.contains("Spanish")) {
			System.out.println("It contains Spanish");
		}
		
		String gender = "Female";
		int age = 25;
		
		if (age > 20 && gender.equals("Male")) {
			System.out.println("You may enlist");
		} else {			
			System.out.println("You may not enlist");
		}

	}

}
