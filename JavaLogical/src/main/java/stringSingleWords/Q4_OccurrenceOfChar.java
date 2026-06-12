package stringSingleWords;

import java.util.LinkedHashMap;

/*
 * #4. Write a java program to find the occurrence of each character in a String
 */
public class Q4_OccurrenceOfChar {

	public static void main(String[] args) {

		String str = "aabbabac";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
	}

}
