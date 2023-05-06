package javalecture17;

public class MainClass {

	public static void main(String[] args) {
		
		String langs = " English, Turkish, Dutch";
		
		System.out.println(langs.contains("Spanish"));
		System.out.println(langs.trim());
		System.out.println(langs.charAt(1));
		System.out.println(langs.replace("Dutch", "Spanish"));
		
		String name1 = "Joseph";
		String name2 = "Adam";
		
		System.out.println(name1.compareTo(name2)); // if positive (name2 > name1) alphabetically else (name2 < name1)

	}

}
