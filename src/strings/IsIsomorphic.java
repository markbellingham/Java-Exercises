package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * For two strings to be isomorphic, all occurrences of a character in string A can be replaced with another character
 * to get string B. The order of the characters must be preserved. There must be one-to-one mapping for ever char of
 * string A to every char of string B.
 */
public class IsIsomorphic {
	
	protected static boolean isIsomorphic(String s, String t) {
		//Check if the strings are the same length, if not they cannot be isomorphic
		if(s.length() != t.length()) { return false; }
		
	    Map<Character, Integer> m = new HashMap<Character, Integer>();
	    Map<Character, Integer> n = new HashMap<Character, Integer>();
	    
	    for (Integer i = 0; i < s.length(); i++)
	        if (m.put(s.charAt(i), i) != n.put(t.charAt(i), i))
	            return false;
	    return true;
	}

	public static void main(String[] args) {
		boolean first = isIsomorphic("egg", "add"); // true
		boolean second = isIsomorphic("paper", "title"); // true
		boolean third = isIsomorphic("kick", "side"); // false
		
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}
}
