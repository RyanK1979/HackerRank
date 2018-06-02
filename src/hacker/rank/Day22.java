package hacker.rank;

import javax.xml.soap.Node;

public class Day22 {
	
	//binary search tree solution, the rest of the problem set was already filled out.  This was the code that was missing to complete the challenge.


	public static int getHeight(Node root){
	    //Write your code here
	      if(root ==null)
	          return -1;
	      int left=getHeight(root.left);
	      int right=getHeight(root.right);
	      return Math.max(left, right) + 1;
	  }
	}