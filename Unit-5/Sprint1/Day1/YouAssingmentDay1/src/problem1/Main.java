package problem1;

import java.util.*;

public class Main {
public static void main(String[] args) {
	List<Employee> list = new ArrayList<>();
	list.add(new Employee(1, "Nitish", "Delhi", 8500));
	list.add(new Employee(2, "abc", "UK", 4500));
	list.add(new Employee(3, "def", "UP", 5000));
	list.add(new Employee(4, "ghi", "MP", 6000));
	list.add(new Employee(5, "jkl", "Goa", 3500));
	
	list.forEach(e -> {
		int salary= e.getSalary();
		
		if(salary<5000) {
			int increasedSalary = e.getSalary()+1000;
			e.setSalary(increasedSalary);
		}
	});
	
	list.forEach(emp -> System.out.println(emp));
	
}
}
