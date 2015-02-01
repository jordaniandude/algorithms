// This is a simple implementation of a stack using an ArrayList

import java.util.ArrayList;

public class MyStack<T> {
	ArrayList<T> list;

	public MyStack() {
		list = new ArrayList<T>();
	}

	public boolean isEmpty() {
		return (list.size() == 0);
	}

	public void push(T value) {
		list.add(value);
	}

	public T pop() {
		if (!isEmpty())
		{
			return list.remove(list.size() - 1);
		}
		else
		{
			return null;
		}
	}

	public int size() {
		return list.size();
	}

}
