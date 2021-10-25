package com.jdbc.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.jdbc.controller.EmpController;
import com.jdbc.model.Emp;

public class Program
{

	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			System.out.println("1. Add Employee");
			System.out.println("2. Show All Employee");
			System.out.println("3. Update Employee by empno");
			System.out.println("4. Delete Employee");
			System.out.println("5. Show by Employee no");
			System.out.println("Enter your choice:");
			int ch=Integer.parseInt(scan.nextLine());
			switch(ch)
			{
			case 1: 
				
				System.out.println("Enter empno");
				int eno=Integer.parseInt(scan.nextLine());
				System.out.println("Enter name");
				String nam=scan.nextLine();
				System.out.println("Enter job");
				String job=scan.nextLine();
				System.out.println("Enter sal");
				float sal=Float.parseFloat(scan.nextLine());
				System.out.println("Enter deptno");
				int dno=Integer.parseInt(scan.nextLine());				
				if(EmpController.addEmployee(eno,nam,job,sal,dno))
					System.out.println("Succedd Added");
				else
					System.out.println("Not Added.");
					
					break;
				
			case 2: 				
				
				List<Emp> arr=EmpController.showAllEmployees();
				for(Emp obj: arr)
				{
					System.out.println(obj.toString());
				}
				break;
			
			case 3:
				System.out.println("Enter empno");
				int no=Integer.parseInt(scan.nextLine());
				System.out.println("Enter sal");
				float sl=Float.parseFloat(scan.nextLine());
				if(EmpController.updateBySalEmpno(no, sl))
					System.out.println("Update succ");
				else
					System.out.println("Not succ");
				
			default: 
				System.exit(0);
			}
		}
	}
}
