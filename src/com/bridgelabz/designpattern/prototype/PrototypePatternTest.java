package com.bridgelabz.designpattern.prototype;

import java.util.List;

public class PrototypePatternTest
{
	public static void main(String[] args) 
	{
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees empsNew = (Employees) emps.clone();
		Employees empsNew1 = (Employees) emps.clone();
		List<String> list = empsNew.getEmpList();
		list.add("Paresh");
		List<String> list1 = empsNew1.getEmpList();
		list1.remove("Tejas");
		
		System.out.println("employee List:==>> "+emps.getEmpList());
		System.out.println("\nAfter adding new employee in list:==>>"+list);
		System.out.println("\nAfter removing employee from list:==>>"+list1);
	}
}
