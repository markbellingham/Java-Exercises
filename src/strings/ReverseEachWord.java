package strings;

/**
 * Reverse each word in a sentence keeping the order of the words the same
 */
public class ReverseEachWord {
	
	protected static String reverseLetters(String sentence) {
		String reversed = "";
		for (int i = sentence.length() - 1; i >= 0; i--) {
			reversed += sentence.charAt(i);
		}		
		return reversed;
	}
	
	protected static String reverseSentence(String sentence) {
		String reversed = "";
		
		String[] sentenceArray = sentence.split(" ");
		
		for (int i = sentenceArray.length - 1; i >= 0; i--) {
			reversed += (sentenceArray[i] + " ");
		}
		
		return reversed;
	}

	public static void main(String[] args) {
		String sentence = "Welcome to this Java Guide!";
		
		String lettersReversed = reverseLetters(sentence);
		
		String sentenceReversed = reverseSentence(lettersReversed);
		
		System.out.println("The sentence reversed is: " + sentenceReversed);
	}

}
