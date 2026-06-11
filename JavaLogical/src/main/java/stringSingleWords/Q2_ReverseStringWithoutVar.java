package stringSingleWords;

/*
 * #2. Write a java program to reverse a string without using extra variable
 */
public class Q2_ReverseStringWithoutVar {

	public static void main(String[] args) {

		String str = "Testing";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			System.out.print(ch);
		}

	}

}
