package hacker.rank;

import javax.xml.soap.Node;

public class Day24 {
	
	//this is for removing duplicates as you might have guessed.  Is the solution for day 24 that I came up with.

	public static Node removeDuplicates(Node head) {
	     //Write your code here
	       Node currentNode = head;
	       while(currentNode!=null && currentNode.next!=null)
	           {
	           Node node = currentNode;
	           while(node.next!=null)
	               {
	               if(node.next.data==currentNode.data)
	                   {
	                   Node next = node.next.next;
	                   Node temp= node.next;
	                   node.next=next;
	                   temp=null;

	               }
	               else{
	               node=node.next;
	               }
	           }
	           currentNode=currentNode.next;
	       }
	       return head;
	   }
}