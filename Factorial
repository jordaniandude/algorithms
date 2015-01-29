// This is a classic solution for calculating a factorial for a given number, 
// including 2 ways of doing it, using a while loop and then recursively

public class Factorial {
	public static void main(String[] args)
	{
		long result = calculateFactorialRecursive(10);
		System.out.print(result);
	}
	
	public static long calculateFactorial(long number)
	{
		long result = number;
		while (number >1)
		{
			result*= number-1;
		    number --;	
		}
		return result;
	}
	public static long calculateFactorialRecursive(long number)
	{
		long result = number;
		if(number==1)
			return result;
		return number * calculateFactorialRecursive(number-1);
	}

}
