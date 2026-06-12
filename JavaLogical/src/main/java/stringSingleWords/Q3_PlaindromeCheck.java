package stringSingleWords;

/*
 * #3.  write a java program to check if string is a plaindrome
 */
public class Q3_PlaindromeCheck {
	public static void main(String[] args) {
		String str = "mam";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			rev = rev + ch;
		}
		if (rev.equals(str)) {
			System.out.println(str + " is Plaindrome");
		} else {
			System.out.println(str + " is not Plaindrome");
		}
	}
}