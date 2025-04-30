package _03_char._2_string_methods;

import javax.swing.JOptionPane;

public class StringMethods {
	public static void main(String[] args) {
		
		// 1. Create a String variable and initialize it to contain a minimum of 3 characters
		String asdf = "Ichigo";
		int letter = 0;
		System.out.println(asdf.charAt(letter));
		System.out.println(asdf.length());
		for (int i = letter; letter<6;letter++){
			System.out.println(asdf.charAt(letter));
		}
		String letterz = JOptionPane.showInputDialog("What letter do you want?");
		if (letterz.equals("I")){
			System.out.println("I is at index 0");
		}
		if (letterz.equals("c")){
			System.out.println("c is at index 1");
		}
		if (letterz.equals("h")){
			System.out.println("h is at index 2");
		}
		if (letterz.equals("i")){
			System.out.println("i is at index 3");
		}
		if (letterz.equals("g")){
			System.out.println("g is at index 4");
		}
		if (letterz.equals("o")){
			System.out.println("o is at index 5");
		}
		// 2. Print the 3rd char of your String to the console.
		//    HINT: .charAt

		
		// 3. Print the length of your String to the console.
		//    HINT: .length()

		
		// 4. Using a for loop, print one char at time to the console.
		//    HINT: use .length() to determine how many loops

		
		// 5. Pick a char inside your String, and use a loop to determine
		//    what position/index in the String the char is located.
		//    Print the char's position to the console.
		//    EXAMPLE: if your string is "abc" and you are searching 
		//             for char 'b', then print "b is at index 1"
		
	}
}


