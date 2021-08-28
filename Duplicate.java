package week3Assig;

import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "PayPal India";
		String text1 = text.toLowerCase();
		String text2 = text1.replaceAll(" ", "");
		char ch[] = text2.toCharArray();
		Set<Character> CharSet = new LinkedHashSet<Character>();
		Set<Character> DupCharSet = new LinkedHashSet<Character>();
		for (char c : ch) {
			boolean add = CharSet.add(c);
			if (add == false) {
				DupCharSet.add(c);
			}
		}
		System.out.println("Duplicate character:" + DupCharSet);
		CharSet.removeAll(DupCharSet);
		System.out.println("Character:" + CharSet);
		for (Character str : CharSet) {
			System.out.println(str);
		}

	}

}
