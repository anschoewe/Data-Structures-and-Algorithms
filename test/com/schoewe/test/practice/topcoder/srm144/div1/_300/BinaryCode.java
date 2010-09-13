package com.schoewe.test.practice.topcoder.srm144.div1._300;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author anschoewe
 *
 */

public class BinaryCode
{
	public static String[] decode(String message)
	{
		String[] decodedStrings = new String[2];
				
		decodedStrings[0] = decode(0, message);
		decodedStrings[1] = decode(1, message);
		
		return decodedStrings;
	}
	
	private static String decode(int initialDecodedValue, String message)
	{
		int[] p = new int[message.length()];
		p[0] = initialDecodedValue;
		String decodedString = String.valueOf(initialDecodedValue);
		
		for(int i = 0; i < message.length(); i++)
		{
			int encodedValue = Integer.valueOf(message.substring(i, i+1));
			int x = (i == 0) ? 0 : p[i-1];
			int y = p[i];
			int z = encodedValue - x - y;
				
			if(isValid(z))
			{
				//make sure to check the final calculated value is valid, but don't try to set the i+1 value
				if(i < message.length() - 1) 
				{
					p[i + 1] = z;
					decodedString += p[i + 1];
				}
			}
			else
			{
				decodedString = "NONE";
				break;
			}
		}
		
		return decodedString;
	}
	
	private static boolean isValid(int v)
	{
		return v == 0 || v== 1;
	}
	
	@Test
	public void testExample0()
	{
		String message = "123210122";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("011100011", decodedMessages[0]);
		assertEquals("NONE", decodedMessages[1]);
	}
	
	@Test
	public void testExample1()
	{
		String message = "11";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("01", decodedMessages[0]);
		assertEquals("10", decodedMessages[1]);
	}
	
	@Test
	public void testExample2()
	{
		String message = "22111";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("NONE", decodedMessages[0]);
		assertEquals("11001", decodedMessages[1]);
	}
	
	@Test
	public void testExample3()
	{
		String message = "123210120";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("NONE", decodedMessages[0]);
		assertEquals("NONE", decodedMessages[1]);
	}
	
	@Test
	public void testExample4()
	{
		String message = "3";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("NONE", decodedMessages[0]);
		assertEquals("NONE", decodedMessages[1]);
	}
	
	@Test
	public void testExample5()
	{
		String message = "12221112222221112221111111112221111";
		String[] decodedMessages = BinaryCode.decode(message);
		assertEquals("01101001101101001101001001001101001", decodedMessages[0]);
		assertEquals("10110010110110010110010010010110010", decodedMessages[1]);
	}
}
