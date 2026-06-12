package stringSingleWords;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

/*
 *#6. Write a java program to print only duplicate char
 */
public class Q6_PrintDuplicateChar {

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

		for (Entry<Character, Integer> entryMap : map.entrySet()) {
			if (entryMap.getValue() > 1) {
				System.out.println(entryMap.getKey() + "  " + entryMap.getValue());
			}
		}

	}

}
