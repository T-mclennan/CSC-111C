//
// Lab Assignment 1 - Tristan Mclennan - CS111C
//
//*************************************************************************
// The PolyAddition application creates two polynomial objects from user input,
// adds them together, and outputs the results.
//*************************************************************************

import java.io.*;

public class PolyAddition
{
   public static void main (String [] args) // begin main
   {

// Construct polynomial objects:

        System.out.println("Please enter values for the first polynomial: ");  
        Polynomial Poly1 = new Polynomial();

        System.out.println("Please enter values for the second polynomial: "); 
        Polynomial Poly2 = new Polynomial();

// Outputs Poly1 + Poly2:
  
        Poly2 = Poly1.add(Poly2);
        System.out.println(Poly2);


   }
}                                            // end main
