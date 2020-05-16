package com.empapp.controller;
import com.empapp.model.Employee;

public class BridgelabzEmployeeMgr implements IEmployeeManager
{
   public static final int workingHours = 11;
   public static final int hourlyWage = 20;
   public static final int partTimeWorkingHours = 4;
//   public String companyName ;
  @Override
  public int calculateMonthlyWage(Employee e)
  {
	
	if(e.getIsPresent() == true)
        {
            if(e.getDoneParttime() == true)
            {
	            return (hourlyWage*partTimeWorkingHours * 20);
           }
            else
            {
                    return (hourlyWage * workingHours * 20);
            }
        }
	return 0;

	
  }

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
  public int calculateDailyWage(Employee e)
  {
	if(e.getIsPresent() == true)
   	{
	    if(e.getDoneParttime() == true)
	    {
		return (hourlyWage * partTimeWorkingHours );
	    }
	    else
	    {
		return (hourlyWage * workingHours );
	    }
	}
	return 0;
  }
 

  @Override 
  public int calculateWageTillDaysOrHourReached(Employee e) 
  {
	int tempWorkingHour = 0;
	int tempWorkingDays = 0;
	int totalWage = 0;
	while((tempWorkingHour < 100) || (tempWorkingDays < 20))
	{
				
		totalWage +=  calculateDailyWage(e);
		tempWorkingHour += workingHours;
		tempWorkingDays++;
		//System.out.println("Working Hours "+ wrkingHours + "       "+ "" );
		e.setIsPresent(this.isEmployeePresent());
		e.setDoneParttime(this.isEmployeeParttime());
		if(e.getIsPresent())
			System.out.println("Employee is Present ");
	
	}
	return totalWage;
  } 
}
 
