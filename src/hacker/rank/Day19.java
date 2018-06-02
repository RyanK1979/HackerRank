package hacker.rank;

public class Day19 {
	
	//this was an interface challenge, so had a class of calculator that implemented AdvancedArithmetic

	public int divisorSum(int n) {
        int sum = n;
        for (int i = 1; i <= n/2; i++) {
            if (n % i == 0)
                sum += i;
        }
        return sum;
    }
}
