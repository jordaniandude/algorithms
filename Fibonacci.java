// This is a classic problem of calculating a fibonacci number. I'm using three different ways of implementing this algorithm:
// 1) Recursion
// 2) Enhanced Recursion with memoization (Dynamic Programming)
// 3) Bottom-Up apprach with a loop (Dynamic Programming)

import java.util.HashMap;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String args[]) {

		// input to print Fibonacci series upto how many numbers
		System.out
				.println("Enter number upto which Fibonacci series to print: ");
		int number = new Scanner(System.in).nextInt();

		System.out.println("Fibonacci series upto " + number + " numbers : ");
		// printing Fibonacci series upto number
		
		//for (int i = 1; i <= number; i++) {
			//System.out.print(fibonacciMomoized(i) + " ");
		//}
		System.out.print(fibonacciBottomUp(number));

	}

	
	public static int fibonacciRecursive(int number) {
		if (number <=2) {
			return 1;
		}

		return fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2); // tail recursion
	}

	static HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

	public static int fibonacciRecursiveMomoized(int number) {
		if (map.containsKey(number)) {
			return map.get(number);
		}

		if (number <= 2) {
			return 1;
		} else {

			int result = fibonacciRecursiveMomoized(number - 1) + fibonacciRecursiveMomoized(number - 2);
			map.put(number, result);
			return result;
		}
	}
	public static int fibonacciBottomUp(int number) {
		
		for(int i=1;i<number+1;i++)
		{
			int result=0;
			if (i <= 2) {
				result =  1;
			} else {

				result = map.get(i - 1) + map.get(i - 2);
			}
			map.put(i, result);
		}
		return map.get(number);
	}
}
