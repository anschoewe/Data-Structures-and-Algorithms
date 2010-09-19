package com.schoewe.test.foundation;

import org.junit.Test;

import com.schoewe.foundation.Util;
import com.schoewe.foundation.datastructure.SingleLinkNode;

import static org.junit.Assert.*;

public class UtilTests
{
	@Test
	public void testReverseArray()
	{
		Integer[] a = new Integer[] {5, 3, 7, 4, 6};
		Util.reverse(a);
		Util.printArray("", a);
		assertArrayEquals(new Integer[] {6, 4, 7, 3, 5}, a);
		
		a = new Integer[] {5, 3, 7, 4, 6, 3};
		Util.reverse(a);
		assertArrayEquals(new Integer[] {3, 6, 4, 7, 3, 5}, a);
	}
	
	@Test
	public void testReverseList()
	{
		SingleLinkNode<Integer> n4 = new SingleLinkNode<Integer>(6, null);
		SingleLinkNode<Integer> n3 = new SingleLinkNode<Integer>(4, n4);
		SingleLinkNode<Integer> n2 = new SingleLinkNode<Integer>(7, n3);
		SingleLinkNode<Integer> n1 = new SingleLinkNode<Integer>(3, n2);
		SingleLinkNode<Integer> n0 = new SingleLinkNode<Integer>(5, n1);
		
		SingleLinkNode<Integer> newHead = Util.reverseList(n0);
		assertEquals(newHead, n4);
		assertEquals(n4.getNext(), n3);
		assertEquals(n3.getNext(), n2);
		assertEquals(n1.getNext(), n0);
		assertEquals(n0.getNext(), null);
	}
	
}
