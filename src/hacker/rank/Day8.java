package hacker.rank;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day8 {

	public static void main(String[] args) {
		
//		//declare a String to String Map
//		Map<String, String> myMap;
//		
//		//intialize It as a new String to String Hashmap
//		myMap = new HashMap<String, String>();
//		
//		//Change myMap to be a new (Completely different) String to String LinkedHashMap instead
//		myMap = new LinkedHashMap<String, String>();
		
		//Create a Map of String Keys to String Values, implemented by the HashMap class
		Map<String, String> myMap = new HashMap<String, String>();
		
		//Adds ("Hi", "Bye") mapping to myMap
		myMap.put("Hi", "Bye");
		
		//Print the Value mapped to from "Hi"
		System.out.println(myMap.get("Hi"));
		
		//replaces "Bye" mapping from "Hi" with "Bye!"
		myMap.put("Hi", "Bye!");
		
		//print the Value mapped to from "Hi"
		System.out.println(myMap.get("Hi"));

	}

}
