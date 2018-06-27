package test;

import java.util.ArrayList;

/**
 * 2. Write a program to remove duplicate in a List.
 * 
 * @author
 *
 */
public class RemoveDuplicates {

	public static void main(String args[]) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(13);
		al.add(21);
		al.add(13);
		al.add(13);
		System.out.println("List with duplicate elements: " + al);
		removeDuplicateValue(al);
		System.out.println("List without duplicate elements: " + al);
	}

	private static ArrayList<Integer> removeDuplicateValue(ArrayList<Integer> lst) {
		Object[] st = lst.toArray();
	      for (Object s : st) {
	        if (lst.indexOf(s) != lst.lastIndexOf(s)) {
	            lst.remove(lst.lastIndexOf(s));
	         }
	      }
		return lst;
	}

}
