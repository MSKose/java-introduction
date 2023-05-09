package javalecture21;

import java.util.Random;

public class Practice03 { 
	 public static void main(String[] args) {		
		 Random rnd = new Random();
		 
		 int num = rnd.nextInt(3); 
		 // the int you pass in as a parameter to nextInt not inclusive. Thus, for this one we'll either get 0, 1, or 2  
		 
		 System.out.println(num);
	}
}
