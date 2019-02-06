/**
*   ListReferenceBased.java defines a Class that represents a List object. 
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
// Reference-based implementation of ADT List: 		                       //
// ****************************************************************************//
public class ListReferenceBased implements ListInterface 
{
 
       private Node head;

       // definitions of constructors and methods:

       // default constructor:
       public ListReferenceBased()
       {
              head = null;
       }      // end default constructor 

       //-----------------------------------------------------------------------//
       // size() counts and returns the number of items present in the list.
       // Preconditions: No preconditions. 
       // Postcondition: Returns an int, the number of items present in the list.
       //-----------------------------------------------------------------------//
       public int size()
       {
              int numItems = 0;
              Node curr = head;

              while (curr != null)
              {
                   curr = curr.next;
                   numItems++;
              }
              return numItems;
       }      // end size


       //-----------------------------------------------------------------------//
       // isEmpty() checks to see if the list is empty, returns boolean.
       // Preconditions: no precondition.
       // Postcondition: Returns true if the list is empty, false otherwise.
       //-----------------------------------------------------------------------//
       public boolean isEmpty()
       {
              return (this.size() == 0);
       }      // end isEmpty

       //-----------------------------------------------------------------------//
       // reverseList reverses the order of our list objects.
       // Preconditions: no proconditions.
       // Postcondition: The items in the list are put in opposite order. 
       //-----------------------------------------------------------------------//
       public void reverseList()
       {

              // pointer Nodes used in manipulating references:
              Node curr = head;
              Node next = null;
              Node prev = null;

              // starting at the head, this moves forward through the list, updating
              // the .next field of each node to the node behind it. In the case of the first
              // Node this sets .next to null:
              while (curr != null)
              {

                   // sets next to following node or null:
                   next = curr.next;

                   // sets the .next field of our current Node to the previous Node:
                   curr.next = prev;

                   // moves prev and curr forward in list:
                   prev = curr;
                   curr = next;

               } // end while loop 

               // Sets head pointer to reference last item in list:
               head = prev;

       } // end reverse

       //-----------------------------------------------------------------------//
       // Get() Gets the item present at an index in the list.
       // Preconditions: index is the number of the desired item. Assumes that 
       // 1 <= index <= numItems+1
       // Postcondition: Returns the String item contained in the Node at the index.
       //-----------------------------------------------------------------------//
       public String get(int index)
                     throws ListIndexOutOfBoundsException
       {
              if (index >= 0 && index < this.size())
              {
                    Node curr = find(index);
                    String dataItem = curr.item;
                    return dataItem;
              }
              else {
                  throw new ListIndexOutOfBoundsException(
                                   "list index out of bounds on get");
              } // end if 
       } // end get

      //-----------------------------------------------------------------------//
      // Find() locates a specified node in a linked list.
      // Preconditions: index is the number of the desired node. Assumes that 
      // 1 <= index <= numItems+1
      // Postcondition: Returns a reference to the desired node.
      //-----------------------------------------------------------------------//
      public Node find(int index)
      {
          Node curr = head;
          for (int skip = 0; skip < index; skip++)
          {
               curr = curr.next;
          } // end for

       return curr;
       } // end find

      //-----------------------------------------------------------------------//
      // isSorted() checks to see if the current list is sorted.
      // Preconditions: No preconditions. 
      // Postcondition: Returns true if sorted, false if not. Lists that are empty
      // or that have one item are considered sorted. 
      //-----------------------------------------------------------------------//
      public boolean isSorted()
      {
          Node curr = head;
          boolean sorted = true;

          while (curr.next != null)
          { 
             // if current item is bigger than next, return false, not sorted:
                if (curr.item.compareTo(curr.next.item) > 0)
                   sorted = false;

                curr = curr.next;
          }

       return sorted;
       } // end find

       //-----------------------------------------------------------------------//
       // add() creates a new node in the list for the item, at the given index.
       // Preconditions: takes in an int index and String name for the item.
       // Postcondition: creates a node containing the String at the given index.
       //-----------------------------------------------------------------------//
       public void add(int index, String item)
                     throws ListIndexOutOfBoundsException
       {
              if (index >= 0 && index < this.size()+1)
              {
                    if (index == 0)
                    {  // insert new node at beginning of list:
                          Node newNode = new Node(item, head);
                          head = newNode;
                    } else
                      {
                          Node prev = find(index-1); 
                          Node newNode = new Node(item, prev.next);
                          prev.next = newNode;

                    }  // end if 
              }
              else {
                  throw new ListIndexOutOfBoundsException(
                                   "list index out of bounds on add.");
              } // end if 
       } // end add

       //-----------------------------------------------------------------------//
       // remove() deletes an item from the linked list.
       // Preconditions: index is the number of the desired node. Assumes that 
       // 1 <= index <= numItems+1
       // Postcondition: Removes the node at the given index.
       //-----------------------------------------------------------------------//
       public void remove(int index)
                     throws ListIndexOutOfBoundsException
       {
              if (index >= 0 && index < this.size())
              {
                    if (index == 0)
                    {  // deletes the first node at beginning of list:
                          head = head.next;
                    } else
                    {
                          Node prev = find(index-1); 

                       // deletes the node after the node that prev
                       // referencces:
                          Node curr = prev.next;
                          prev.next = curr.next;

                    }  // end if 
              }
              else {
                  throw new ListIndexOutOfBoundsException(
                                   "list index out of bounds on remove.");
              } // end if 
       } // end remove

       //-----------------------------------------------------------------------//
       // removeAll() deletes every item in the list. 
       // Preconditions: No preconidtions.
       // Postcondition: Removes every node in the list by setting head to null.
       //-----------------------------------------------------------------------//
       public void removeAll()
       {
              head = null;

       }  // end removeAll



} // end ListReferenceBased class

