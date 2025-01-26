package A021_RemoveSpacesFromString;

import java.util.Scanner;

public class RemoveSpacesFromString {

	public static void main(String[] args) {

		System.out.println("Enter a String");

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		System.out.println("Original String: " + input);

		input = input.replaceAll("\\s", "");

		System.out.println("Removed String: " + input);

	}

}
