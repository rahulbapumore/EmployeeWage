package com.empapp.controller;
import com.empapp.model.Employee;

public class BridgelabzEmployeeMgr implements IEmployeeManager
{
   public static final int workingHours = 11;
   public static final int hourlyWage = 20;

  @Override
  public boolean isEmployeePresent()
  {
	if(Math.round(Math.random()) == 0)
         return false ;
        else
         return true;

  }  

  
}
