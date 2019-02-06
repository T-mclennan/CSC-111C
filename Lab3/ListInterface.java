/**
*   ListInterface.java defines an interface for a generic List Class: 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     4/2/17
*
*
*
*
**/

import java.util.*;

// ****************************************************************************//
// Interface for the ADT List: 				                       //
// ****************************************************************************//
public interface ListInterface
{
       //list operations

       public boolean isEmpty();
       public boolean isSorted();
       public int size();
       public void removeAll();
       public void reverseList();
       public void add(int index, String item)
                       throws ListIndexOutOfBoundsException;
       public void remove(int index)
                       throws ListIndexOutOfBoundsException;  
       public String get(int index)
                       throws ListIndexOutOfBoundsException;      

}      // end ListInterface


