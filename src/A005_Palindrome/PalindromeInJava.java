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
		// initialize a number with int data type with variable n
		int n = 123321;
		// initialize a variable temp and assign to the n value
		int temp = n;
		// initialize a variable reversenum which is assigned to 0
		int reversenum = 0;
		// infinite while loop to iterate the temp variable until not equal to 0
		while (temp != 0) {
			// initialize a variable lastdigit and find the last digit of the temp value
			int lastdigit = temp % 10;
			// here the reversenum  multiples with 10 and add with lastdigit
			reversenum = reversenum * 10 + (lastdigit);
			// now the temp divides by 10
			temp = temp / 10;

		}
		// if the n is equales to the reversenum then it is a palindrome
		if (n == reversenum) {
			System.out.println(reversenum + " is a Palindrome");
		} else {
			System.out.println(reversenum + " is not a Palindrome");
		}

	}

}
