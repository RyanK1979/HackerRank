package hacker.rank;

public class Day12 {
	
	//was an inheritence exercise, so obviously doesn't work since I don't have the other classes that it tries to call.  Works perfectly on Hackerrank though!

	private int[] testScores;
    Student(String firstName, String lastName, int identification , int [] scores)
    {
    super(firstName,lastName,identification );
    this.testScores=scores;
}

public String calculate()
    {
    int sum =0;
    for(int i : this.testScores)
        {
        sum+=i;
    }
    double avg= sum/testScores.length;
    if (avg<=100 && avg>=90)
        {
        return "O";
    }else if(avg<90 && avg>=80)
        {
         return "E";
    }
    else if(avg<80 && avg>=70)
        {
         return "A";
    }
    else if(avg<70 && avg>=55)
        {
         return "P";
    }
     else if(avg<55 && avg>=40)
        {
         return "D";
    }
    else{
         return "T";
    }
}

}