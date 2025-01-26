package A015_DuplicatesInArray;

import java.util.HashSet;

public class DupliccatesInArray {

	public static void main(String[] args) {
		String[] strArray = { "abc", "mno", "abc", "xyz", "pqr", "stw", "xyz" };

		HashSet<String> hs = new HashSet<String>();

		System.out.println("The Duplicates are: ");

		for (String arrayElement : strArray) {

			if (!hs.add(arrayElement)) {

				System.out.println(arrayElement);

			}

		}
	}

}
