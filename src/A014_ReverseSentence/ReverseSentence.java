package A014_ReverseSentence;

public class ReverseSentence {

	public static void main(String[] args) {

		String str[] = "India is Country My".split(" ");

		String reverse = " ";

		for (int i = str.length - 1; i >= 0; i--) {

			reverse = reverse + str[i] + " ";
		}

		System.out.println(reverse);

		System.out.println();

		String s = "Java Programming";

		String str1[] = s.split(" ");

		for (int i = str1.length - 1; i >= 0; i--) {

			System.out.print(str1[i] + " ");
		}

	}

}
