package hacker.rank;

public class Day7 {

	public static void main(String[] args) {
		//the number of elements we want to hold in an array
		final int _arraySize = 4;
		
		//our array declaration
		String[] stringArray = new String[_arraySize];
		
		for(int i = 0; i < _arraySize; i++) {
			//assign value to index i
			stringArray[i] = "This is stored in index " + i;
			
			//print value saved in index i
			System.out.println(stringArray[i]);
		}

	}

}
