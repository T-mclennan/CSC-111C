//
// Lab Assignment 3 - Tristan Mclennan - CS111C
//
//*************************************************************************
// Lab Assignment 3 is a driver program for our linked list implementation.
// Interfaces with the user and executes any commands as needed.
//*************************************************************************

import java.io.*;
import java.util.*;

public class Lab3
{
   public static void main (String [] args) // begin main
   {

    boolean runLoop = true;
    boolean noError = true;
    char inputNum;
    int  index = 0;
    String item;
    Scanner scan = new Scanner(System.in);

//  Creates new ListReferenceBased object for our driver program to use:
    ListReferenceBased myList = new ListReferenceBased();


//  This loop takes input from user, and executes chosen action.
//  breaks out of loop when runLoop is set to false:
    do
    {     // sets error flag for output:
          noError = true;

          System.out.println("\n1) Add item");
          System.out.println("2) Remove item");
          System.out.println("3) Reverse List");
          System.out.println("1) Exit Program");
          System.out.println("");
          System.out.print("Enter your choice (1-4):");
 
// User input is stored in inputNum
          inputNum = scan.next().charAt(0);

// Switch statement performs the action chosen by the user:
          switch (inputNum)
          {

              // 1: Adds a new item to the list based on user input:
              case '1':  System.out.print("Enter Position for add: ");
                         index = scan.nextInt();

                      //checks bounds of index, tells user if invalid:
		         if ((index > (myList.size()+1)) || (index < 1))
                         {
                             System.out.println("\nPosition is invalid.");
                             noError = false;
                             break;

                         } else
                         {

                             //input for item name:
                             System.out.print("Enter item to add: ");
                             item = scan.next();

                             //creates new node in linked list:
                             myList.add(index-1,item);
                             break;

                         } //end else 

             // 2: Removes an item from the list based on user input:
              case '2':  System.out.print("Enter Position for remove: ");
                         index = scan.nextInt();

                         //checks bounds of index, tells user if invalid:
		         if ((index > myList.size()) || (index < 1))
                         {
                             System.out.println("\nPosition is invalid.");
                             noError = false;
                             break;

                         } else
                         {


                             //removes node at index from list:
                             myList.remove(index-1);
                             break;

                         } // end else

              // 3: Reverses the order of our current list:
              case '3':  myList.reverseList();
                         break;

              // 4: Exits out of Program
              case '4':  runLoop = false;
                         noError = false;
                         System.out.println("\nGoodbye!");
                         break;

              default: System.out.println("Invalid input. ");
                
          } // end switch 

      // outputs list data at end of loop, if no error occured:
      if (noError)
      {
          System.out.print("\nList: ");
          for (int i = 0; i < myList.size(); i++)
          {
                System.out.print(myList.get(i) + " ");
          }
     
          System.out.print("\nNumber of items: " + myList.size() + "\n");
          if (myList.isSorted() == false)
          {
                System.out.println("List is not in sorted order.");

          }else 
          {
                System.out.println("List is in sorted order.");

          } // end if 
       } //end output if statement
    } // end while
    while (runLoop); 


   }  // end main
} // end Lab3
