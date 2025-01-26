package A013_ReverseEachWordInAString;

public class ReverseEachWord {

	public static void main(String[] args) {

		String str = "reverse each word";

		String words[] = str.split("\\s");

		String reverseWord = "";

		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);

			sb.reverse();

			reverseWord = reverseWord + sb.toString() + " ";
		}
		System.out.println(reverseWord.trim());
		System.out.println();
		String s = "Java Programming";

		String str1[] = s.split(" ");

		String revString = "";

		for (int i = str1.length - 1; i >= 0; i--) {

			String s1 = str1[i];
			String revWord = "";

			for (int j = s1.length() - 1; j >= 0; j--) {

				revWord = revWord + s1.charAt(j);
			}
			revString = revString + revWord + " ";
		}
		System.out.println(revString);
	}

}
