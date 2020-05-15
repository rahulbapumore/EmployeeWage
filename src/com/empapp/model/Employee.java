package com.empapp.model;

public class Employee
{
  private int id;
  private boolean isPresent;
  private boolean doneParttime;
 // private  int dailyWage;
//  private int monthlyWage;

  public int getId()
  {
	return this.id;
  }
  public boolean  getIsPresent()
  {
	return this.isPresent;
  }

  public boolean getDoneParttime()
  {
	return this.doneParttime;
  }
 /* public int getDailyWage()
  {
	return this.dailyWage;
  }
  public int  getMonthlyWage()
  {
        return this.monthlyWage;
  }

*/
  public void setId(int id)
  {
	this.id = id;
  }
  public void  setIsPresent(boolean isPresent)
  {
	this.isPresent = isPresent;
  }
  public void setDoneParttime(boolean doneParttime)
  {
        this.doneParttime = doneParttime;
       
  }
 /* public void setDailyWage(int dw)
  {
        this.dailyWage = dw;
  }
  public void setMonthlyWage(int mw)
  {
        this.monthlyWage = mw;
  }
*/
}
