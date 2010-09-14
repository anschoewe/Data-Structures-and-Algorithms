package com.schoewe.test.foundation;

public class Practice
{

	private static void swap(Integer[] a, int indexI, int indexJ)
	{
		int temp = a[indexI];
		a[indexI] = a[indexJ];
		a[indexJ] = temp;
	}
	
}
