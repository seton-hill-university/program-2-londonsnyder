// Project:  Project 2
// Author:   London Snyder 
// GitHub:   londonsnyder 
// Date:     Sept 20, 20222
// Version:  1.0
// Desc:     This program stores 3 numbers from the user, outputs them, and then displays a menu 
//           with choices. 

import java.util.Scanner;


public class ProjectTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Activating keyboard 
		Scanner keyboard = new Scanner(System.in); 
	
		
		// Asking user for three numbers 
		// Numbers stored for later use 
		System.out.print("What is your first number? ");
		int numberOne = keyboard.nextInt();
		System.out.print("What is your second number? ");
		int numberTwo = keyboard.nextInt(); 
		System.out.print("What is your third number? ");
		int numberThree = keyboard.nextInt(); 
		
		System.out.println("Select a mathmatical operation");
		System.out.println("1) Add \n2) Subract \n3) Multiply \n4) Divide");
		
		
		// Preparing the operations to be displayed when each case is selected in the menu 
		int displayOne = numberOne + numberTwo;
		int displayTwo = numberOne - numberTwo;
		int displayThree = numberOne * numberTwo;
		int displayFour = numberOne / numberTwo;
		
		//Displaying menu and executing the operations 
		switch (keyboard.nextInt())
		{
		
		//Option 1 selected 
		case 1:
// Sum is displayed 
			System.out.println("The sum of the numbers is " + displayOne);
			
// Determines if sum is >, <, or = to third number and displays to user 
			if (displayOne>numberThree)
			{
				System.out.println(displayOne + " is greater than " + numberThree);
			}
			
			if (displayOne<numberThree)
			{
				System.out.println(displayOne + " is less than " + numberThree);
			}
			
			if (displayOne==numberThree)
			{
				System.out.println(displayOne + " is equal to " + numberThree);
			}
				break; 
		//OPtion 2 selected 
		case 2: 
			
// Difference is displayed 
			System.out.println("The difference of the numbers is " + displayTwo);

// Determines if difference is >, <, or = to third number and displays to user 
			if (displayTwo>numberThree)
			{
				System.out.println(displayTwo + " is greater than " + numberThree);
			}
						
			if (displayTwo<numberThree)
			{
				System.out.println(displayTwo + " is less than " + numberThree);
			}
						
			if (displayTwo==numberThree)
			{
				System.out.println(displayTwo + " is equal to " + numberThree);
			}

				break;
		//Option 3 selected 
		case 3:

// Product is displayed
			System.out.println("The product of the numbers is " + displayThree);
			
// Determines if product is >, <, or = to third number and displays to user 
			if (displayThree>numberThree)
			{
				System.out.println(displayThree + " is greater than " + numberThree);
			}
									
			if (displayThree<numberThree)
			{
			System.out.println(displayThree + " is less than " + numberThree);
			}
									
			if (displayThree==numberThree)
			{
				System.out.println(displayThree + " is equal to " + numberThree);
			}
			
			break;
		//Option 4 selected
		case 4:
			
// Quotient is displayed 
			System.out.println("The quotient of the numbers is " + displayFour);
			
// Determines if quotient is >, <, or = to third number and displays to user 
			if (displayFour>numberThree)
			{
				System.out.println(displayThree + " is greater than " + numberThree);
			}
									
			if (displayFour<numberThree)
			{
				System.out.println(displayFour + " is less than " + numberThree);
			}
									
			if (displayFour==numberThree)
			{
				System.out.println(displayFour + " is equal to " + numberThree);
			}
			
			break;
		}

			}
			
			
		
		}
	

