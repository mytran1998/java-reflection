package com.reflection;

import java.lang.reflect.Method;
import java.util.Scanner;

public class EmployeeQuery {

	public static void main(String[] args) {
		try {
			// Employee demo
			Employee employee = new Employee("Mike", "120 Nguyen Hoang", "Ha Noi");

	        Class<?> employeeClass = employee.getClass();
	        
			Scanner scanner = new Scanner (System.in);
			String nextCommand;
			do {
				System.out.print("Enter command >> ");
				nextCommand = scanner.next();
				
				if(nextCommand != null && !nextCommand.equals("")) {
					String methodName = nextCommand;
					Method method = employeeClass.getMethod(methodName);
			        String name = (String) method.invoke(employee);
			        System.out.println(name);
				}
			} 
			while (! nextCommand.equals("quit"));
		}catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
