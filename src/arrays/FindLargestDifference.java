package arrays;

/**
 * Find largest difference between two elements such that
 * the element of lesser value must come before the greater element
 */
public class FindLargestDifference {
	
	protected static int findLargestDifference(int[] numbers) {
		
		// If there is only one element there is no difference
		if(numbers.length <= 1) { return -1; }
		
		int currentMin = numbers[0];
		int currentMaxDifference = 0;
		
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > currentMin && (numbers[i] - currentMin > currentMaxDifference)) {
				currentMaxDifference = numbers[i] - currentMin;
			} else if (numbers[i] < currentMin) {
				currentMin = numbers[i];
			}
		}
		
		if (currentMaxDifference <= 0) { return -1; }
		
		return currentMaxDifference;
	}

	public static void main(String[] args) {
		
		// Returns 11 not 14 because 15 comes before 1
		int[] numbers = {7, 8, 4, 9, 15, 3, 1, 10};
		
		int maxDifference = findLargestDifference(numbers);
		
		System.out.println("The maximum difference according to the rules is: " + maxDifference);
	}

}
