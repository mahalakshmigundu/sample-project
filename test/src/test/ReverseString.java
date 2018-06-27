package test;

import java.util.Scanner;
/**
 *3. Reverse the string.
 * @author
 *
 */
public class ReverseString {
	
	private static Scanner s;

	public static void main(String args[]) {
		System.out.println("Enter the String:");
		s = new Scanner(System.in);
		String str = s.nextLine();
        System.out.println(stringReverse(str));
	}
	
	static String stringReverse(String str) {

		String b = "";
		for(int i=str.length()-1; i>=0;i--) {
			b=b+str.charAt(i);
		}
		return b;
	}
}
