package JavaMaven;

public class Assing2OddIndexToUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "swetha babu";

		StringBuffer updatedString = new StringBuffer();

		char[] characters = sample.toCharArray();

		for (int index = 0; index < characters.length; index++) {

			char c = characters[index];

			if (index % 2 != 0) {

				c = Character.toUpperCase(c);
			}

			updatedString.append(c);
		}
		System.out.println("Modified string is: " + updatedString.toString());
	}

}
