package week3.day2Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";
		String[] str = text.split(" ");
		Set<String> uniquestr = new LinkedHashSet<String>();
		for (int i = 0; i < str.length; i++) {
			uniquestr.add(str[i]); //only unique string be added
		}
		String str1 = String.join(" ", uniquestr);//joins the string with the given delimiter
		System.out.println(str1);
	}
}


