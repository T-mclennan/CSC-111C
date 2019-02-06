
/**
*  Calculator.java defines a Class that represents a calculator object. 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     4/22/17
*
*
*
*
**/

import java.io.*;
import java.util.*;


// ****************************************************************************//
// Class for Infix/Postfix Calculator object: 				                      
// ****************************************************************************//
public class Calculator 
{

       private String inputString;
       private String postFixString = "";
       private boolean isConverted = false;
       int result = 0;

       //-----------------------------------------------------------------------//
       // Default constructor for the Calculator object:
       //-----------------------------------------------------------------------//
       public Calculator(String exp)  
       {
             inputString = exp;
       }  // end constructor

       //-----------------------------------------------------------------------//
       // toString() Returns the original infix expression:
       // Preconditions: no precondition.
       // Postcondition: Returns the input String in infix notation:
       //-----------------------------------------------------------------------//  
       public String toString()
       {
              if (inputString != null)
              {
                    return inputString;
              }
               else
              {
                    return ("No infix expression present.");
              }
       } // end toString

       //-----------------------------------------------------------------------//
       // convertPostFix() converts the infix expression to postfix.
       // Preconditions: infix string can only contain single digits and +-*/() operators
       // Postcondition: Converts inputString to postfix and saves in postFixString.
       //-----------------------------------------------------------------------//
       private void convertPostFix()
       {
              StackReferenceBased<Character> charStack = new StackReferenceBased<Character>();
               
              // this iterates through the length of the string, assigning each char to c:
              for (int i = 0; i < inputString.length(); i++)
              {    

                    char c = inputString.charAt(i);  

                    switch (c)
                    {

                            case '-':
                            case '+':    
                                         // if the stack is empty push the operator onto the stack.
                                         // otherwise pop all operators of higher or equal priority, then push.
                                         while (!charStack.isEmpty() && (charStack.peek() != '('))
                                         {             
                                               postFixString += (char)charStack.pop();  
  
                                         } // end while

                                         charStack.push(c);                             
                                         break;
                            case '/':          
                            case '*':    // if the stack is empty push the operator onto the stack.
				         // otherwise pop all operators of equal priority, (until a '(', '+', or '-'
	                                 // are encountered) and then push current operator onto stack.
                                         while (!charStack.isEmpty() && (charStack.peek() != '(') && (charStack.peek() != '+') && (charStack.peek() != '-'))  
                                         {                                          
                                               postFixString += (char)charStack.pop();  
		                                        
                                         } // end while
                                         charStack.push(c);                                                                       
                                         break;
                         
                                         // if the character is a '(', push it onto stack.
                            case '(':    charStack.push(c);				
                                         break;

                                         // if the character is a ')', pop all operators until a '(' is reached.
                            case ')':    while (charStack.peek() != '(')
                                         {
                                              postFixString += (char)charStack.pop();
                                         }
                                         charStack.pop();
;
                                         break;

                                         
                                         

                                         // if the character is not an operator or a parenthesis, this means it is an operand,
                                         // and should be appended to our output string.
                            default:    
                                          postFixString += c; 
                                                             

                    } // end swtich

              } // end for

              // pops any remaining operators of the stack and adds to postfix:
              while (!charStack.isEmpty())
              {
                     postFixString += (char)charStack.pop();
              } // end while

       } // end convertPostFix
       

       //-----------------------------------------------------------------------//
       // getPostFix() checks to see if the stack is empty, returns boolean.
       // Preconditions: no precondition.
       // Postcondition: Returns the resulting postfix expression:
       //-----------------------------------------------------------------------//
       public String getPostFix()
       {
              convertPostFix();
              return postFixString;

       } // end getPostFix


       //-----------------------------------------------------------------------//
       // evaluate() calculates and returns the numeric value of the postfix expression.
       // Preconditions: A proper prefix expression must be present in postFixString.
       // Postcondition: Returns the resulting postfix expression:
       //-----------------------------------------------------------------------//
       public int evaluate()
       {
            // creates an Integer Object stack for the evaluation method:
            StackReferenceBased<Integer> intStack = new StackReferenceBased<Integer>();
            int op1 = 0;
            int op2 = 0;
	    int result = 0;

	    // this iterates through the string, loading each char into c:
            for (int i=0; i < postFixString.length(); i++)
            {

		    char c = postFixString.charAt(i);
                    switch (c)
                    {

                            case '+':    // when a + operator is seen, this pops two operands of the stack, adds them, 
 					 // then pushes the result:
                                         op2 = intStack.pop();     
                                         op1 = intStack.pop();
				         intStack.push(op1 + op2);                                                     
                                         break;
                         
                            case '-':    // when a - operator is seen, this pops two operands of the stack, subtracts, 
 					 // then pushes the result:
                                         op2 = intStack.pop();     
                                         op1 = intStack.pop();
				         intStack.push(op1 - op2);                                                     
                                         break;

                            case '/':    // when a / operator is seen, this pops two operands of the stack, divides them, 
 					 // then pushes the result:
                                         op2 = intStack.pop();     
                                         op1 = intStack.pop();
				         intStack.push(op1 / op2);                                                     
                                         break;

                            case '*':    // when a * operator is seen, this pops two operands of the stack, multiplies them, 
 					 // then pushes the result:
                                         op2 = intStack.pop();     
                                         op1 = intStack.pop();
				         intStack.push(op1 * op2);                                                     
                                         break;

                                         // if the character is not an operator this means it is an operand,
                                         // and should therefore be pushed onto the stack:
                            default:     intStack.push(Character.getNumericValue(c));


                    } // end swtich   

            } // end for loop 
            
            return (intStack.pop());

       } // end evaluate 

} // end class Node


