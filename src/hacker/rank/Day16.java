package hacker.rank;

import java.util.Scanner;

public class Day16 {

	public static void main(String[] args) {
		
		//exceptions - Strings problem

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		try {
			int intValue = Integer.parseInt(S);
			System.out.println(intValue);
		} catch (NumberFormatException nfe) {
			System.out.println("Bad String");
		}

		sc.close();
	}
}