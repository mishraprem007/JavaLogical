package stringSingleWords;

/*
 *#15. Compress String - Repetition of same char in running sequence
 */
public class Q15_CompressString {

	public static void main(String[] args) {
		String str = "aabbabaccc";
		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				count++;

			} else {
				System.out.println(str.charAt(i) + " count " + count);
				count = 1;
			}
		}
		System.out.println(str.charAt(str.length() - 1) + " count " + count);
	}

}