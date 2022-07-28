package week3.day2Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindIntersectionUsingCollections {

	public static void main(String[] args) {
	
		int[] array1 = {3,2,11,4,6,7};
		int[] array2 = {1,2,8,4,9,7};

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (array1[i] == array2[j]) {
					arrayList.add(array1[i]);
				}
			}
		}
		Collections.sort(arrayList);
		System.out.println("Intersection of two arrays are: " + arrayList);
	}
}
