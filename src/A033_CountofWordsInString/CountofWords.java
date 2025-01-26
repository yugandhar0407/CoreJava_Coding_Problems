package A033_CountofWordsInString;

public class CountofWords {

	public static void main(String[] args) {

		String s = "go to Jspiders";

		String str[] = s.split(" ");

		int count = 0;

		for (int i = 0; i < str.length; i++) {
			count++;
		}

		System.out.println(count + " Number of words are present");

	}

}
