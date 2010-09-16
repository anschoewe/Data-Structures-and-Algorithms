package com.schoewe.test.foundation;

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
	
	private static void merge(Integer[] a, int x, int y, int z)
	{
		int aLeftCount = y - x + 1;
		int aRightCount = z - y;
		Integer[] aLeft = new Integer[aLeftCount + 1];
		Integer[] aRight = new Integer[aRightCount + 1];
		
		int i = 0;
		int j = 0;
		for(; i < aLeftCount; i++)
			aLeft[i] = a[x + i];
		for(; j < aRightCount; j++)
			aRight[j] = a[y + j + 1];
		aLeft[aLeft.length - 1] = Integer.MAX_VALUE;
		aRight[aRight.length - 1] = Integer.MAX_VALUE;
		
		i = 0; j = 0; //indices of our temp arrays 
		for(int aInsertIndex = x; aInsertIndex <= z; aInsertIndex++)
		{
			if(aLeft[i] <= aRight[j])
				a[aInsertIndex] = aLeft[i++];
			else
				a[aInsertIndex] = aRight[j++];
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
		swap(a, pivotIndex, right);
		
		for(int i = left; i < right; i++)
		{
			if(a[i] <= pivotValue)
				swap(a, i, insertIndex++);
		}
		swap(a, insertIndex, right);
		
		return insertIndex;
	}


	@SuppressWarnings("unused")
	private static void swap(Integer[] a, int indexI, int indexJ)
	{
		int temp = a[indexI];
		a[indexI] = a[indexJ];
		a[indexJ] = temp;
	}
	
}
