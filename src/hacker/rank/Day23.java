package hacker.rank;

import java.util.LinkedList;
import java.util.Queue;

import javax.xml.soap.Node;

public class Day23 {
	
	//traversing a binary search tree fun, and excitment for the whole family.

	static void levelOrder(Node root){
	    //Write your code here
	      Queue<Node> queue = new LinkedList<Node>();
	      queue.add(root);
	      while(queue.peek()!=null)
	          {
	          Node node =queue.remove();
	          System.out.print(""+node.data+" ");
	          if(node.left!=null)
	              queue.add(node.left);
	          if(node.right!=null)
	              queue.add(node.right);
	      }
	  }
}