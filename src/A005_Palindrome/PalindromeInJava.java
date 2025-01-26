package A005_Palindrome;

/*
 * Write a program to find the given number is a palindrome or not?
 * 
 * Palindrome Number: A Palindrome Number is a number that reads the same in forward and backword.
 * 
 * Ex: 121, 131, 132231. etc,.
 */

public class PalindromeInJava {

	public static void main(String[] args) {

		int n = 123321;

		int temp = n;

		int reversenum = 0;

		while (temp != 0) {
			
			int lastdigit = temp % 10;

			reversenum = reversenum * 10 + (lastdigit);

			temp = temp / 10;

		}

		if (n == reversenum) {
			System.out.println(reversenum + " is a Palindrome");
		} else {
			System.out.println(reversenum + " is not a Palindrome");
		}

	}

}
