package A001_PrimeNumber;

public class PracticePrime {

	public static void main(String[] args) {

		int n = 23;

		int count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}

		if (count == 2) {
			System.out.println(n + " is a Prime Number");
		} else {
			System.out.println(n + " is not a Prime Number");
		}

	}

}
