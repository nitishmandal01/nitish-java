package problem1;

import java.util.*;

public class Main {
public static void main(String[] args) {
	Employee  emp1=new Employee(1, "Nitish", "Delhi", 6000);
	Employee emp2 = new Employee(2, "Naman", "UP", 5000); 
	Employee emp3 = new Employee(3, "Kajal", "UP", 6000); 
	Employee emp4 = new Employee(4, "Pankaj", "UP", 7500); 
	Employee emp5 = new Employee(5, "Ram", "UP", 8500); 
	Employee emp6 = new Employee(6, "Raju", "UP", 5500); 
	Employee emp7 = new Employee(7, "Hari", "UP", 14500); 
	Employee emp8 = new Employee(8, "Hoshiyar", "UP", 24500); 
	Employee emp9 = new Employee(9, "Jun", "UP", 6500); 
	Employee emp10 = new Employee(10, "Kim", "UP", 7500); 
	
	List<Employee> empList = Arrays.asList(emp1,emp2,emp3,emp4,emp5,emp6,emp7,emp8,emp9,emp10);
	
	empList.forEach(emp -> {
		if(emp.getSalary()<5000) {
			emp.setSalary(emp.getSalary()+1000);
		}
	});
	
	//Printing Simple list
	System.out.println(empList);
	
//	Printing with Method Refrence
	empList.forEach(e -> System.out.println(e));
}
}
