package problem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	Product p1 = new Product(01,"Pen", 5, 50);
	Product p2 = new Product(02,"Book", 1, 150);
	Product p3 = new Product(03,"Pencil",7, 10);
	Product p4 = new Product(04,"Copy",3, 20);
	Product p5 = new Product(05,"Rubber",20, 5);
	
	List<Product> list = Arrays.asList(p1,p2,p3,p4,p5);
	
	Collections.sort(list, (a,b)-> b.getPrice()-a.getPrice());
	list.forEach(System.out::println);
}
}
