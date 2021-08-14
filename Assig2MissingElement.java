package JavaMaven;

import java.util.Arrays;

public class Assig2MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 6, 3, 2, 4, 1 };
		Arrays.sort(arr);
		System.out.println("Missing Number is : " + getMissingNumber(arr));
	}

	private static Integer getMissingNumber(int[] arr) {
		Integer missed = null;
		for (int i = 0; i < arr.length; i++) {
			int index = i + 1;
			if (arr[i] != index) {
				missed = index;
				break;
			}
		}
		return missed;
	}

}
