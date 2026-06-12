package stringSingleWords;

/*
 * #8. WAP to find the sum of numbers in a string
 */
public class Q8_SumOfNumInString {

	public static void main(String[] args) {

		String str = "a8bc123";
		int numCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= '0' && ch <= '9') {
				numCount = numCount + (ch - 48);
			}
		}
		System.out.println(numCount);
	}
}
