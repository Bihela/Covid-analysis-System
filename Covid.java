import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.util.*;
import java.io.*;
public class Covid
{
	public static void main(String[] args)
	{
	    mainMenu();// End main program
    }
        
/***************************
METHOD: mainMenu
IMPORT: none
EXPORT: none
************************/
    private static void mainMenu()
    {
        int option = 0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the COVID-19 Data Analysis Program. Make a selection from the menu below regarding the information you would like to see.");
        System.out.println("");
        System.out.println("Please select from the menu below");
        System.out.println("> 1. Statistic of entire nation");
        System.out.println("> 2. Statistic or regions");
        System.out.println("> 3. Exit the program.");
        System.out.printf("Your choice = ");
        option = sc.nextInt();
		switch (option)
		{
			case 1:
				option1();
			break;

			case 2:
				option2();
			break;

			case 3:
				System.out.println("Exiting now");
			break;

			default:
			         System.out.println("Sorry incorrect option");
        }
    }
/***************************************
METHOD: option1
IMPORT: none
EXPORT: none
**************************************/
    private static void option1()

    {
    	String[] ageGroup = {"0-9","10-19","20-29","30-39","40-49","50-59","60-69","70-79","80-89","90+"};//all required arrays
        String[] sexGroup = {"M" , "F"};
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Statistics for the entire nation: Select from the menu below:");
        System.out.println(">1. Display the total number of COVID-19 cases");
        System.out.println(">2. Display the number of COVID-19 cases: Males.");
        System.out.println(">3. Display the number of COVID-19 cases: Females.");
        System.out.println(">4. Display the number of COVID-19 Cases: 0-9 age group.");
        System.out.println(">5. Display the number of COVID-19 Cases: 10-19 age Group. ");
        System.out.println(">6. Display the number of COVID-19 Cases: 20-29 age group. ");
        System.out.println(">7. Display the number of COVID-19 Cases: 30-39 age group. ");
        System.out.println(">8. Display the number of COVID-19 Cases: 40-49 age group. ");
        System.out.println(">9. Display the number of COVID-19 Cases: 50-59 age group. ");
        System.out.println(">10. Display the number of COVID-19 Cases: 60-69 age group. ");
        System.out.println(">11. Display the number of COVID-19 Cases: 70-79 age group. ");
        System.out.println(">12. Display the number of COVID-19 Cases: 80-89 age group. ");
        System.out.println(">13. Display the number of COVID-19 Cases: 90+ age group. ");
        System.out.printf("Your choice: ");
        int choose1 = sc.nextInt();
        if ( choose1 == 1)
        {
             System.out.println("Total number of cases =101114 ");
        }
        if ( choose1 == 2)
        {
           displayDatasex(sexGroup[choose1-2]);
        }
        if ( choose1 == 3)
        {
           displayDatasex(sexGroup[choose1-2]);
        }
        if ( choose1 == 4)
        {
            displayData(ageGroup[choose1-4]);
        }   
   
        if ( choose1 == 5)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 6)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 7)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 8)
        {
           displayData(ageGroup[choose1-5]);
        }        
        if ( choose1 == 9)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 10)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 11)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 12)
        {
           displayData(ageGroup[choose1-5]);
        }
        if ( choose1 == 13)
        {
           displayData(ageGroup[choose1-5]);
        }

        System.out.println("Would you like to make another selection (Y or N)? ");
        char repeat = sc.next().charAt(0);
        if ( repeat == 'Y' )
        {
            option1();
        }
        if ( repeat == 'N' )
        {
            mainMenu();
        }
    }
/***************************************
METHOD: displayData
IMPORT: String ageGroup
EXPORT: none
**************************************/    
    private static void displayData(String ageGroup){
    	    	
    	String line = "";  
    	String splitBy = ",";
        int countage = 0;
    	
    	try{  
    	//parsing a CSV file into BufferedReader class constructor  
    		BufferedReader br = new BufferedReader(new FileReader("COVID19BE_CASES.csv"));
    		
    		while ((line = br.readLine()) != null){
    			String[] data= line.split(splitBy);
    			CovidCase newCase = new CovidCase(data[3], data[4],data[5],data[6],data[7],data[8],data[2]);
    			
    			if(newCase.getAgeGroup().compareTo(ageGroup)==0) {
    				countage = countage + 1;
    			}
    		}
            System.out.println("Total number of cases = " + countage);
  
    	}   
    	catch (IOException e){  
    		e.printStackTrace();  
    	}      
    }
