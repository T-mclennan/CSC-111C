/**
*   Driver program for Lab4. This program converts a simple equation from infix to postfix notation, 
*   and returns the numeric result.
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     4/22/17
*
*
*
*
**/

// ****************************************************************************//
// Lab Assignment 4 is a driver program for our postfix calculator implementation.
// Interfaces with the user and executes any commands as needed.				                      
// ****************************************************************************//

import java.io.*;
import java.util.*;

public class Lab4
{
   public static void main (String [] args) // begin main
   {

    boolean runLoop = true;
    int output = 0;
    char inputChar;

    //Scanner scan = new Scanner(System.in);


//  This loop takes input from user, and executes chosen action.
//  breaks out of loop when runLoop is set to false:
    do
    {    
          String inputString;
	  Scanner scan = new Scanner(System.in);
          System.out.print("\nInput infix expression: ");

          // User input is stored in inputString:
          inputString = scan.nextLine();

          // Creates new Calculator object for our driver program to use:
          Calculator myCalc = new Calculator(inputString);

          System.out.println("Infix: " + inputString); 
          System.out.println("Postfix: " + myCalc.getPostFix());
          System.out.println("Result: " + myCalc.evaluate());
          System.out.print("Continue? (Enter Y/N): ");
          inputChar = scan.next().charAt(0);

          if ((inputChar == 'N') || (inputChar == 'n'))
              runLoop = false;

    } // end while
    while (runLoop); 

   }  // end main
} // end Lab4
