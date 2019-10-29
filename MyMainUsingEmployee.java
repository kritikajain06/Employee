package com.sid.demo;

import java.util.ArrayList;
import java.util.List;

public class MyMainUsingEmployee {
	public static void main(String args[]) {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(101, "sid", "IT", "Developer", 48843));
		employeeList.add(new Employee(102, "vineet", "IT", "Developer", 54443));
		employeeList.add(new Employee(103, "shourya", "IT", "Developer", 59823));
		employeeList.add(new Employee(104, "surya", "sales", "Manager", 84533));
		employeeList.add(new Employee(105, "abhi", "sales", "Salesman", 56763));
		employeeList.add(new Employee(106, "vijay", "HR", "Manager", 98533));
		employeeList.add(new Employee(106, "vishwas", "HR", "Manager", 33233));
		employeeList.add(new Employee(107, "keshav", "HR", "Senior", 22333));
		employeeList.add(new Employee(107, "suraj", "HR", "Senior", 76333));
                
		
		employeeList.stream()
		.filter(employee->employee.getDept().equals("HR"))
		.map(Employee::getName)
		.sorted()
		.forEach(System.out::println);
		
		employeeList.stream()
		.filter(employee->employee.getDept().equals("sales"))
		.map(employee->{
			double salary = employee.getSalary()*1.1;
			employee.setSalary(salary);
			return employee;
		}).forEach(System.out::println);
		
		System.out.println("--------------------");
                System.out.println("Extra line has been added");
<<<<<<< HEAD
		System.out.println("123");
=======
		System.out.println("xyz");
>>>>>>> ed5ff2123737b9944c339bbcb5217d6cf4b02c53

		
		
		employeeList.stream()
		.filter(employee->employee.getDept().equals("HR"))
		.filter(employee->employee.getDesig().equals("Manager"))
		.map(employee->{
			employee.setSalary(employee.getSalary()*1.25);
			employee.setDesig("Senior Manager");
			return employee;
		}).forEach(System.out::println);
		
		System.out.println("--------------------");
		System.out.println("Another line added");
	}
}
