// This is an implementation of two of the most famous sorting algorithms, Bubble Sort and Selection Sort
// both with Time Complexity O(n^2)

import java.util.ArrayList;

public class Sorting {

	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(5);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(6);
		//list = bubbleSort(list);
		list = selectionSort(list);
		System.out.println( list.toString());
		
	}
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> list)
	{
		for(int i=list.size()-1; i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				if(list.get(j+1) < list.get(j) )
				{
					//swap
					int temp = list.get(j);
					list.set(j, list.get(j+1));
					list.set(j+1, temp);
				}
			}
						
		}
		return list;
	}
	
	public static ArrayList<Integer> selectionSort(ArrayList<Integer> list)
	{
		
		for(int i=0;i<list.size();i++)
		{
			int indexOfMin = i;
			for(int j=i;j<list.size();j++)
			{
				if(list.get(indexOfMin)>list.get(j))
				{
					indexOfMin = j;
				}
			}
			// swap 
			int temp = list.get(i);
			list.set(i, list.get(indexOfMin));
			list.set(indexOfMin, temp);
		}
		
		return list;
	}
}
