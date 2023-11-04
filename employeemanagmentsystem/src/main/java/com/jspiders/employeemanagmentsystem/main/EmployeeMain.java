package com.jspiders.employeemanagmentsystem.main;

import java.util.Scanner;

import com.jspiders.employeemanagmentsystem.dao.EmployeeDAO;
import com.jspiders.employeemanagmentsystem.dto.Employee;

public class EmployeeMain {

	private static EmployeeDAO employeeDAO = new EmployeeDAO();
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flag = true ;
		
		while(flag) {
			System.out.println("1. Add Employee\n2. Delete Employee\n3. Update Employee\n4. Find Employee By Id\n5. Find All Employee\n6. Exit");
			System.out.println("Enter your choice : ");
			int choice = scanner.nextInt();
			
			switch (choice) {
			
				case 1:
					Employee employee = new Employee();
					scanner.nextLine();
					System.out.println("Enter name ");
					employee.setName(scanner.nextLine());
					System.out.println("Enter email ");
					employee.setEmail(scanner.nextLine());
					System.out.println("Enter salary ");
					employee.setSalary(scanner.nextDouble());
					employeeDAO.addEmployee(employee);
					System.out.println("Employee Added successfully.");
					break;

				case 2:
					employeeDAO.getAllEmployee();
					System.out.println("Enter Id to remove employee.");
					employeeDAO.deleteEmployee(scanner.nextInt());
					System.out.println("Employee deleted.");
					break;
					
				case 3:
					employeeDAO.getAllEmployee();
					System.out.println("Enter Id to update employee.");
					employeeDAO.updateEmployee(scanner.nextInt(), scanner);
					System.out.println("Employee updated successfully.");
					break;
					
				case 4:
					System.out.println("Enter Id to find employee.");
					Employee employee2 = employeeDAO.getEmployeeById(scanner.nextInt());
					
					if (employee2 != null) {
						System.out.println(employee2);
					} else {
						System.out.println("Employee not found.");
					}
					break;
					
				case 5:
					employeeDAO.getAllEmployee();
					break;
					
				case 6:
					System.out.println("Thank you !");
					flag = false;
					break;
					
			default: System.out.println("Enter valid choice.");
			
			}
		}
		
		scanner.close();
				
	}
}
