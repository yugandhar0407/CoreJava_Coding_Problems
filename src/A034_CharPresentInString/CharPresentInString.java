package A034_CharPresentInString;

public class CharPresentInString {

	public static void main(String[] args) {

		String s = "Happy";

		char ch = 'p';
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ch) {
				flag = true;
			}
		}
		if (flag == true) {
			System.out.println("The Given Character Present: "+ch);
		} else {
			System.out.println("Not Present");
		}

	}

}
