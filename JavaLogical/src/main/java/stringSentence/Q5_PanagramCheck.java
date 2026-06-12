package stringSentence;

import java.util.HashSet;

/*
#5. WAP to check if the given String is a panagrams
 */
public class Q5_PanagramCheck {

	public static void main(String[] args) {
		String str = "The quick brown fox jumps over the lazy dog".toLowerCase();
		HashSet set = new HashSet();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isAlphabetic(ch)) {
				set.add(ch);
			}
		}
		if (set.size() == 26) {
			System.out.println("is Panagram");
		} else {
			System.out.println("Not Panagram");
		}

	}
}
