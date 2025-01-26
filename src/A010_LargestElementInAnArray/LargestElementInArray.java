package A010_LargestElementInAnArray;

public class LargestElementInArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 25, 34, 56, 78, 99 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > max)

				max = arr[i];

		}

		System.out.println("Largest Element: " + max);

	}

}
