package stringSentence;
/*
 #3. WAP swap first word with last word in a sentence
 */
import java.util.Arrays;

public class Q3_SwapFirstWordWithLast {

	public static void main(String[] args) {
		String str = "I am Sumanth";
		String[] strArr = str.split(" ");
		String temp = strArr[0];
		strArr[0] = strArr[strArr.length - 1];
		strArr[strArr.length - 1] = temp;

		System.out.println(Arrays.toString(strArr));
	}

}
