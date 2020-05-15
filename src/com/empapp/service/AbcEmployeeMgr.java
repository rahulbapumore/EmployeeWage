package com.empapp.controller;
import com.empapp.model.Employee;

public class AbcEmployeeMgr implements IEmployeeManager
{
   public static final int workingHours = 8;
   public static final int hourlyWage = 30;


  @Override
  public boolean isEmployeePresent()
  {
        if(Math.round(Math.random()) == 0)
         return false ;
        else
         return true;

  }

  @Override  
  public boolean isEmployeeParttime()
  {
        if(Math.round(Math.random()) == 0)
         return false ;
        else
         return true;

  }  
   
  @Override
  public int calculateDailyWage(Employee emp)
  {
        if(emp.getIsPresent() == true)
        {
            if(emp.getDoneParttime() == true)
            {
                return (hourlyWage*workingHours + hourlyWage*workingHours );
            }
            else
            {
                return (hourlyWage*workingHours );
            }
        }
	return 0;
  }
  


       
}


