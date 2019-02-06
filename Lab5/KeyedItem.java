/**
*   KeyedItem.java defines an abstract Class for an item to be used in a BST. 
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
// Class for KeyedItem object: 				                      
// ****************************************************************************//
public abstract class KeyedItem<KT extends
                                      Comparable<? super KT>>

{
      private KT searchKey;

      public KeyedItem(KT key)
      {
           searchKey = key;

      } // end constructor

      public KT getKey()
      {
            return searchKey;

      } // end getKey

} // end class Node

