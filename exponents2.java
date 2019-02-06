// Lab Assignment 1 - Tristan Mclennan - CS111C
//
// The Exponent program explores three different methods for computing the power of an integer,
// while counting the number of multiplications and recursive calls used. 

//********************************************************************
//  Exponents is our main class, runs exponent tests:
//********************************************************************

import java.io.*;

public class Exponents
{
   public static void main (String [] args)
   {
      
       Powers p = new Powers();
      
       System.out.println("The iterative solution (1) for 2^19 is : " + p.power1(2,19));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println();
       System.out.println("The first recursive solution (2) for 2^19 is : " + p.power2(2,19));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursions: " + p.getRecurs());
       System.out.println();
       System.out.println("The second recursive solution (3) for 2^19 is : " + p.power3(2,19));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursions: " + p.getRecurs());
       System.out.println();
       System.out.println("The iterative solution (1) for 2^32 is : " + p.power1(2,32));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println();
       System.out.println("The first recursive solution (2) for 2^32 is : " + p.power2(2,32));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursions: " + p.getRecurs());
       System.out.println();
       System.out.println("The second recursive solution (3) for 2^32 is : " + p.power3(2,32));
       System.out.println("# of multiplications: " + p.getMult());
       System.out.println("# of recursions: " + p.getRecurs());

   }
}


//***********************************************************************
//  The Powers class provides 3 different methods for finding the value 
// of an integer exponent, and tracks instances of multiplication / recursion use:
//***********************************************************************

public class Powers
{
   private int multipliction;
   private int recursion;



   //-----------------------------------------------------------------
   //  Constructor for Powers object:
   //-----------------------------------------------------------------
   public Powers()
   {
     multiplication = 0;
     recursion = 0;
   }
     
   //-----------------------------------------------------------------
   //  An iterative method of finding x^n:
   //  Precondition: n must be equal or greater than 0.
   //  Postcondition: returns x^n.
   //-----------------------------------------------------------------
   public int power1(int x, int n)
   {
       multiplication = 0;         // resets counter
       int total = 1;     

       for (int i = 0; i < n; i++) // multiplies x by itself n times
       {	   
	   total *= x;
	   multiplicaion++;	   // increments multiplicaion counter

       }   
   
       return total;               // if n = 0, returns a value of 1
   } 

   //-----------------------------------------------------------------
   //  The first recursive method for finding x^n:
   //  Precondition: n must be equal or greater than 0.
   //  Postcondition: returns x^n
   //-----------------------------------------------------------------
   public int power2(int x, int n)
   {
       multipliction = 0;
       recursion = 0;
       int total = 0;

       if (n == 0) 
       {
           return 1;                // basecase
 
       }   else 
           {

               multiplicaion++;     // increments counters
               recursion++;  	
	    
               return x*power2(n-1); // recursive call for power2(n-1)
           }
   }

   //-----------------------------------------------------------------
   //  The second recursive method for finding x^n: 
   //  Precondition: n must be equal or greater than 0.
   //  Postcondition: returns x^n
   //-----------------------------------------------------------------
   public int power3(int x, int n)
   {
       multipliction = 0;
       recursion = 0;
       int total = 0;

       if (n == 0) 
       {
            return 1;                             // basecase: returns 1 if n=0
 
       } else if  (n>0 && (n%2 == 0))             // if n is even and greater than zero
              {

                multiplicaion = multiplicaion +3; //I'm counting division
                recursion = recursion + 2;  	  //as a multiplication operation

                return power3(x,n/2)*power3(x,n/2); //two recursive calls:
               }                                   // n/2 diminishes n towards basecase

         else  if (n>0 && (n%2 == 1))              // if n is odd and greater than zero
               {
                 
                multiplicaion = multiplicaion +4; 
                recursion = recursion + 2;  	  
                
                return x*(power3(x,n/2)*power3(x,n/2)); //two recursive calls:
               }				     // n/2 diminishes n towards basecase
              
   }

   //-----------------------------------------------------------------
   //  Resets the multiplication and recursion counters:
   //-----------------------------------------------------------------
   public void resetCounters()
   {
     multiplication = 0;
     recursion = 0;
   }

   //-----------------------------------------------------------------
   //  Returns the value of the multiplication counter:
   //-----------------------------------------------------------------
   public int getMult()
   {
     return multiplication;
   }

   //-----------------------------------------------------------------
   //  Returns the value of the recursion counter:
   //-----------------------------------------------------------------
   public int getRecurs()
   {
     return recursion;
   }
}
