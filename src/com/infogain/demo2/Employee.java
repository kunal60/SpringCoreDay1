package com.infogain.demo2;
public class Employee {
	int empId;
	String name;
	Address add;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
public void disp()
{
	System.out.println("Emp Id is "+empId+" Name "+name);
	System.out.println(add);
}
	
	

}