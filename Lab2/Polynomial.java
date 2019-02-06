/**
*   Polynomial.java defines a Class that represents a polynomail object. 
*   An integer array is used to hold the valuse of it's coefficients.
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     3/2/17
*
*
*
*
**/

import java.util.*;
import java.io.*;



public class Polynomial 

{

Scanner scan = new Scanner(System.in);
public int[] poly = new int[6];

//*************************************************//
// Constructor for polynomial class.               //
// Precondition: no precondition.                  //
// Postcondition: Creates and populates int array  //
// to hold the polynomial object's coefficients.   //
//*************************************************//

public Polynomial()
{

// creates an array to hold coeffients of X^5-X^0:

// this loop prompts for input in populating the array:
     for (int i = poly.length-1; i>=0; i--)
     {
         System.out.println("Coefficient for X^" + i + ":");
         poly[i] = scan.nextInt();

     }
}


//*************************************************//
// Constructor that populates array upon creation: //
// takes in X^5 first, then X^4, etc...            //
// Precondition: no precondition.                  //
// Postcondition: Creates and populates int array  //
// to hold the polynomial object's coefficients.   //
//*************************************************//

public Polynomial(int num0, int num1, int num2, int num3, int num4, int num5)
{

// populates polynomial array with inputs from user:

     poly[0] = num0;
     poly[1] = num1;
     poly[2] = num2;
     poly[3] = num3;
     poly[4] = num4;
     poly[5] = num5;

}

//*************************************************//
// Degree method returns the value of the highest  //
// degree in the polynomial:                       //
// Pre: no precondition.                           //
// Post: returns the highest degree present.       //
//*************************************************//

private int degree()
{
     int high = 0;
   
     for (int i = 0; i < poly.length; i++)
     {
         if (poly[i] > high)
         high = poly[i];

     }
     
     return high;

}

//*************************************************//
// getCoefficient method takes an integer, returns //
// the coffecient for that degree in polynomial:   //
// Pre: Takes in an integer.                       //
// Post: Return the integer at index 'power'.      //
//*************************************************//


public int getCoefficient(int power)
                      throws InvalidPowerException
{ 
     try 
     {  
         return poly[power];

     } // end try

     catch (InvalidPowerException e)
     {
         System.out.println("The power " + power + " is invalid.");  
         e.printStackTrace();
     } // end catch

     finally
     {
          return poly[power];
     }

} 

//****************************************************//
// changeCoefficient method takes two integers,       //
// changes the coefficient at that degree:            //
// Pre: Takes in two integers.                        //
// Post: Changes the index at 'power' to 'value'.     //
//****************************************************//

public void changeCoefficient(int power, int value)
                      throws InvalidPowerException
{ 
     try 
     {  
        poly[power] = value;

     } // end try

     catch (InvalidPowerException e)
     {
        System.out.println("The power " + power + " is invalid."); 
        e.printStackTrace();
     } // end catch


} 


//*************************************************//	
// Add method takes in another polynomial, adds it //
// to this polynomial, the returns that result.    //
// Pre: Takes in a polynomial object.              //
// Post: Returns the sum as a polynomial oject.    //
//*************************************************//

public Polynomial add(Polynomial otherPoly)
{    

     int temp = 0;

     for (int i = 0; i < (poly.length-1); i++)
     {
        
        temp = otherPoly.getCoefficient(i) + poly[i];
        otherPoly.changeCoefficient(i,temp);

     } // end for
     
     return otherPoly;

} // end method

//***********************************************************//
// toString() method outputs the present polynomial.         //
// Precondition:					     //
// Postcondition: This outputs our polynomial as a series    //
// of terms, each with coefficient followed by degree of x.  //
//***********************************************************//

public String toString()
{

      boolean firstNum = true;
      String output = new String("");
//*******************************************************************************//     
// This method creates output in modular chunks, as a means of staying flexible  //
// to the range of different structures a polynomial can take. Only indicies     //
// that are non-zero are represented. Each pass of the loop takes the int value  //
// at poly[i] and writes it as the coefficient for a variable degree of x.       //
// Positive coefficients that are not the first number get output with a "+"     //
// sign.   									 //
//*******************************************************************************//

      for (int i = poly.length-1; i>=0; i--)
      {
            if (poly[i] != 0)
            {
                  
                  if ((firstNum == false) && (poly[i] > 0))
                  {
                        output += "+";
                  }
            
  
                  switch (i)    // This switch statent accounts for the presence of
                                // a coefficient of 1, which will not be output. 
                  {
		       case 1:  if (poly[i] == 1)
				{
				      output += "x";
                                      break; 
			        }else
                                {
				      output += poly[i] + "x";
	                              break;
                                }


		       case 2:  if (poly[i] == 1)
				{
				      output += "x^2";
                                      break; 
			        }else
                                {
				      output +=  poly[i] + "x^2";
	                              break;
                                }

		       case 3:  if (poly[i] == 1)
				{
				      output += "x^3";
                                      break; 
			        }else
                                {
				      output +=  poly[i] + "x^3";
	                              break;
                                }

		       case 4:  if (poly[i] == 1)
				{
				      output += "x^4";
                                      break; 
			        }else
                                {
				      output +=  poly[i] + "x^4";
	                              break;
                                }

		       case 5:  if (poly[i] == 1)
				{
				      output += "x^5";
                                      break; 
			        }else
                                {

				      output +=  poly[i] + "x^5";
	                              break;

                                } 

		       default: output += poly[i]; 
			   

                   } // end switch

             // This flag records that we have moved past the first index of the polynomial. 

             firstNum = false;

             } // end if

        } // end for   

    return output;

    } // end toString()

     class InvalidPowerException extends RuntimeException
     { 
             public InvalidPowerException(String s)
             {
                super(s);
             }

     }   

} // end Polynomial class

