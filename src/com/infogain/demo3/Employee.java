package com.infogain.demo3;
public class Employee {
	int empId;
	String name;
	Address add;
	public Employee()
	{
		
	}
	
	public Employee(int empId,String name,Address add)
	{
		this.empId=empId;
		this.name=name;
		this.add=add;
	}
	
	public void show()
	{
		System.out.println("Id" +empId+" Name "+name);
		System.out.println("City "+add.toString());
	}
	

}
