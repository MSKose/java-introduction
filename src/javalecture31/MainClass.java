package javalecture31;

public class MainClass {

	public static void main(String[] args) {
		String languages = "TR,EN,RS,SP";
		
		String[] array = languages.split(",");
		
		for (int i = 0; i < array.length; i++) {			
			System.out.println(array[i]);
		}
		
		String text = "This is a sentence. This is a sentence. This is a sentence";
		
		String[] sentences01 = text.split(".");
		
		System.out.println(sentences01.length);
		
		String[] sentences02 = text.split("\\.");
		
		System.out.println(sentences02.length);

	}

}
