package hacker.rank;

import java.util.Scanner;

public class Day14 {
	
	//this is the solution to the problem, on the site they provide you with the solution class with the rest
	
	private int[] elements;
  	public int maximumDifference;

	public Difference(int[] a) {
		  elements = a;
		}

		public void computeDifference() {
		  int max = 0;
		  for (int i = 0; i < elements.length-1; i++) {
		      for (int j = i+1; j < elements.length; j++) {
		          int diff = Math.abs(elements[i] - elements[j]);
		          if (diff > max) 
		              max = diff;
		      }
		  }
		  maximumDifference = max;
		}
}
