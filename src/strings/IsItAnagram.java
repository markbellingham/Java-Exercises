package strings;

import java.util.Arrays;

/**
 * Given two words check if they are an anagram of each other
 */
public class IsItAnagram {
	
	protected static boolean isItAnagram(String first, String second) {
		String firstLower = first.toLowerCase();
		String secondLower = second.toLowerCase();
		
		String[] firstArray = firstLower.split("");
		Arrays.sort(firstArray);
		
		String[] secondArray = secondLower.split("");
		Arrays.sort(secondArray);		
		
		return Arrays.equals(firstArray, secondArray);
	}

	public static void main(String[] args) {
		String first = "Mary";
		String second = "Army";
		
		boolean answer = isItAnagram(first, second);
		System.out.println("The words: " + first + " and " + second + " are anagrams? " + answer);
	}

}
