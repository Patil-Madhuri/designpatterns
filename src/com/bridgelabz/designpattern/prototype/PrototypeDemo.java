package com.bridgelabz.designpattern.prototype;

import java.util.Scanner;

interface Employee
{
	public Employee getClone();
}
 class EmployeeRecord implements Employee
 {
	private String name,address,designation;
	private int id,salary;
	 public EmployeeRecord() 
	 {
		 System.out.println("Intern Record Of Bridgelabz Solutions");
		 System.out.println("-------------------------------------");
		 System.out.println("Id \t Name \t Address \t Designation \t Salary");
	 }
	 
	 public EmployeeRecord(int id,String name,String address,String designation,int salary)
	 {
		 this.id = id;
		 this.name = name;
		 this.address = address;
		 this.designation = designation;
		 this.salary = salary;
	 }
	 
	 public void showRecord()
	 {
		 System.out.println(id+"\t"+name +"\t"+address+"\t"+designation+"\t"+salary);
	 }
	@Override
	public Employee getClone() 
	{
		return new EmployeeRecord(id, name, address, designation, salary);
	}
 }
 
 public class PrototypeDemo
 {
	 public static void main(String[] args) 
	 {
		 Scanner scanner = new Scanner(System.in);
		 int id,salary;
		 String name,designation,address;
		 System.out.println("Enter the employee id: ");
		 id = scanner.nextInt();
		 System.out.println("Enter the employee name: ");
		 name = scanner.next();
		 System.out.println("Enter the employee designation: ");
		 designation = scanner.next();
		 System.out.println("Enter the employee address: ");
		 address = scanner.next();
		 System.out.println("Enter the employee salary: ");
		 salary = scanner.nextInt();
		 EmployeeRecord employee = new EmployeeRecord(id, name, address, designation, salary);
		 employee.showRecord();
		 System.out.println("After cloning: ");
		 EmployeeRecord emp = (EmployeeRecord) employee.getClone();
		 emp.showRecord();
		 scanner.close();
	}
 }
