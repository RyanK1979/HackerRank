package hacker.rank;

import java.util.LinkedList;

public class Day15 {

	public static void main(String[] args) {
		LinkedList<String> myLinkedList = new LinkedList<String>();
		
		//add a node with data="first" to back of the empty list
		myLinkedList.add("First");
		
		//add a node with data = "second to the back of the list
		myLinkedList.add("Second");
		
		//add a node with data = "third" to the back of the list
		myLinkedList.addFirst("Third");
		
		//add a node with data = fourth at the back of the list
		myLinkedList.addLast("Fourth");
		
		//add a node with the data = "Fifth" at index 2
		myLinkedList.add(2, "Fifth");
		
		//print the list: [Third, First, Fifth, Second, Fourth]
		System.out.println(myLinkedList);
		
		//print the value at list index 2:
		System.out.println(myLinkedList.get(2));
		
		//empty the list
		myLinkedList.clear();
		
		//print the newly emptied list: []
		System.out.println(myLinkedList);
		
		//adds a node with datat = Sixth to back of the empty list
		myLinkedList.add("Sixth");
		System.out.println(myLinkedList); //prints the list
	}

}
