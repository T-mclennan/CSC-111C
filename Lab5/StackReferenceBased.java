/**
*   ReferenceBasedStack.java defines a Class that represents a stack object. 
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
// Class for a reference based Stack object: 				                      
// ****************************************************************************//
public class StackReferenceBased<T>
{
       private Node<T> top;

       // default constructor:
       public StackReferenceBased()
       {
             top = null;

       } // end default constructor

       //-----------------------------------------------------------------------//
       // isEmpty() checks to see if the stack is empty, returns boolean.
       // Preconditions: no precondition.
       // Postcondition: Returns true if the stack is empty, false otherwise.
       //-----------------------------------------------------------------------//
       public boolean isEmpty()
       {
              return top == null;

       } // end isEmpty


       //-----------------------------------------------------------------------//
       // push() creates a new item on the stack and sets it top.
       // Preconditions: takes in an item of specified object type.
       // Postcondition: Creates new Node and assigns top to reference it.
       //-----------------------------------------------------------------------//
       public void push(T newItem)
       {
              top = new Node<T>(newItem, top);

       } // end push

       //-----------------------------------------------------------------------//
       // pop() removes and returns the top item of the stack.
       // Preconditions: none empty stack.
       // Postcondition: Removes and returns the top node of the stack.
       //-----------------------------------------------------------------------//
       public T pop() throws StackException
       {       

		if (!isEmpty())
                {
                     // saves the top node in temp, re-assigns top, then returns temp:
                     Node<T> temp = top;
                     top = top.next;
                     return (T)temp.item;  


	        } else
                {
		     throw new StackException("Stack Exception on " +
                                               "pop: stack empty");
                } // end else

       } // end pop

       //-----------------------------------------------------------------------//
       // popAll() clears the whole stack of content, erasing all items.
       // Preconditions: no precondition.
       // Postcondition: Sets the top reference to zero, clearing stack.
       //-----------------------------------------------------------------------//
       public void popAll()
       {
              top = null;

       } // end popAll

       //-----------------------------------------------------------------------//
       // peek() returns the top item of the stack without removing it.
       // Preconditions: A non-empty stack must be present.
       // Postcondition: returns the top item of the stack.
       //-----------------------------------------------------------------------//
       public T peek() throws StackException
       {
		if (!isEmpty())
                {
                     return (T)top.item;
	        } else
                {
		     throw new StackException("Stack Exception on " +
                                               "peek: stack empty");
                } // end else
       } // end peek


} // end class StackReferenceBased

