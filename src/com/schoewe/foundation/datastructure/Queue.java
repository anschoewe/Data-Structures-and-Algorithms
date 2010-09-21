package com.schoewe.foundation.datastructure;

public class Queue<T>
{
	T[] values;
	int head = 0;
	int tail = 0;
	
	@SuppressWarnings("unchecked")
	public Queue(int size)
	{
		values = (T[])(new Object[size]);
	}
	
	public void enqueue(T val)
	{
		values[tail] = val;
		tail = (tail == values.length - 1) ? 0 : tail + 1;
	}
	
	public T dequeue()
	{
		T val = values[head];
		head = (head == values.length - 1) ? 0 : head + 1;
		
		return val;
	}
	
	public boolean isEmpty()
	{
		return head == tail;
	}

	public Object getItemCount()
	{
		if(tail - head >= 0)
			return tail - head;
		return (values.length - head) + tail;
	}
}
