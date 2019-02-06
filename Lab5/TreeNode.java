/**
*   TreeNode.java defines a Class that represents a TreeNode object. 
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
// Class for TreeNode object: 				                      
// ****************************************************************************//
public class TreeNode<T>

{
      T item;
      TreeNode<T> leftChild;
      TreeNode<T> rightChild;

      //initializes a tree node with no children:
      public TreeNode(T newItem)
      {
            item = newItem;
            leftChild = null;
            rightChild = null;
      } // end constructor

      //initializes a tree node with left and ride children references:
      public TreeNode(T newItem, TreeNode<T> left, TreeNode<T> right)
      {
            item = newItem;
            leftChild = left;
            rightChild = right;
      } // end constructor

} // end class TreeNode

