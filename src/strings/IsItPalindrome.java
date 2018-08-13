package strings;

/**
 * Check if a word or sentence is a palindrome.
 * Spaces should be ignored.
 */
public class IsItPalindrome {
	
	protected static boolean isPalindrome(String string) {
		String lettersOnly = string.toLowerCase().replaceAll(" +", "");
		String lettersReversed = reverseLetters(lettersOnly);
		return lettersOnly.equals(lettersReversed);
	}
	
	protected static String reverseLetters(String sentence) {
		String reversed = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reversed += sentence.charAt(i);
		}		
		return reversed;
	}

	public static void main(String[] args) {
		boolean racecar = isPalindrome("racecar");
		boolean race_car = isPalindrome("race car");
		
		System.out.println("Racecar is a palindrome? " + racecar);
		System.out.println("Race car is a palindrome? " + race_car);
	}

}
