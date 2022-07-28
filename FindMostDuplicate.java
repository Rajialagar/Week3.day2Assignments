package week3.day2Assignments;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindMostDuplicate {

	public static void main(String[] args) {

		int firstDupOccurance = 0;
		char firstDupChar = 0;

		String input = "abbaba";
		char[] ch = input.toCharArray();
		Map<Character, Integer> dup = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (dup.containsKey(ch[i])) {
				dup.put(ch[i], dup.get(ch[i])+ 1);
				if(dup.get(ch[i])>firstDupOccurance) {
					firstDupChar = ch[i];
					firstDupOccurance = dup.get(ch[i]);
				}
			}else {
				dup.put(ch[i], 1);

			}
		}
		System.out.println("The most duplicate character: " + firstDupChar);

	}
}
