
//AbcEmployeeMgr.java  BridgelabzEmpolyeeMgr.java  IEmployeeManager.java
package com.empapp.test;
import com.empapp.model.Employee;
import com.empapp.controller.BridgelabzEmployeeMgr;
import com.empapp.controller.AbcEmployeeMgr;
import com.empapp.controller.IEmployeeManager;
import java.util.*;


class EmployeeDwTest
{
  public static void main(String... args)
  {
	Employee brlzEmp =  new Employee();
	brlzEmp.setId(1);
//	brlzEmp.setIsPresent();
//	brlzEmp.setDoneParttime();
	
        Employee abcEmp =  new Employee();
        brlzEmp.setId(2);
        
	IEmployeeManager blem = new BridgelabzEmployeeMgr();
	IEmployeeManager abcem = new AbcEmployeeMgr();
	Scanner sc = new Scanner(System.in);
	brlzEmp.setIsPresent(blem.isEmployeePresent());
        brlzEmp.setDoneParttime(abcem.isEmployeeParttime());
	System.out.println("Please enter your choice for which company you want to calculate wage: ");
	System.out.println("1. Bridgelabz");
	System.out.println("2. ABC");
	int sw = sc.nextInt();
	
	switch(sw)
	{
	
	   case 1:
		System.out.println("Dailywage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateDailyWage(brlzEmp));
        	System.out.println("Monthly wage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateMonthlyWage(brlzEmp));
                break;
	   case 2:
        	System.out.println("Dailywage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateDailyWage(abcEmp));
        	System.out.println("Monthly wage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateMonthlyWage(abcEmp));
		break;
	   default:
		System.out.println("Enter 1 for bridgelabz 2 for ABC");

	}
  }
}
