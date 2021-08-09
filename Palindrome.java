package week1day2.Strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		//System.out.println(s.length());
		String rev = "";
		for (int i = s.length()-1; i >= 0; i--) {
			rev = rev + s.charAt(i);

		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Given String is Palindrome ");
		}
		else
			System.out.println("Given String is not Palindrome ");
	}
}
/*
 * Pseudo Code
 * 
 * a) Declare A String value as"madam"
 * 
 * b) Declare another String rev value as "" c) Iterate over the String in
 * reverse order d) Add the char into rev e) Compare the original String with
 * the reversed String, if it is same then print palinDrome
 * 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String
 */