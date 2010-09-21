package com.schoewe.foundation.datastructure;

import java.util.Arrays;
import java.util.List;

import com.schoewe.foundation.Util;

public class Heap
{
	List<Integer> array;
	int itemCount;
	
	public Heap(Integer[] a)
	{
		this.array = Arrays.asList(a);
		this.itemCount = a.length;
		
		for(int i = (int)(itemCount / 2) - 1; i >= 0; i--)
			heapify(i);
	}
	
	private void heapify(int root)
	{
		if(root >= itemCount - 1) return;
		
		int leftIndex = (root * 2) + 1;
		int rightIndex = (root * 2) + 2;
		int leftValue = (leftIndex < array.size()) ? array.get(leftIndex) : Integer.MAX_VALUE;
		int rightValue = (rightIndex < array.size()) ? array.get(rightIndex) : Integer.MAX_VALUE;
		int rootValue = array.get(root);

		int smallestValueIndex = root;
		if(rootValue > leftValue && leftValue < rightValue)
		{
			Util.swap(array, root,	leftIndex);
			smallestValueIndex = leftIndex;
		}
		else if(rootValue > rightValue && rightValue < leftValue)
		{
			Util.swap(array, root,	rightIndex);
			smallestValueIndex = rightIndex;
		}
		
		if(smallestValueIndex != root)
			heapify(smallestValueIndex);
	}
	
	public int getRoot()
	{
		int rootValue = array.get(0);
		
		//take the last element, put it at the root position and then heapify
		array.set(0, array.get(itemCount - 1));
		array.set(itemCount - 1, Integer.MAX_VALUE);
		itemCount--;
		
		for(int i = (int)(itemCount / 2) - 1; i >= 0; i--)
			heapify(i);
		
		return rootValue;
	}
	
	public void add(int v)
	{
		//insert the new value at the end of the items of the array
		array.set(itemCount - 1, v);
		itemCount++;
		
		//heapify to bring the new value to the correct position in the binary heap
		for(int i = (int)(itemCount / 2) - 1; i >= 0; i--)
			heapify(i);
	}
}
