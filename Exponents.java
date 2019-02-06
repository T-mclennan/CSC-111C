//
// Lab Assignment 1 - Tristan Mclennan - CS111C
//
// The Exponent program explores three different methods for computing the power of an integer,
// while counting the number of multiplications and recursive calls used. 

//*************************************************************************
//  Exponents is our main class, runs sample outputs of the Powers methods:
//*************************************************************************

import java.io.*;

public class Exponents
{
   public static void main (String [] args) // begin main
   {

//*************************************************************************
//  Here we run three different version of x^n, each with a tally of their 
//  respective multiplication opperations and recursive calls:  						
//*************************************************************************
      
       Powers p = new Powers();

       System.out.println();     
       System.out.println("The iterative solution (1) for 3^19 is : " + p.power1(3,19));
       System.out.println("# of multiplications: " + p.getMult());
       p.resetCounters();  
       System.out.println();
       System.out.println("The first recursive solution (2) for 3^19 is : " + p.power2(3,19));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursive calls: " + p.getRecurs());
       p.resetCounters(); 
       System.out.println();
       System.out.println("The second recursive solution (3) for 3^19 is : " + p.power3(3,19));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursive calls: " + p.getRecurs());
       p.resetCounters(); 
       System.out.println();
       System.out.println("The iterative solution (1) for 3^32 is : " + p.power1(3,32));
       System.out.println("# of multiplications: " + p.getMult());
       p.resetCounters(); 
       System.out.println();
       System.out.println("The first recursive solution (2) for 3^32 is : " + p.power2(3,32));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursive calls: " + p.getRecurs());
       p.resetCounters(); 
       System.out.println();
       System.out.println("The second recursive solution (3) for 3^32 is : " + p.power3(3,32));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursive calls: " + p.getRecurs());
       p.resetCounters(); 

   }
}                                            // end main


