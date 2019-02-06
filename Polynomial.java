/**
*   Polynomial.java defines a Class that represents a polynomail object. 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     3/2/17
*
*
*
*
**/


public Class Polynomial 

{

Scanner scan = new Scanner(System.in);



//*************************************************//
// Constructor for polynomial class.               //
// Precondition: no precondition.                  //
// Postcondition: Creates and populates int array  //
// to hold the polynomial object's coefficients.   //
//*************************************************//

public void Polynomial()
{

// creates an array to hold coeffients of X^5-X^0:

private int[] poly = new int[6];
system.out.println("Please enter values for the polynomial: ");


// this loop prompts for input in populating the array:
     for (i=poly.length-1; i<=0; i--)
     {
         system.out.println("Coefficient for X^", + i,":");
         poly[i] = scan.nextInt();

     }
}


//*************************************************//
// Constructor that populates array upon creation: //
// takes in X^0 first, then X^1, etc...            //
// Precondition: no precondition.                  //
// Postcondition: Creates and populates int array  //
// to hold the polynomial object's coefficients.   //
//*************************************************//

public void Polynomial(int num0, int num1, int num2, int num3, int num4, int num5)
{

     int[] poly = new int[6];

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
// Precondition:
// Postcondition:
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
// Precondition:
// Postcondition:
//*************************************************//

private int getCoefficient(int power)
                      throws InvalidPowerException
{ 
     try 
     {  
         return poly[power];

     } // end try

     catch (InvalidPowerException e)
     {
          System.out.println("The power at index + "
          power + " is out of range, not in polynomial.");
          
          e.printStackTrace();
     } // end catch
} 

//*************************************************//
// changeCoefficient method takes two integers,    //
// changes the coefficient at that degree:         //
// Precondition:
// Postcondition:
//*************************************************//

private void changeCoefficient(int power, int value)
                      throws InvalidPowerException
{ 
     try 
     {  
         poly[power] = value;

     } // end try

     catch (InvalidPowerException e)
     {
          System.out.println("The power at index + "
          power + " is out of range, not in polynomial.");
          
          e.printStackTrace();
     } // end catch
} 

//*************************************************//	
// Add method takes in another polynomial, adds it //
// to this polynomial, the returns that result.    //
// Precondition:
// Postcondition:
//*************************************************//

public Polynomial add(Polynomial otherPoly)
{
     for (int i = 0: i < otherPoly.length; i++)
     {
        otherPoly[i] = otherPoly[i] + poly[i];

     }
     
     return otherPoly;

}

//***********************************************************//
// toString() method outputs the present polynomial.        
// Precondition:
// Postcondition: This outputs our polynomial as a series
// of terms, each with the coefficient followed by degree of x. 
//***********************************************************//

public static string toString()
{

      boolean firstNum = false;
      
// This method creates output in modular chunks, as a means of staying flexible
// to the range of different structures a polynomial can take. Only indicies
// that are non-zero are represented. Each pass of the loop takes the int value
// at poly[i] and writes it as the coefficient for a variable degree of x. 
// Positive coefficients that are not the first number get output with an addition
// sign. 


      for (int i = poly.length-1; i>=0; i--)
      {
            if (poly[i] != 0)
            {
                  
                  if ((poly[i] < 0) && (firstNum = false))
                  {
                        system.out.println("+");
                  }
            
  
                  switch (i)    // This switch statent accounts for the presence of
                                // a coefficient of 1, which will not be output. 
                  {
		       case 1:  if (poly[i] == 1)
				{
				      system.out.println("x");
                                      break; 
			        }else
                                {
				      system.out.println(poly[i]+ "x");
	                              break;
                                }


		       case 2:  if (poly[i] == 1)
				{
				      system.out.println("x^2");
                                      break; 
			        }else
                                {
				      system.out.println(poly[i]+ "x^2");
	                              break;
                                }

		       case 3:  if (poly[i] == 1)
				{
				      system.out.println("x^3");
                                      break; 
			        }else
                                {
				      system.out.println(poly[i]+ "x^3");
	                              break;
                                }

		       case 4:  if (poly[i] == 1)
				{
				      system.out.println("x^4");
                                      break; 
			        }else
                                {
				      system.out.println(poly[i]+ "x^4");
	                              break;
                                }

		       case 5:  if (poly[i] == 1)
				{
				      system.out.println("x^5");
                                      break; 
			        }else
                                {

				      system.out.println(poly[i]+ "x^5");
	                              break;

                                }

		       default: system.out.println(poly[i]); 
			   

                   }

             // This flags that we have moved past the first index of the polynomial. 

             firstNUm = false;
             }

      }

      class InvalidPowerException extends RuntimeException
      {
             public InvalidPowerException(String s)
             {
                super(s);
             }

      }
}

