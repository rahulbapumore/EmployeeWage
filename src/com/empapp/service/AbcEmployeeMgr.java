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
  

  @Override 
  public int calculateWageTillDaysorHourReached(Employee e) 
  {
        int tempWorkingHour = 0;
        int tempWorkingDays = 0
        int totalWage = 0;
        while((tempWorkingHour != 100) || (tempWorkingDays != 20))
        {
                totalWage +=  calculateDailyWage(e);
                tempWorkingHour += workingHours;
                tempWorkingDays += hourlyWage;
        }
        return totalWage;
  } 
  @Override
  public int calculateMonthlyWage(Employee em)
  {

        if(em.getIsPresent() == true)
        {
            if(em.getDoneParttime() == true)
            {
                    return ((hourlyWage*workingHours + hourlyWage*workingHours)*hourlyWage);
            }
            else
            {
                    return (hourlyWage*workingHours*hourlyWage);
            }
        }
	return 0;

  }
       
}


