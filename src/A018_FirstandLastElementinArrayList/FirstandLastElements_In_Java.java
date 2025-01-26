package A018_FirstandLastElementinArrayList;

import java.util.ArrayList;

public class FirstandLastElements_In_Java {

	public static void main(String[] args) {

		ArrayList<Integer> array1 = new ArrayList<Integer>();

		array1.add(2);
		array1.add(4);
		array1.add(5);
		array1.add(45);
		array1.add(43);

		int first = array1.get(0);
		int last = array1.get(array1.size() - 1);

		System.out.println(first);
		System.out.println(last);

	}

}
