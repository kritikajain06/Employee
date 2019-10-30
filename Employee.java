package com.sid.demo;

public class Employee {
	private int id;
	private String name;
	private String dept;
	private String desig;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(){
		
	}
	public Employee(int id, String name, String dept, String desig, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", desig=" + desig + ", salary=" + salary
				+ "]";
	}
	
}
