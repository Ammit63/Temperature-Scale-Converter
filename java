import java.util.Scanner;

public class E17_TempScaleConvert {


	static Scanner sc = new Scanner(System.in);
// main only has one function used to decide from which scale you wish to convert to.
	
	public static void main(String[] args) {
		 
		// use while loop to ensure those who put a different character then 'c' or 'f' can come back to the top of the if statement.	
					char again = 'y';
					while (again =='y') {
						
						// user input
						System.out.println("Please enter 'C' for converting to Celsius or 'F' for converting to Fahrenheit: ");
						char tempScale = sc.next().charAt(0);
						
						//selecting 'c' or 'C' will take you to the method that converts Fahrenheit to Celsius.
						 if(tempScale == 'c') 
							ferToCel(); 
						
						 else  if(tempScale == 'C') 
								ferToCel(); 
						
						 //selecting 'f' or 'F' will take you to the method that converts Celsius to Fahrenheit. 
						 else if(tempScale == 'f') 
							  celToFer();
						 
						 else if(tempScale == 'F') 
							  celToFer();
						 
						 //Selecting any other character beside 'c','C', 'f' or 'F' will notify and ask if wish to enter again.
						 else
							 System.out.println("Please enter only 'C' for Celsius or 'F' for Fahrenheit.");
						 	 System.out.println("Try again? <y/n>");
						 	 again = sc.next().charAt(0);
						}	 
					}
						
			// This method converts Celsius to Fahrenheit.
				public static void celToFer() {
					System.out.println("Please enter temp in Celsius: ");
					float cel = sc.nextFloat();
					float fer = cel * (9f / 5) + 32;
					System.out.println(cel + " degree Celsius is equal to " + fer +" degree Fahrenheit.");
				}
				// This method converts Fahrenheit to Celsius.
				public static void ferToCel() {
					System.out.println("Please enter temp in Fahrenheit: ");
					float fer = sc.nextFloat();
					float cel = ((fer - 32) * 5) / 9;
					System.out.println(fer + " degree Fahrenheit is equal to " + cel +" degree Celsius.");
				}
	}


