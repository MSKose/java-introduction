package javalecture16;

public class MainClass {

	public static void main(String[] args) {
		
		String name1 = "John";
		String name20 = "David";
		String name21 = "David";
		String name22 = "david";
		
		System.out.println(name1.equals(name20));
		System.out.println(name1 == name20);
		
		System.out.println(name20.equals(name21));
		System.out.println(name20 == name21);
		
		
		System.out.println(name20 == name22);
		System.out.println(name20.equalsIgnoreCase(name22));

	}

}
