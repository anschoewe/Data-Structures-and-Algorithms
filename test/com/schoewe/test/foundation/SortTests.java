package com.schoewe.test.foundation;

import org.junit.Test;

import com.schoewe.foundation.SortUtil;

import static org.junit.Assert.*;

public class SortTests
{

	@Test
	public void testQuickSort()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		SortUtil.quickSort(a, 0, a.length - 1);	
		assertArrayEquals(new Integer[] {3, 4, 5, 6, 7}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		SortUtil.quickSort(a, 0, a.length - 1);
		assertArrayEquals(new Integer[] {3, 3, 4, 5, 6, 7}, a);
	}
	
	@Test
	public void testMergeSort()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		SortUtil.mergeSort(a, 0, a.length - 1);	
		assertArrayEquals(new Integer[] {3, 4, 5, 6, 7}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		SortUtil.mergeSort(a, 0, a.length - 1);
		assertArrayEquals(new Integer[] {3, 3, 4, 5, 6, 7}, a);
	}
	
	/*
	@Test
	public void testQuickSortPractice()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		Practice.quickSort(a, 0, a.length - 1);	
		assertArrayEquals(new Integer[] {3, 4, 5, 6, 7}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		Practice.quickSort(a, 0, a.length - 1);
		assertArrayEquals(new Integer[] {3, 3, 4, 5, 6, 7}, a);
	}
	
	@Test
	public void testMergeSortPractice()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		Practice.mergeSort(a, 0, a.length - 1);	
		assertArrayEquals(new Integer[] {3, 4, 5, 6, 7}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		Practice.mergeSort(a, 0, a.length - 1);
		assertArrayEquals(new Integer[] {3, 3, 4, 5, 6, 7}, a);
	}
	*/

}
