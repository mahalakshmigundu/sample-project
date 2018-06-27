package test;

import java.util.Scanner;

/**
 * 3. Reverse the string.
 * 
 * @author
 *
 */
public class FibonacciSeries {

	private static Scanner s;
	static int n1 = 0, n2 = 1, n3 = 0;

	public static void main(String args[]) {
		System.out.println("Enter the Integer:");
		s = new Scanner(System.in);
		int i = s.nextInt();
		System.out.print(n1+" "+n2);
		printFibonacci(i-2);
	}

	static void printFibonacci(int count) {
		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			printFibonacci(count - 1);
		}
	}
}
