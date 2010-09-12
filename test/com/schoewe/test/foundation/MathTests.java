package com.schoewe.test.foundation;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import com.schoewe.foundation.MathUtil;


public class MathTests
{
	@Test
	public void testIsPrime()
	{
		int n = 2;
		assertTrue(MathUtil.isPrime(n));
		
		n = 3;
		assertTrue(MathUtil.isPrime(n));
		
		n = 19;
		assertTrue(MathUtil.isPrime(n));
		
		n = 20;
		assertFalse(MathUtil.isPrime(n));
	}
	
	@Test
	public void testPrimes()
	{
		int n = 2;
		boolean[] isPrimeArray = MathUtil.getPrimes(n);
		List<Integer> primes = new LinkedList<Integer>();
		for(int i = 0; i < isPrimeArray.length; i++)
			if(isPrimeArray[i]) primes.add(i);
		
		assertArrayEquals(new Integer[] {2}, primes.toArray(new Integer[0]));
		
		n = 20;
		isPrimeArray = MathUtil.getPrimes(n);
		primes = new LinkedList<Integer>();
		for(int i = 0; i < isPrimeArray.length; i++)
			if(isPrimeArray[i]) primes.add(i);		
		
		assertArrayEquals(new Integer[] {2, 3, 5, 7, 11, 13, 17, 19}, primes.toArray(new Integer[0]));
	}
}
