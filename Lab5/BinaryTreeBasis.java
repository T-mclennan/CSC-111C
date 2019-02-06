/**
*   TreeNode.java defines a basis Class for a binary search tree. 
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
// Class for BinaryTreeBasis: 				                      
// ****************************************************************************//
public abstract class BinaryTreeBasis<T>

{
      protected TreeNode<T> root;

   // default constructor:
      public BinaryTreeBasis()
      {
            root = null;
      } // end constructor

   // contructor that uses one item:
      public BinaryTreeBasis(T rootItem)
      {
            root = new TreeNode<T>(rootItem, null, null;
      } // end constructor

   // isEmpty: returns true if tree is empty, false otherwise:
      public boolean isEmpty()
      {
            return root == null;
      } // end isEmpty

   // makeEmpty: removes all nodes from the tree:
      public boolean isEmpty()
      {
            root = null;
      } // end makeEmpty

   // Returns the item in the tree's root:
      public T getRootItem() throws TreeException
      {
            if (root == null)
            {
                throw new TreeException("TreeException: Empty Tree");
            }
            else {
               return root.item;
            } // end if
      } // end getRootItem

} // end class TreeNode

