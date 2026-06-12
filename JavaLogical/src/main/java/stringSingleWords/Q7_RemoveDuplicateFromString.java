package stringSingleWords;

/*
 * #7. WAP to remove duplicate from a String
 */
import java.util.LinkedHashSet;

public class Q7_RemoveDuplicateFromString {

	public static void main(String[] args) {

		String str = "aabbabac";

		LinkedHashSet set = new LinkedHashSet();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch);
		}
		System.out.println(set);
	}

}
