package stringSingleWords;

/*
 * #16. Expand String - Print from a3b2a1c1 to aaabbac
 */
public class Q16_ExpandString {

	public static void main(String[] args) {
		String str = "a3b2a1c1";

		for (int i = 0; i < str.length(); i = i + 2) {
			int count = str.charAt(i + 1) - 48;

			char ch = str.charAt(i);
			for (int j = 1; j <= count; j++) {
				System.out.print(ch);
			}
		}

		/*
		 * -48 used to convert char into number
		 */

	}
}
