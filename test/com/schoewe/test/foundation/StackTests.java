package com.schoewe.test.foundation;

import org.junit.Test;

import com.schoewe.foundation.datastructure.Stack;

import static org.junit.Assert.*;

public class StackTests
{
	@Test
	public void test()
	{
		Stack<Integer> s = new Stack<Integer>(10);
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		assertEquals(6, s.getItemCount());
		
		
		assertEquals(new Integer(6), s.pop());
		assertEquals(new Integer(5), s.pop());
		assertEquals(new Integer(4), s.pop());
		assertEquals(new Integer(3), s.pop());
		assertEquals(new Integer(2), s.pop());
		assertEquals(new Integer(1), s.pop());
		
		assertTrue(s.isEmpty());
	}
}
