package hacker.rank;

public class Day21 {
	
	//generics challenge

	public static <E> void printArray(E[] generic){
	    for(E element : generic) {
	        System.out.println(element); 
	    }
	}
}