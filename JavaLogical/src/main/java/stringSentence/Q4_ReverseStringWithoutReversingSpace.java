package stringSentence;

/*
#4. WAP to reverse a String without reversing spaces
 */
public class Q4_ReverseStringWithoutReversingSpace {

	public static void main(String[] args) {
		String str = "I love India";
		String str1 = str.replace(" ", "");
		int index = str1.length() - 1;

		for (int i = str.length() - 1; i >= 0; i--) {
			if (str.charAt(i) == ' ') {
				System.out.print(" ");
			} else {
				System.out.print(str1.charAt(index--));
			}
		}

	}
}
