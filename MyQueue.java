// This is a simple implementation of a queue using ArrayList. The class includes enqueue method for a priority queue.

import java.util.ArrayList;

public class MyQueue<T> {
	ArrayList<T> list;

	public MyQueue() {
		list = new ArrayList<T>();
	}

	public boolean isEmpty() {
		return (list.size() == 0);
	}

	public void enqueue(T value) {
		list.add(value);
	}
	
	public void enqueuePriority(T value)
	{
		
			list.add(value);
		
			for(int i=list.size()-1;i>=0;i--)
			{
				if((Integer) value > (Integer) list.get(i))
				{
					list.set(i+1, list.get(i));
					list.set(i, value);
				}
			}
	}

	public T dequeue() {
		if (!isEmpty())
		{
			return list.remove(0);
		}
		else
		{
			System.out.println("null");
			return null;

		}
	}

	public int size() {
		return list.size();
	}

}
