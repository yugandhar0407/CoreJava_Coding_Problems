package A001_PrimeNumber;

import java.util.Scanner;

public class UserInputPrime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number");

		int number = sc.nextInt();

		boolean isPrime = true;

		if (number <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= Math.sqrt(number); i++) {
				if (number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		System.out.println(number + " is " + (isPrime ? " a Prime Number" : "Not a Prime Number"));

	}

}
