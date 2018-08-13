package arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Removing duplicates of an array and returning an array of only unique elements
 */
public class RemoveDuplicates {
	
	protected static int[] removeDuplicates(int[] numbers) {
		ArrayList<Integer> uniqueArrayList = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			if(!uniqueArrayList.contains(numbers[i])) {
				uniqueArrayList.add(numbers[i]);
			}
		}
		
		// Convert back to primitive array
		int[] uniqueArray = new int[uniqueArrayList.size()]; int i = 0;
		for (Integer n : uniqueArrayList) {
			uniqueArray[i++] = n;
		}
		
		return uniqueArray;
	}

	public static void main(String[] args) {
		int numbers[] = {1, 2, 3, 5, 1, 5, 9, 1, 2, 8};
		
		int[] uniqueArray = removeDuplicates(numbers);
		
		Arrays.sort(uniqueArray);
		
		System.out.println("Original array: " + Arrays.toString(numbers));
		System.out.println("Duplicates removed: " + Arrays.toString(uniqueArray));
	}

}