/***************************************
METHOD: displayDatadex
IMPORT: String sexGroup
EXPORT: none
**************************************/    
    private static void displayDatasex(String sexGroup){
    	
    	
    	String line = "";  
    	String splitBy = ",";
        int countsex = 0;
    	
    	try{  
    	//parsing a CSV file into BufferedReader class constructor  
    		BufferedReader br = new BufferedReader(new FileReader("COVID19BE_CASES.csv"));
    		
    		while ((line = br.readLine()) != null){
    			String[] data= line.split(splitBy);
    			CovidCase newCase = new CovidCase(data[3], data[4],data[5],data[6],data[7],data[8],data[2]);
    			
                if(newCase.getsex().compareTo(sexGroup)==0) {
                    countsex = countsex + 1;
                   
                }
    		}
            System.out.println("Total number of cases = " + countsex);  
    	}   
    	catch (IOException e){  
    		e.printStackTrace();  
    	}
    }
/***************************************
METHOD: option2
IMPORT: none
EXPORT: none
**************************************/
    private static void option2()
    {
        String[] regionGroup = {"Flanders","Brussels","Wallonia","NA"};
        String[] sexGroup = {"M" , "F"};
        String[] ageGroup = {"0-9","10-19","20-29","30-39","40-49","50-59","60-69","70-79","80-89","90+"};//all required arrays
        Scanner sc = new Scanner(System.in);
        System.out.println("Statistic by the Region: select from the menu below:");
        System.out.println("Which region would you like statistic for?");
        System.out.println("1. Flanders");
        System.out.println("2. Brussels");
        System.out.println("3. Wallonia");
        System.out.println("4. Unknown");
        System.out.printf("Your choice : ");
        int choose2 = sc.nextInt();
        if(choose2 == 1)
        {
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-1]);
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+4]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+5]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+6]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+7]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+8]);
        }
        if(choose2 == 2)
        {
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-2]);
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+4]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+5]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+6]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+7]);
        }
        if(choose2 == 3)
        {
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-3]);
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+4]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+5]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+6]);
        }
        if(choose2 == 4)
        {
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-4]);
            displayDataregion(regionGroup[choose2-1],sexGroup[choose2-3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-4]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2-1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+1]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+2]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+3]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+4]);
            displayDataregion1(regionGroup[choose2-1],ageGroup[choose2+5]);
        }
        System.out.println("Would you like to make another selection (Y or N)? ");
        char repeat = sc.next().charAt(0);
        if ( repeat == 'Y' )
        {
            option2();
        }
        if ( repeat == 'N' )
        {
            mainMenu();
        }
    }
/***************************************
METHOD: displayDataregion
IMPORT: String regionGroup, String SexGroup
EXPORT: none
**************************************/        
    private static void displayDataregion(String regionGroup, String sexGroup){
    	
    	
    	String line = "";  
    	String splitBy = ",";
        int countsex1 = 0;
    	
    	try{  
    	//parsing a CSV file into BufferedReader class constructor  
    		BufferedReader br = new BufferedReader(new FileReader("COVID19BE_CASES.csv"));
    		
    		while ((line = br.readLine()) != null){
    			String[] data= line.split(splitBy);
    			CovidCase newCase = new CovidCase(data[3], data[4],data[5],data[6],data[7],data[8],data[2]);

    			if(newCase.getRegion().compareTo(regionGroup)==0 & newCase.getsex().compareTo(sexGroup)== 0) {
                        countsex1 = countsex1 +1;
                    }
    			}
            System.out.println("Total number of cases is = " + countsex1);
    		}     
    	catch (IOException e){  
    		e.printStackTrace();  
    	}      
    }
/***************************************
METHOD: displayDataregion1
IMPORT: String regionGroup, String ageGroup
EXPORT: none
**************************************/   
    private static void displayDataregion1(String regionGroup, String ageGroup){
    	
    	
    	String line = "";  
    	String splitBy = ",";
        int countage1 = 0;
    	
    	try{  
    	//parsing a CSV file into BufferedReader class constructor  
    		BufferedReader br = new BufferedReader(new FileReader("COVID19BE_CASES.csv"));
    		
    		while ((line = br.readLine()) != null){
    			String[] data= line.split(splitBy);
    			CovidCase newCase = new CovidCase(data[3], data[4],data[5],data[6],data[7],data[8],data[2]);

    			if(newCase.getRegion().compareTo(regionGroup)==0 & newCase.getAgeGroup().compareTo(ageGroup)== 0) {
                        countage1 = countage1 + 1;
                    }
    			}
                System.out.println("Total number of cases is = " + countage1);
    		}     
    	catch (IOException e){  
    		e.printStackTrace();  
    	}      
    }
}
   
