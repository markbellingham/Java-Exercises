package arrays;

import java.util.Arrays;

/**
 * Given an array of integers, find the largest 
 * product yielded from three of the integers 
 */
public class FindLargestProduct {
	
	// Greatest product is either (min1 * min2 * max3) or (max1 * max2 * max3)
	protected static int computeProduct(int numbers[]) {
		int lastElementIndex = numbers.length - 1;
		int product1 = 1; int product2 = 1;
				
		// Find max1 * max2 * max3
		for (int i = lastElementIndex; i > lastElementIndex - 3; i--) {
			product1 = product1 * numbers[i];
		}
		System.out.println("Product1: " + product1);
		
		// Find min1 * min2 * max3
		product2 = numbers[0] * numbers[1] * numbers[lastElementIndex];
		System.out.println("Product2: " + product2);
		
		if (product1 > product2) {
			return product1;
		} else {
			return product2;
		}
		
	}

	public static void main(String[] args) {
		
		int numbers[] = {-18, 5, 24, 40, 3, -13, -77};
		
		Arrays.sort(numbers);
		
		int largestProduct = computeProduct(numbers);
		
		System.out.println("The largest product of 3 values from the numbers array is " + largestProduct);
	}

}
