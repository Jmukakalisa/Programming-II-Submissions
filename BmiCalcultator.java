package SeriousBusiness;
import java.util.Scanner;
import java.text.DecimalFormat;
public class BmiCalcultator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Just still figuring it out!..");
    
    //creating Scanner class that will help us take user input
	Scanner sc = new Scanner(System.in);
	
	// Variables holding the required aspect to calculate BMI of person
	System.out.println("Enter your name:");
	String name = sc.nextLine();
	
	System.out.println("Enter your height in meters :");
	double height_m = sc.nextDouble();
	
	System.out.println("Enter your weight in kg:");
	double weight_kg = sc.nextDouble();
	
	DecimalFormat df = new DecimalFormat(".00");
	//BMI formula 
	double bmi = weight_kg / (height_m * height_m);
	System.out.println("the bmi is: " + df.format(bmi));
	
	// Conditions indicating whether a person is overweight or not overweight
	if (bmi < 25)
	    {System.out.println(name + " is not overweight");
	    	
	    }
	
	else 
	    {System.out.println(name + " is overweight");
	    
	    }
	
		}
	
	}
