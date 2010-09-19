package com.schoewe.foundation.datastructure;

public class SingleLinkNode<T>
{
	SingleLinkNode<T> next;
	T value;
	
	public SingleLinkNode(T value, SingleLinkNode<T> next)
	{
		this.value = value;
		this.next = next;
	}
	
	public void setNext(SingleLinkNode<T> n)
	{
		this.next = n;
	}
	
	public SingleLinkNode<T> getNext() { return this.next; }
}
