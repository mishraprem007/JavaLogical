package stringSingleWords;

/*
 *#11.  WAP to swap 2 string without using a third variable
 */
public class Q11_SwapStringWithoutVar {

	public static void main(String[] args) {

		String str1 = "Selenium";
		String str2 = "Java";

		System.out.println("Before swapping:");
		System.err.println("str1: " + str1);
		System.err.println("str2: " + str2);

		str1 = str1 + str2; // SeleniumJava
		str2 = str1.substring(0, str1.length() - str2.length()); // 0,8 ==> Selenium
		str1 = str1.substring(str2.length());

		System.out.println("After swapping:");
		System.err.println("str1: " + str1);
		System.err.println("str2: " + str2);

	}

}
