// This is a simple implementation of a HashMap using ArrayList

import java.util.ArrayList;

public class MyHashMap<K,V> {
	ArrayList<HashEntry> hashMap = new ArrayList<HashEntry>(); 
	
	public void add(K key, V value)
	{
		HashEntry entry = new HashEntry(key,value);
		hashMap.add(entry);
	}
	public V get(K key)
	{
		for(int i=0;i<hashMap.size();i++)
		{
			if(key == hashMap.get(i).key)
			{
				return hashMap.get(i).value;
			}
		}
		return null;
	}
	public boolean remove(K key)
	{
		for(int i=0;i<hashMap.size();i++)
		{
			if(key == hashMap.get(i).key)
			{
				hashMap.remove(i);
				return true;
			}
		}
		return false;
	}
	public void display()
	{
		for(int i=0;i<hashMap.size();i++)
		{
			System.out.println("Key: "+hashMap.get(i).key+" | Value: "+hashMap.get(i).value);
		}
	}
	
	class HashEntry{
		K key;
		V value;
		
		public HashEntry(K key,V value)
		{
			this.key = key;
			this.value = value;
		}
		
	}
}
