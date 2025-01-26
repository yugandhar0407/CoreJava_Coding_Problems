package A017_SortingAnArray;

import java.util.Arrays;

public class SortingAnArray {

	public static void main(String[] args) {

		int temp;
		int size;

		int array[] = { 10, 2, 5, 20, 4, 78, 34, 23 };

		size = array.length;

//		// Inbuilt Method
//
//		Arrays.sort(array);
//
//		System.out.println("Sorted Array: " + Arrays.toString(array));
//
//		// third highest
//
//		int thirdMaxNum = array[size - 3];
//
//		System.out.println("Third Highest: " + thirdMaxNum);
//
       	for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
 
				if (array[i] > array[j]) {

					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}
		System.out.println("Sorted Array: ");
		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i] + " ");

		}

		// Print Third Largest Number of an Array
		System.out.println("\n" + "Third Largest Number: " + array[size - 3]);

	}

}
