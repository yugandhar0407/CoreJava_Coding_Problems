package A016_CountingOccurencesInaSentence;

public class CountingOccurences {

	public static void main(String[] args) {

		String str = "Java is a Programming Language. Java is widely used language";

		String[] words = str.toLowerCase().split(" ");

		String word = "java";

		int repeats = 0;

		for (int i = 0; i < words.length; i++)

			if (words[i].equals(word))
				repeats++;

		System.out.println(repeats);

	}

}
