package test;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Scanner;
/**
 * 1. Given a string s, the task is to find the first repeated character in it and find the index.
        Example: Input:  s = "walmart culture",  Output: a and index = 1 and character = a
 *
 */
public class FirstRepeatedCharacter {
	
	private static Scanner s;

	public static void main(String args[]) {
		System.out.println("Enter the String:");
		s = new Scanner(System.in);
		String str = s.nextLine();
        System.out.println(firstRepeatingIndex(str));
	}
	static char firstRepeatingChar(String str)
    {
        char[] arr = str.toCharArray();
        // Creates an empty hashset
        HashSet<Character> h = new HashSet<>();
 
        // Traverse the input array from left to right
        for (int i=0; i<=arr.length-1; i++)
        {
            char c = arr[i];
 
            // If element is already in hash set, update x
            // and then break
            if (h.contains(c))
                return c;
 
            else // Else add element to hash set
                h.add(c);
        }
 
        return '\0';
    } 
	
	static int firstRepeatingIndex(String str) {

        char[] arr = str.toCharArray();
        
		Hashtable<Character, Integer> ht=new Hashtable<>();
		
		for(int i=0; i<=arr.length-1;i++) {
			char c=arr[i];
			if(ht.containsKey(c)) {
				return ht.get(c);
			}else {
				ht.put(c,i);
			}
		}
		return -1;
	}
}
