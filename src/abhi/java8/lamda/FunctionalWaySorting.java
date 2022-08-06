package abhi.java8.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FunctionalWaySorting {

	public static void main(String[] args) {

		System.out.println("Lamda Expression Syntax is ()->{Body};");
		System.out.println("----------------------------------------------------");

		List<Integer> list = Arrays.asList(10, 70, 40, 30, 50);
		System.out.println("Original List :"+list);
		System.out.println();
		
		Comparator<Integer> comparator = (o1, o2) -> -o1.compareTo(o2);
		Collections.sort(list, comparator);
		
//		Collections.sort(list, (o1, o2) -> -o1.compareTo(o2));
		
		System.out.println(list);
		System.out.println();
	}
}

	
/*
	public class SortingInFunctionalWay implements Comparator<Integer> 
	
	// Acs
	Collections.sort(list);
	System.out.println("Collections.sort(list); ==> "+list);
	System.out.println();
	
	// Desc
	SortingInFunctionalWay sortingInTraditionalWay = new SortingInFunctionalWay(); 
	Collections.sort(list, sortingInTraditionalWay);
	System.out.println("Collections.sort(list, sortingInTraditionalWay); ==> "+list);


	@Override
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}
*/