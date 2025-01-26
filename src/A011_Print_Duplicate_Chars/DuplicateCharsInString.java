package A011_Print_Duplicate_Chars;

public class DuplicateCharsInString {

	public static void main(String[] args) {

		String str = "Apple is Fruit";

		char[] carry = str.toCharArray();

		System.out.println("The String is: " + str);

		for (int i = 0; i < str.length(); i++) {

			for (int j = i + 1; j < str.length(); j++) {

				if (carry[i] == carry[j]) {

					System.out.print(carry[j] + "");
					break;
				}
			}
		}

	}

}
 