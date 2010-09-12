package com.schoewe.foundation;

public class SortUtil
{
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
		swap(a, pivotIndex, right); //place the pivot at the end of our sublist while comparing and swapping
		
		//move all of the elements smllar than the pivot value to the left most position 
		//that we haven't already placed a smaller value
		for(int i = left; i < right; i++)
		{
			if(a[i] <= pivotValue)
			{
				swap(a, i, storeIndex);
				storeIndex++;
			}
		}
		swap(a, storeIndex, right);	
		
		return storeIndex; //represents the final position of the pivot
	}
	
	
	@Deprecated
	public static void quickSort_old(Integer[] a, int left, int right)
	{
		if(a == null || a.length < 2) return;
		
		int finalPivotIndex = partition(a, left, right);
		SortUtil.<Integer>printArray("after partition with finalPivotIndex " + finalPivotIndex, a);
		if(left < finalPivotIndex - 1)
			quickSort(a, left, finalPivotIndex - 1);
		if(right > finalPivotIndex)
			quickSort(a, finalPivotIndex, right);
	}

	@Deprecated
	private static int partition_old(Integer[] a, int left, int right)
	{
		int i = left;
		int j = right;
		int pivotValue = a[(left + right) / 2];
		System.out.println("pivotIndex: " + (int)((left + right) / 2) + " pivotValue: " + pivotValue);
		int tempValue;
		
		while(i <= j)
		{
			while(a[i] < pivotValue)
				i++;
			while(a[j] > pivotValue)
				j--;
			if(i <= j)
			{
				tempValue = a[i];
				a[i] = a[j];
				a[j] = tempValue;
				i++;
				j--;
			}
		}
		return i;
	}
	
	private static void swap(Integer[] a, int indexI, int indexJ)
	{
		int tempValue = a[indexI];
		a[indexI] = a[indexJ];
		a[indexJ] = tempValue;
	}
	
	private static <T> void printArray(String message, T[] a)
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
