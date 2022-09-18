package main;

import java.util.Scanner;

import emp.EmployeeDB;
import emp.EmployeeImps;

public class App {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		EmployeeDB emp=new EmployeeImps();
		while(true) {
			System.out.println("1:Add Employee\n2:Display Employee\n3:Update Employee\n4:Delete Employee\n5:Exit\nEnter Choice");
			int c=sc.nextInt();
			switch(c) {
			case 1:
				emp.addEmployee();
				break;
			case 2:
				emp.displayEmployee();
				break;
			case 3:
				emp.UpdateEmployee();
				break;
			case 4:
				emp.deleteEmployee();
				break;
			case 5:
				System.out.println("Thank You....!");
				System.exit(0);
			default :
				System.out.println("Invalid Choice");
			}
		}
	}
}
