package test;

import java.util.Hashtable;

/**
 *  Two Sum
	E.g: [1,7,3,9,5] Sum:
    public int[] twoSum(int[] arr, int sum) {
        int[] arr = {1,7,3,9,5};
        int sum = 16;
    
        // find the two elements in the array. there sum = 16 and print the indexes.
    }
 * @author
 *
 */
public class FindTwoSumElements {

	public static void main(String args[]) {
		int[] arr = { 1, 7, 3, 9, 5 };
		int sum = 16;
		twoSum(arr, sum);
	}

	public static int[] twoSum(int[] arr, int sum) {

		Hashtable<Integer, Integer> ht = new Hashtable<>();
		for (int i = 0; i < arr.length - 1; i++) {
			int temp = sum - arr[i];
			if (temp > 0 && ht.containsKey(temp)) {
				System.out.println("Sum of Elements Values:" + temp + " " + arr[i]);
				System.out.println("Sum of Elements Index:" + ht.get(temp) + " " + i);

			}
			ht.put(arr[i], i);
		}
		return null;
	}
}
