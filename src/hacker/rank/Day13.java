package hacker.rank;

public class Day13 {

	//abstract class exercise.  This works in hackerrank coding challenge, obviously errors out on the IDE on here since its a lone class 
	
	 private int price;
	    public MyBook (String title, String author, int price) {
	        super(title, author);
	        this.price = price;
	    }
	    
	    void display() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Price: " + this.price);
	    }
	}