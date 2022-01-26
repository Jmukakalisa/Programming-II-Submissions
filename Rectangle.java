package SeriousBusiness;

// importing the required packages for my program
import java.util.Scanner;
import java.text.DecimalFormat;
public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// using a try function to prevent any problem that may result in n\ 
//any edge cases where imported packages might refuse to work  
try (Scanner scanner = new Scanner(System.in))
{
	System.out.println("Learning in progress...");
	
	// Variable that will hold the user inputs as the defined width and length of a rectangle
	System.out.println("Enter the width of Rectangle:");
	double width = scanner.nextDouble();
	
	System.out.println("Enter the length of Rectangle:");
	double length = scanner.nextDouble();

    // A formula of a perimeter of a rectangle
	double perimeter = 2 * (length + width);

	// A formula of an Area of a rectangle
	double area = length*width;	
	
	//Decimal class that allows us to apply a decimal format to any kind of variables
    DecimalFormat df =  new DecimalFormat(".0000");	
    
	System.out.println("The Area of Rectangle using double type of data is:"+ df.format(area));
	System.out.println("The perimeter of Rectangle using double type of data is:"+ df.format(perimeter));
}


	}

}
