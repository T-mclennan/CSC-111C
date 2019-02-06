
//***********************************************************************
//  The Powers class provides 3 different methods for finding the value 
// of an integer exponent, and tracks instances of multiplication / recursion use:
//***********************************************************************

public class Powers
{
   private int multi;
   private int recursion;



   //-----------------------------------------------------------------
   //  Constructor for Powers object:
   //-----------------------------------------------------------------
   public Powers()
   {
     resetCounters();
   }
     
   //-----------------------------------------------------------------
   //  An iterative method of finding x^n:
   //  Precondition: n must be equal or greater than 0.
   //  Postcondition: returns x^n.
   //-----------------------------------------------------------------
   public int power1(int x, int n)
   {
       resetCounters();        // resets counter
       int total = 1;     

       for (int i = 0; i < n; i++) // multiplies x by itself n times
       {	   
	   total *= x;
	   multi++;	   // increments multiplicaion counter

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

       if (n == 0) 
       {
           return 1;                // basecase
 
       }   else 
           {

               multi++;     // increments counters
               recursion++;  	

               return x*power2(x,n-1); // recursive call:
           }                           // n-1 diminishes n towards basecase
   }

   //-----------------------------------------------------------------
   //  The second recursive method for finding x^n: 
   //  Precondition: n must be equal or greater than 0.
   //  Postcondition: returns x^n
   //-----------------------------------------------------------------
   public int power3(int x, int n)
   {

       if (n == 0) 
       {
            return 1;                             // basecase: returns 1 if n=0
 
       } else if  (n>0 && (n%2 == 0))             // if n is even and greater than zero
              {

                multi = multi +3; //I'm counting division
                recursion = recursion + 2;  	  //as a multiplication operation

                return power3(x,n/2)*power3(x,n/2); //two recursive calls:
               }                                   // n/2 diminishes n towards basecase

         else  //if (n>0 && (n%2 == 1))              // if n is odd and greater than zero
               {
                 
                multi = multi +4; 
                recursion = recursion + 2;  	  
                return x*(power3(x,n/2)*power3(x,n/2)); //two recursive calls:
               }				     // n/2 diminishes n towards basecase
              
   }

   //-----------------------------------------------------------------
   //  Resets the multiplication and recursion counters:
   //-----------------------------------------------------------------
   public void resetCounters()
   {
     multi = 0;
     recursion = 0;
   }

   //-----------------------------------------------------------------
   //  Returns the value of the multiplication counter:
   //-----------------------------------------------------------------
   public int getMult()
   {
     return multi;
   }

   //-----------------------------------------------------------------
   //  Returns the value of the recursion counter:
   //-----------------------------------------------------------------
   public int getRecurs()
   {
     return recursion;
   }
}
