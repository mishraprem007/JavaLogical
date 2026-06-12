package stringSingleWords;

import java.util.ArrayList;

/*
 * #17. Balanced String- For every opening parenthesis there is a matching closed parenthesis is called BalanedString.
 */
public class Q17_BalancedString {

	public static void main(String[] args) {
		String str = "[{}()]";

		ArrayList<Character> list = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (list.size() > 0 && (str.charAt(i) == ')' && list.get(list.size() - 1) == '(')
					|| (str.charAt(i) == '}' && list.get(list.size() - 1) == '{')
					|| (str.charAt(i) == ']' && list.get(list.size() - 1) == '[')) {
				list.remove(list.size() - 1);
			} else {
				list.add(str.charAt(i));
			}

		}
		if (list.isEmpty()) {
			System.out.println("Balanced");
		} else {
			System.out.println("Not Balanced");
		}
	}
}
