package com.empapp.controller;
import com.empapp.model.Employee;

public interface IEmployeeManager
{
  public boolean isEmployeePresent();
  public boolean isEmployeeParttime(); 
  public int calculateDailyWage(Employee e);
  public int calculateMonthlyWage(Employee e);
}
