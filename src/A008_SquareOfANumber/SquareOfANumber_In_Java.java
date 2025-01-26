package A008_SquareOfANumber;

public class SquareOfANumber_In_Java {

	public static int calculateSquare(int num) {

		int result = 0;

		int absNum = Math.abs(num);

		for (int i = 0; i < absNum; i++) {
			result += absNum;
		}

		return num < 0 ? -result : result;
	}

	public static void main(String[] args) {

		int number = 4;

		int squared = calculateSquare(number);

		System.out.println(squared);

	}

}
