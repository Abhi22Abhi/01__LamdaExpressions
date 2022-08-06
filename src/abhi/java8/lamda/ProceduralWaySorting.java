package abhi.java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProceduralWaySorting implements Comparator<Integer> {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(10, 70, 40, 30, 50);
		System.out.println(list);
		System.out.println();

		// Acs
		Collections.sort(list);
		System.out.println("Collections.sort(list); ==> "+list);
		System.out.println();
		
		// Desc
		ProceduralWaySorting sortingInTraditionalWay = new ProceduralWaySorting(); 
		Collections.sort(list, sortingInTraditionalWay);
		System.out.println("Collections.sort(list, sortingInTraditionalWay); ==> "+list);
	}

	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}

}
