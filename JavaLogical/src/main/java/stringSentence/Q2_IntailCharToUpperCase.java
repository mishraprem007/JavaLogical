package stringSentence;
/*
 * #2. Convert initial Char ToUpper Case of each words
 */

public class Q2_IntailCharToUpperCase {

	public static void main(String[] args) {
		String str = "India is a champion";
		String[] strArr = str.split(" ");

		for (int i = 0; i < strArr.length; i++) {

			System.out.print(Character.toUpperCase(strArr[i].charAt(0)) + strArr[i].substring(1) + " ");
		}

	}

}
