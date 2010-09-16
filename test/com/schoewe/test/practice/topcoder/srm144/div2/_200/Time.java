package com.schoewe.test.practice.topcoder.srm144.div2._200;

import org.junit.Test;
import static org.junit.Assert.*;

public class Time
{
	public static String whatTime(int seconds)
	{
		int hours = seconds / (3600);
		int minutes = (seconds - (hours * 3600)) / 60;
		int secs = seconds - ((hours * 3600) + (minutes * 60));
		
		return hours + ":" + minutes + ":" + secs;
	}

	@Test
	public void testExample0()
	{
		String timeString = Time.whatTime(0);
		assertEquals("0:0:0", timeString);
	}
	
	@Test
	public void testExample1()
	{
		String timeString = Time.whatTime(3661);
		assertEquals("1:1:1", timeString);
	}
	
	@Test
	public void testExample2()
	{
		String timeString = Time.whatTime(5436);
		assertEquals("1:30:36", timeString);
	}
	
	@Test
	public void testExample3()
	{
		String timeString = Time.whatTime(86399);
		assertEquals("23:59:59", timeString);
	}

}
