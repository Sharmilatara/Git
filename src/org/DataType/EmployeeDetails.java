package org.DataType;
//DataType
public class EmployeeDetails {
	public void add() {
		int empID=126;
		String empName="Sharmila";
		String empEmail="sharmilatara@gmail.com";
		long empPhoneNo=9908768904l;
		char empGender='F';
		String empCity="Chennai";
		System.out.println("Employee ID is:"+empID);
		System.out.println("Employee Name is:"+empName);
		System.out.println("Employee emailID is:"+empEmail);
		System.out.println("Employee Phone No. is:"+empPhoneNo);
		System.out.println("Employee Gender is:"+empGender);
		System.out.println("Employee City is :"+empCity);
	    }
	public static void main(String[] args) {
		EmployeeDetails e=new EmployeeDetails();
		e.add();
		
	}
}
	