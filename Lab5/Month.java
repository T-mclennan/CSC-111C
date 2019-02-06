/**
*   Month.java defines a Class for a month object to be used in a BST. 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     5/11/17
*
*
*
*
**/

import java.util.*;

// ****************************************************************************//
// Class for Month object:			                      
// ****************************************************************************//
public class Month extends KeyedItem<String>
{
      private monthName;

      public Month(String newMonth)
      {
           super(newMonth);
           this.monthName = newMonth;

      } // end constructor

      public String toString()
      {
            return getKey();

      } // end toString

} // end class Node

