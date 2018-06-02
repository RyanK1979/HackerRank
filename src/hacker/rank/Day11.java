package hacker.rank;

public class Day11 {

	public static void main(String[] args) {
		int rowSize = 2;
		int colSize = 4;
		int[][] myArray = new int[rowSize][colSize];
		
		int count = 0;
		
		for(int i = 0; i < rowSize; i++) {
			for(int j = 0; j < colSize; j++, count++) {
				myArray[i][j] = count;
			}
		}
		
		for(int i = 0; i < rowSize; i++) {
			//print the row of space-seperated values
			for(int j = 0; j < colSize; j++) {
				System.out.println(myArray[i][j] + " ");
			}
			//end of row is reached, print new line
			System.out.println();
		}

	}

}
