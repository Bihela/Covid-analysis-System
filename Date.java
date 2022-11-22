/*************************************************************
 * Author : Bihela wanasekara Curtin ID : 20530930
 * Date : 9/23/2021
 * Purpose:Data class 
 * ***********************************************************/
import java.util.*;

public class Date
{
    // Class fields
	private int dayOfMonth;
	private int monthOfYear;
	private int year;

	// Alternate constructor
	public Date(int pdayOfMonth, int pmonthOfYear, int pyear)
	{
		dayOfMonth = pdayOfMonth;
		monthOfYear = pmonthOfYear;
		year = pyear;
	}

	// Following are the Accessors (getters)
	public int getdayOfMonth()
	{
		return dayOfMonth;
	}

	public double getmonthOfYear()
	{
		return monthOfYear;
	}

	public double getyear()
	{
		return year;
	}

	//Following are the mutators
	public void setdayOfMonth(int pdayOfMonth)
	{
		dayOfMonth = pdayOfMonth;
	}

	public void setmonthOfYear(int pmonthOfYear)
	{
		monthOfYear = pmonthOfYear;
	}

	public void setyear(int pyear)
	{
		year = pyear;
	}
}
	
			      


