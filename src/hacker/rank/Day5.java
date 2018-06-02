package hacker.rank;

import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		
	 Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
	       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
	        
	        for(int i =1; i <=10; i++)
	            System.out.println(n+" x "+i+" = "+i *n);
	        

	        scanner.close();
	    }
	}