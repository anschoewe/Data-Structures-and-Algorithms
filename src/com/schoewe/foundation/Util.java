package com.schoewe.foundation;

import java.util.List;

import com.schoewe.foundation.datastructure.SingleLinkNode;

public class Util
{
	public static <T> SingleLinkNode<T> reverseList(SingleLinkNode<T> head)
	{
		SingleLinkNode<T> i = head;
		SingleLinkNode<T> j = i.getNext();
		SingleLinkNode<T> k = null;
		while(j != null)
		{
			k = j.getNext();
			j.setNext(i);
			i = j;
			j = k;
		}
		
		head.setNext(null);
		return i;
	}
	
	public static void reverse(Integer[] a)
	{
		int j = a.length - 1;
		for(int i = 0; i < j; i++)
		{
			swap(a, i, j--);
		}
	}

	public static <T> void swap(List<T> a, int indexI, int indexJ)
	{
		T tempValue = a.get(indexI);
		a.set(indexI, a.get(indexJ));
		a.set(indexJ, tempValue);
	}
	
	protected List test()
	{
		return null;
	}
	
	public static void swap(Integer[] a, int indexI, int indexJ)
	{
		int tempValue = a[indexI];
		a[indexI] = a[indexJ];
		a[indexJ] = tempValue;
	}
	
	public static <T> void printArray(String message, T[] a)
	{
		StringBuffer sb = new StringBuffer();
		sb.append(message); sb.append("... ");
		
		sb.append("[");
		for(int i = 0; i < a.length; i++)
		{
			sb.append(a[i]);
			if(i < (a.length - 1))
				sb.append(", ");
		}
		sb.append("]");
		
		System.out.println(sb);
	}
}
