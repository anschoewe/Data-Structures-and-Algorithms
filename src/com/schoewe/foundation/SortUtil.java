package com.schoewe.foundation;

public class SortUtil
{
	
	public static void bubbleSort(Integer[] a)
	{
		for(int i = a.length - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(a[j] > a[j+1]) Util.swap(a, j, j+1);
			}
		}
	}
	
	public static void mergeSort(Integer[] a, int left, int right)
	{
		if(left < right)
		{
			int divideIndex = (left + right) / 2;
			mergeSort(a, left, divideIndex);
			mergeSort(a, divideIndex + 1, right);
			merge(a, left, divideIndex, right);
		}
	}
	
	private static void merge(Integer[] a, int left, int divideIndex, int right)
	{
		int leftCount = divideIndex - left + 1;
		int rightCount = right - divideIndex;
		Integer[] aLeft = new Integer[leftCount + 1];
		Integer[] aRight = new Integer[rightCount + 1];
		
		//temporarily copy sub array into memory
		int i = 0;
		int j = 0;
		for(; i < leftCount; i++)
			aLeft[i] = a[left + i];
		for(; j < rightCount; j++)
			aRight[j] = a[divideIndex + j + 1];
		
		//add a last number that avoid edge case checking when comparing array values
		aLeft[aLeft.length - 1] = Integer.MAX_VALUE;
		aRight[aRight.length - 1] = Integer.MAX_VALUE;
		
		//go through the temp arrays and always put the next largest value into the original array
		i = 0;
		j = 0;
		//k represents the index where the next largest value will be placed in our original array (must include the right-most index of our subarray)
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
			int newPartitionIndex = partition(a, left, right);
			quickSort(a, left, newPartitionIndex - 1);
			quickSort(a, newPartitionIndex +  1, right);
		}
	}
	
	/**
	 * Does the real work in the quick sort algorithm.  This method guarantees the loop-invariant.
	 * When this method is finished, all elements to the left of the pivot in the sublist will be less
	 * than the pivot value.  Similarly, all elements to the right of the pivot will be greater than
	 * the pivot value.
	 * @param a The array to partition, in place
	 * @param left The left-most index of the sub-list we're partitioning
	 * @param right The right-most index of the sub-list we're partitioning
	 * @return The final index location of the pivot we've partioned around.
	 */
	private static int partition(Integer[] a, int left, int right)
	{
		int pivotIndex = (left + right) / 2;
		int pivotValue = a[pivotIndex];
		//The location where we'll store the next smallest value that is less than our pivot
		//Ultimately, the pivot value will reside in this location
		int storeIndex = left; 
		Util.swap(a, pivotIndex, right); //place the pivot at the end of our sublist while comparing and swapping
		
		//move all of the elements smllar than the pivot value to the left most position 
		//that we haven't already placed a smaller value
		for(int i = left; i < right; i++)
		{
			if(a[i] <= pivotValue)
			{
				Util.swap(a, i, storeIndex);
				storeIndex++;
			}
		}
		Util.swap(a, storeIndex, right);	
		
		return storeIndex; //represents the final position of the pivot
	}

}
