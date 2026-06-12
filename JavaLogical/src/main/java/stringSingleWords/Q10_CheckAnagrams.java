package stringSingleWords;

import java.util.Arrays;

/*
 *#10. WAP to check if given two strings are anagrams
 */
public class Q10_CheckAnagrams {

	public static boolean checkAnagramString(String str1, String str2) {

		boolean flag = true;
		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if (Arrays.equals(ch1, ch2)) {
			} else {
				flag = false;
			}

		} else {
			flag = false;
		}
		if (flag == true) {
			System.out.println(str1 + " and " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}
		return flag;

	}

	public static void main(String[] args) {
		checkAnagramString("Read", "Dear");
		/*
		 * 2nd approach- below
		 */

		String str1 = "Read";
		String str2 = "Dear";
		boolean flag = true;

		if (str1.length() == str2.length()) {
			char[] ch1 = str1.toLowerCase().toCharArray();
			char[] ch2 = str2.toLowerCase().toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			if (Arrays.equals(ch1, ch2)) {

			} else {
				flag = false;
			}

		} else {
			flag = false;

		}
		if (flag == true) {
			System.out.println(str1 + " and " + str2 + " are  anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not  anagram");
		}

	}

}
