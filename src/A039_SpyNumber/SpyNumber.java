package A039_SpyNumber;

public class SpyNumber {

	public static void main(String[] args) {

		int n = 1124;

		int sum = 0;

		int product = 1;

		int temp = n;

		int lastdigit = 0;

		while (temp != 0) {

			lastdigit = temp % 10;

			sum += lastdigit;

			product *= lastdigit;

			temp /= 10;
		}

		if (sum == product) {
			System.out.println("Spy Number");
		} else {
			System.out.println("Not a Spy Number");
		}

	}

}
