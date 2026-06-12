package stringSingleWords;

/*
 *#13. WAP to find all possible substrings whose length is greater than or equal to 2
 */
public class Q13_AllPossibleSubStringWithCondition {

	public static void main(String[] args) {

		String str = "sum";

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				String subStr = str.substring(i, j);
				if (subStr.length() >= 2) {
					System.out.print(subStr + "  ");
				}
			}
		}

	}

}
