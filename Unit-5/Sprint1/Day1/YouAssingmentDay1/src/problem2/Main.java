package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
public static void main(String[] args) {
	List<String> cities = Arrays.asList("UP","Delhi","UK","Bihar","Kerela");
	
	Collections.sort(cities, (a,b) -> b.compareTo(a));
	
//	InThe sort method takes 2 argumenst: 1 is the liost whch have to be sorted
//	2nd the comparator object in which
	System.out.println(cities);
	
	
	}
}
