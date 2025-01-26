package A002_FibanocciSeries;

import java.util.Scanner;

public class UserInputFibanocci {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number of terms");

		int n = sc.nextInt();

		int a = 0, b = 1;

		System.out.println("Fibanocci Series: ");

		for (int i = 1; i <= n; i++) {
			System.out.println(a + " ");

			int next = a + b;
			a = b;
			b = next;
		}
	}

}
