package A007_Factorial;

public class PracticeFactorial {

	public static void main(String[] args) {

		int i, fact = 1;

		int number = 10;

		for (i = 1; i <= number; i++) {

			fact = fact * i;
		}

		System.out.println("The factorial is: " + fact);
	}

}
