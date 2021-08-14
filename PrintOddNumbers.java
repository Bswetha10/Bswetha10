package JavaMaven;

public class PrintOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int j = 0; j <= 10; j++) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
	}

}
