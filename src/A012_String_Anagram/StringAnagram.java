package A012_String_Anagram;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		//
		String str1 = "Army";
		String str2 = "Mary";
		// convert the two strings to lower case
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		// check if the two strings length is same or not
		if (str1.length() == str2.length()) {
			// convert the strings to char array
			char[] charArray1 = str1.toCharArray();
			char[] charArray2 = str2.toCharArray();
			// sort the two strings
			Arrays.sort(charArray1);
			Arrays.sort(charArray2);

			// if sorted char arrays are same, then the two strings are anagram
			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(str1 + " and " + str2 + " are anagram.");
			} else {
				System.out.println("Not an anagram");
			} 

		}

	}

}
