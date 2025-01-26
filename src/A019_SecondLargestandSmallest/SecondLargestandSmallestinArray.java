package A019_SecondLargestandSmallest;

import java.util.Arrays;

public class SecondLargestandSmallestinArray {

	public static void main(String[] args) {

		int[] array = { 2, 4, 5, 6, 7, 8, 9, 34, 5, 6, 77 };

		int num = array.length;

		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

		System.out.println("Second Largest: " + array[num - 2]);

		System.out.println("Second Smallest: " + array[1]);

	}

}
  