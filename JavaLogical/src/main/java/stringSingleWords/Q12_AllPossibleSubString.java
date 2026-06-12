package stringSingleWords;

/*
 * #12. WAP to find all possible substrings
 */
public class Q12_AllPossibleSubString {

	public static void main(String[] args) {
		String str = "sum";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				System.out.print(str.substring(i, j) + " ");
				
				/*
				 * Note:- s.substring(i, j) this method works like s.substring(i, j-1), it
				 * always exclude last value in substring, so we are giving = into the inner
				 * loop, to get all possible substring
				 *
				 */

			}
		}
	}
}
