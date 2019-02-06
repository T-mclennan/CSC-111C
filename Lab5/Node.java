/**
*   Node.java defines a Class that represents a node object. 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     4/22/17
*
*
*
*
**/

import java.util.*;

// ****************************************************************************//
// Class for Node object: 				                      
// ****************************************************************************//
public class Node<T>

{
      T item;
      Node<T> next;

      Node(T newItem)
      {
            item = newItem;
            next = null;
      } // end constructor

      Node(T newItem, Node<T> nextNode)
      {
            item = newItem;
            next = nextNode;
      } // end constructor

} // end class Node

