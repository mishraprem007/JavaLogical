package stringSingleWords;

/*
 * #9. WAP to find the number of alphabets,digits and special char in a String
 */
public class Q9_CountEachTypeOfChar {

	public static void main(String[] args) {

		String str = "abc123@";
		int alpha = 0;
		int digit = 0;
		int specailChar = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digit++;
			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alpha++;
			} else {
				specailChar++;
			}
		}

		System.out.println("alpha " + alpha);
		System.out.println("digit " + digit);
		System.out.println("specailChar " + specailChar);

	}

}
