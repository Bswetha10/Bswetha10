package JavaMaven;

import java.util.Arrays;
import java.util.HashSet;

public class Assig2Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Integer[] arr2 = { 1, 3, 5, 7, 9 };

		HashSet<Integer> set = new HashSet<Integer>();

		set.addAll(Arrays.asList(arr1));

		set.retainAll(Arrays.asList(arr2));

		System.out.println(set);

		Integer[] intersection = {};
		intersection = set.toArray(intersection);

		System.out.println(Arrays.toString(intersection));
	}

}
