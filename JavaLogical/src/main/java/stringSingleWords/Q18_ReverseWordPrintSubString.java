package stringSingleWords;
/*
 #18. WAP to reverse a word and print the substring
 */
public class Q18_ReverseWordPrintSubString {

	public static void main(String[] args) {

		String str = "Hello";
		str = new StringBuilder(str).reverse().toString();

		for (int i = 1; i <= str.length(); i++) {
			System.out.println(str.substring(0, i));
		}
		/*
		 * We are using = here because substring exclude last boundary value
		 */
	}
}
