// This class includes an implementation of 2 of the most famous search algorithms, Brute Force and Binary Search
// Brute Force (Linear Search) Time Complexity O(n)
// Binary Search Time Complexity O(log(n))

public class Search {

	public static void main(String[] args)
	{
		int[] array = 	{1,6,14,17,29,33,37,42,44,45,50,64,66,71,80,90,100,102,103
						,104,106,110,111,112,133,134,140,150,155,156,157,170,180,181,182
						,183,185,190,200,201,202,203,205,207,210,214,215,216,222,223,234};
		int target = 3333;
		long startTime = System.nanoTime();
		
		int answer = bruteForce(array,target);
		long endTime = System.nanoTime();
		long duration = (endTime - startTime);
		
		System.out.println("bruteforce index = "+answer +", took "+ duration +" nano seconds");
		
		startTime = System.nanoTime();
		
		answer = binarySearch(array,target);
		endTime = System.nanoTime();
		duration = (endTime - startTime);
		
		System.out.println("binarySearch index = "+answer +", took "+ duration +" nano seconds");
		
	}
	public static int bruteForce(int[] array,int target)
	{
		for(int i=0; i<array.length;i++)
		{
			if(array[i] == target)
			{
				return i;

			}
		}
		
		return -1;
	}
	public static int binarySearch(int[] array,int target)
	{
		int low=0,high=array.length-1;
		while(low <= high)
		{
			int mid = low +(high -low) / 2;
			if(array[mid] == target)
				return mid;
			
			if(target > array[mid])
				low = mid+1;
				 
			else
				high = mid -1;
		}
		return -1;
	}
}
