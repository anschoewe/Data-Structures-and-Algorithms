package com.schoewe.test.foundation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.schoewe.foundation.datastructure.Queue;

public class QueueTests
{
	@Test
	public void test()
	{
		Queue<Integer> s = new Queue<Integer>(10);
		s.enqueue(1);
		s.enqueue(2);
		s.enqueue(3);
		s.enqueue(4);
		s.enqueue(5);
		s.enqueue(6);
		
		assertEquals(6, s.getItemCount());
		
		
		assertEquals(new Integer(1), s.dequeue());
		assertEquals(new Integer(2), s.dequeue());
		assertEquals(new Integer(3), s.dequeue());
		assertEquals(new Integer(4), s.dequeue());
		assertEquals(new Integer(5), s.dequeue());
		assertEquals(new Integer(6), s.dequeue());
		
		assertTrue(s.isEmpty());
	}
}
