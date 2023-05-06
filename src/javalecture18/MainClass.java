package javalecture18;

public class MainClass {

	public static void main(String[] args) {
		
		String langs = "English, Turkish, Dutch";
		
		String lang1 = langs.substring(0,7);
		String lang2 = langs.substring(9,16);
		String lang3 = langs.substring(18);
		
		System.out.println(lang1);
		System.out.println(lang2);
		System.out.println(lang3);

	}

}
