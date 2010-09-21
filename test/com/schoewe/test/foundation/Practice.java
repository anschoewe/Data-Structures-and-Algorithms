package com.schoewe.test.foundation;

import com.schoewe.foundation.Util;

public class Practice
{
	public static void mergeSort(Integer[] a, int left, int right)
	{
		if(left < right)
		{
			int middle = (left + right) / 2;
			mergeSort(a, left, middle);
			mergeSort(a, middle + 1, right);
			merge(a, left, middle, right);
		}
	}
	
	private static void merge(Integer[] a, int left, int middle, int right)
	{
		int leftSize = middle - left + 1;
		int rightSize = right - middle;
		Integer[] aLeft = new Integer[leftSize + 1];
		Integer[] aRight = new Integer[rightSize + 1];
		
		int i = 0, j = 0;
		for(;i < leftSize; i++)
			aLeft[i] = a[left + i];
		for(; j < rightSize; j++)
			aRight[j] = a[middle + j + 1];
		
		aLeft[leftSize] = Integer.MAX_VALUE;
		aRight[rightSize] = Integer.MAX_VALUE;
		
		i = 0; j= 0;
		for(int k = left; k <= right; k++)
		{
			if(aLeft[i] <= aRight[j])
				a[k] = aLeft[i++];
			else
				a[k] = aRight[j++];
		}
	}
	
	
	
	
	public static void quickSort(Integer[] a, int left, int right)
	{
		if(left < right)
		{
			int newPivotIndex = partition(a, left, right);
			quickSort(a, left, newPivotIndex - 1);
			quickSort(a, newPivotIndex + 1, right);
		}
	}
	
	private static int partition(Integer[] a, int left, int right)
	{
		int pivotIndex = (left + right) / 2;
		int pivotValue = a[pivotIndex];
		int insertIndex = left;
		Util.swap(a, pivotIndex, right);
		
		for(int i = left; i < right; i++)
		{
			if(a[i] <= pivotValue)
				Util.swap(a, i, insertIndex++);
		}
		Util.swap(a, insertIndex, right);
		
		return insertIndex;
	}
	
	
}
