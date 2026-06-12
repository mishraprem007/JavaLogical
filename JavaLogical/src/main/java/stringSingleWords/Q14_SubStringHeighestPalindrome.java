package stringSingleWords;

/*
 * #14. WAP to find all possible substrings whose are plaindrome and length is highest
 */
public class Q14_SubStringHeighestPalindrome {

	public static void main(String[] args) {
		String str1 = "aabbabc";
		int length = 0;
		String str4 = "";
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) {
				String str2 = str1.substring(i, j);
				String str3 = new StringBuilder(str2).reverse().toString();
				if (str2.equals(str3) && length < str2.length()) {
					length = str2.length();
					str4 = str2;
				}
			}
		}
		System.out.println(str4);
	}
}