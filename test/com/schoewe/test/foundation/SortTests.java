package com.schoewe.test.foundation;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.schoewe.foundation.SortUtil;
import com.schoewe.foundation.Util;
import com.schoewe.foundation.datastructure.Heap;

public class SortTests
{
	
	@Test
	public void testHeapCreation()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		Heap h = new Heap(a);
		Util.printArray("", a);
		
		int root = h.getRoot();
		assertEquals(3, root);
		root = h.getRoot();
		Util.printArray("", a);
		assertEquals(4, root);
		root = h.getRoot();
		Util.printArray("", a);
		assertEquals(5, root);
		root = h.getRoot();
		Util.printArray("", a);
		assertEquals(6, root);
		root = h.getRoot();
		Util.printArray("", a);
		assertEquals(7, root);
	}
	
	@Test
	public void testBubbleSort()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		SortUtil.bubbleSort(a);	
		assertArrayEquals(new Integer[] {3, 4, 5, 6, 7}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		SortUtil.bubbleSort(a);	
		assertArrayEquals(new Integer[] {3, 3, 4, 5, 6, 7}, a);
	}
	
	
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

}
