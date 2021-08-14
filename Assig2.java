package JavaMaven;

import java.util.Arrays;

public class Assig2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		String a = "rat";
		String b = "tar";

		a = a.toLowerCase();
		b = b.toLowerCase();

		if (a.length() != b.length()) {
			System.out.println("Both the strings are not anagram");
		} else {

			char[] string1 = a.toCharArray();
			char[] string2 = b.toCharArray();

			Arrays.sort(string1);
			Arrays.sort(string2);

			if (Arrays.equals(string1, string2) == true) {
				System.out.println("Both the strings are anagram");
			} else {
				System.out.println("Both the strings are not anagram");
			}

		}

	}
}
