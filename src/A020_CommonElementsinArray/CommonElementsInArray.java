package A020_CommonElementsinArray;

import java.util.ArrayList;
import java.util.List;

public class CommonElementsInArray {

	public static void main(String[] args) {

		int[] array1 = { 2, 4, 6, 8 };
		int[] array2 = { 1, 2, 3, 4 };

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {

					list.add(array1[i]);

				}
			}
		}
		System.out.println("Common Elements: " + list);

	}

}
