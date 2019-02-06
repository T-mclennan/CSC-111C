/**
*   Node.java defines a Class that represents a node object. 
*
*   @author:   Tristan Mclennan
*   @version:  1.0
*   @date:     4/2/17
*
*
*
*
**/

// ****************************************************************************//
// Class for Node object: 				                      
// ****************************************************************************//
public class Node 

{
      String item;
      Node next;

      Node(String newItem)
      {
            item = newItem;
            next = null;
      } // end constructor

      Node(String newItem, Node nextNode)
      {
            item = newItem;
            next = nextNode;
      } // end constructor

} // end class Node

