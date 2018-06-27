package walmart;

import java.util.HashMap;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String arg[]) {
		System.out.println("Enter the string value:");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();

		HashMap<Character, Integer> has = new HashMap<>();

		for (int i = 0; i < s.length() - 1; i++) {
			int count = 0;
			char temp = s.charAt(i);
			if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
				if (has.containsKey(temp)) {
					int value = has.get(temp);
					value++;
					has.replace(temp, value);
				} else {
					count++;
					has.put(temp, count);
				}
			}
		}
		System.out.println("Characte and its count:" + has);
	}
}
