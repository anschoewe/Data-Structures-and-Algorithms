package com.schoewe.foundation.datastructure;

public class Stack<T>
{
	int topIndex = -1;
	T[] values;
	
	@SuppressWarnings("unchecked")
	public Stack(int size)
	{
		values = (T[])(new Object[size]);
	}
	
	public void push(T val)
	{
		values[++topIndex] = val;
	}
	
	public T pop()
	{
		return values[topIndex--];
	}
	
	public boolean isEmpty()
	{
		return topIndex < 0;
	}
	
	public int getItemCount()
	{
		return topIndex + 1;
	}
}
