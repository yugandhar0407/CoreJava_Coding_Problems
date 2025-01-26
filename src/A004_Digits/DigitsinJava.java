package A004_Digits;

/*
 *  Write a program to print count, sum, and product of digits?
 */
public class DigitsinJava {

	public static void main(String[] args) {

		// Count of Digits

		int n = 123456789;

		int count = 0;

		while (n != 0) {
			n = n / 10; // for getting the digits in n variable...
			count++;
		}

		System.out.println("Count of Digits are: " + count);

		// Sum of Digits

		int num = 987654321;

		int sum = 0;

		int lastdigit = 0;

		while (num != 0) {
			lastdigit = num % 10;
			sum = sum + lastdigit;
			num = num / 10;

		}

		System.out.println("Sum of Digits are: " + sum);

		// Product of digits

		int number = 5678;

		int product = 1;

		int lastdigit1 = 0;

		while (number != 0) {
			lastdigit1 = number % 10;

			product = product * lastdigit1;

			number = number / 10;
		}

		System.out.println("Product of Digits are: " + product);
	}

}
