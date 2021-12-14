package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	public static final Scanner scanner = new Scanner(System.in);

	private List<EmployeePayrollData>  employeePayrollList;
	
	public EmployeePayrollService() {
		this.employeePayrollList= new ArrayList<EmployeePayrollData>();
	}
	
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList=employeePayrollList;
	}
	
	private void readEmployeePayrollData() {
		
		System.out.println("Enter the ID:");		
		int id = scanner.nextInt();
		System.out.println("Enter the name of Employee :");
		String name = scanner.next();
		System.out.println("Enter the Salay :");
		double salary = scanner.nextDouble();
		EmployeePayrollData employeeData = new EmployeePayrollData(id,name,salary);
		employeePayrollList.add(employeeData);
		
	}
	
	private void writeEmployeePayrollData() {
		
		System.out.println("The EmployeePayroll data is : " + employeePayrollList);
		
	}
	
	public static void main(String[] args) {
		
		EmployeePayrollService employeePayrollService =new EmployeePayrollService();
		employeePayrollService.readEmployeePayrollData();
		employeePayrollService.writeEmployeePayrollData();
	}

	
}
