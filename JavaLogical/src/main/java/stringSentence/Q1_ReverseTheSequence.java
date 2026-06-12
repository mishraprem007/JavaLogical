package stringSentence;

/*
#1. ReverseTheSequence from I am a Student to Student a am I

 */
public class Q1_ReverseTheSequence {

	public static void main(String[] args) {

		String str = "I am a Student";
		String[] strArr = str.split(" ");

		for (int i = strArr.length - 1; i >= 0; i--) {
			System.out.print(strArr[i] + " ");
		}
	}

}
