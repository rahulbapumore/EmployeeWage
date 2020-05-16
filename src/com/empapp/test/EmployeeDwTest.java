
//AbcEmployeeMgr.java  BridgelabzEmpolyeeMgr.java  IEmployeeManager.java
package com.empapp.test;
import com.empapp.model.Employee;
import com.empapp.controller.BridgelabzEmployeeMgr;
import com.empapp.controller.AbcEmployeeMgr;
import com.empapp.controller.IEmployeeManager;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Set;

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
//		System.out.println("Dailywage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateDailyWage(brlzEmp));
//        	System.out.println("Monthly wage for Employee from bridgelabz company with id = "+ brlzEmp.getId() + " is "+blem.calculateMonthlyWage(brlzEmp));
		System.out.println("Calculated wage till days or hours reached for Employee from Bridgelabz company with id = "+brlzEmp.getId() + " is "+blem.calculateWageTillDaysOrHourReached(brlzEmp));
                break;
	   case 2:
  //      	System.out.println("Dailywage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateDailyWage(abcEmp));
  //      	System.out.println("Monthly wage for Employee from ABC company with id = "+ abcEmp.getId() + " is "+abcem.calculateMonthlyWage(abcEmp));
                System.out.println("Calculated wage till days or hours reached for Employee from ABC company with id = "+abcEmp.getId() + " is "  +abcem.calculateWageTillDaysOrHourReached(abcEmp));
		break;
	   default:
		System.out.println("Enter 1 for bridgelabz 2 for ABC");

	}

	System.out.println("-----------------Craating many Employee objects in arraylist and for each object in arraylist adding object and +"+
	"calculating wage and Adding to hasmap");
	List<Employee> empList = new ArrayList<>();
	for(int i =0;i<20;i++)
	{
		Employee e = new Employee();
		e.setId(i*100);
	        e.setIsPresent(blem.isEmployeePresent());
        	e.setDoneParttime(blem.isEmployeeParttime());
		empList.add(e);

	}

        HashMap<Employee, Integer> hmap = new HashMap<>();

	for(int i=0;i < 20; i++)
	{
		if((i%2)==0)
		{
			System.out.println("Employee is from Bridgelabz with id "+ empList.get(i).getId());
			int temp = blem.calculateWageTillDaysOrHourReached(empList.get(i));
			empList.get(i).setCompanyName("Bridgelabz");			
			hmap.put(empList.get(i),temp);
		}
		else
		{
                        System.out.println("Employee is from ABC Company with id "+ empList.get(i).getId());

			int temp = abcem.calculateWageTillDaysOrHourReached(empList.get(i));
			empList.get(i).setCompanyName("ABC");
			hmap.put(empList.get(i),temp);
		}
	}

	Set set = hmap.entrySet();
      	Iterator iterator = set.iterator();
      	while(iterator.hasNext()) 
	{
        	 Map.Entry mentry = (Map.Entry)iterator.next();
         	Employee temp =(Employee) mentry.getKey();
		System.out.println("Employee with id "+temp.getId() +"  working in company "+ temp.getCompanyName() );
         	System.out.println("Total Salary = "+mentry.getValue());
      	}
  }
}
