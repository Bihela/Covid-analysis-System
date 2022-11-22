/*************************************************************
 * Author : Bihela wanasekara Curtin ID : 20530930
 * Date : 9/23/2021
 * Purpose: CovidCase class 
 * ***********************************************************/
import java.util.*;

public class CovidCase
{
    // Class fields
	private String Country;
	private String Province;
	private String Region;
    private String AgeGroup;
    private String sex;
    private String Cases;
    private String theDate;

	// Alternate constructor
	public CovidCase(String pCountry, String pProvince, String pRegion, String pAgeGroup, String psex, String pCases, String ptheDate)
	{
		Country = pCountry;
		Province = pProvince;
		Region = pRegion;
        AgeGroup = pAgeGroup;
        sex = psex;
        Cases = pCases;
        theDate = ptheDate;
	}

	// Following are the Accessors (getters)
	public String getCountry()
	{
		return Country;
	}

	public String getProvince()
	{
		return Province;
	}

	public String getRegion()
	{
		return Region;
	}

	public String getAgeGroup()
	{
		return AgeGroup;
	}

	public String getsex()
	{
		return sex;
	}

	public String getCases()
	{
		return Cases;
	}

	public String gettheDate()
	{
		return theDate;
	}
         
	//Following are the mutators
	public void setCountry(String pCountry)
	{
		Country = pCountry;
	}

	public void setProvince(String pProvince)
	{
		Province = pProvince;
	}

	public void setRegion(String pRegion)
	{
		Region = pRegion;
	}

	public void setAgeGroup(String pAgeGroup)
	{
		AgeGroup = pAgeGroup;
	}

	public void setsex(String psex)
	{
		sex = psex;
	}

	public void setCases(String pCases)
	{
		Cases = pCases;
	}

	public void settheDate(String ptheDate)
	{
		theDate = ptheDate;
	}
}
	
			      


