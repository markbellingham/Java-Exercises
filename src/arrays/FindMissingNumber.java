package arrays;

/**
 * Given an unsorted array containing n - 1 of n consecutive numbers
 * where the bounds are defined, find the missing number in o(n) time
 */
public class FindMissingNumber {
	
	protected static int findMissingNumber(int numbers[], int upperBound, int lowerBound) {
		// Find the sum of the numbers in the given array
		int sumOfNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumOfNumbers += numbers[i];
		}
		
		int theoreticalSum = 0;
		// Find the sum of numbers if all were present
		for (int i = lowerBound; i <= upperBound; i++) {
			theoreticalSum += i;
		}
		
		return theoreticalSum - sumOfNumbers;
	}

	public static void main(String[] args) {
		int numbers[] = {2, 5, 1, 4, 9, 6, 8, 7};
		int upperBound = 9;
		int lowerBound = 1;
		
		int missingNumber = findMissingNumber(numbers, upperBound, lowerBound);
		System.out.println("The missing number in the array is: " + missingNumber);
	}

}
