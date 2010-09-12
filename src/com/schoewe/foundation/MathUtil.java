package com.schoewe.foundation;

import java.util.Arrays;

public class MathUtil 
{
	public static boolean isPrime(int n)
	{
		if(n < 2) return false;
		if(n == 2) return true;
		if(n % 2 == 0) return false;
		
		int m = (int)Math.sqrt(n);
		for(int i = 3; i <= m; i+=2)
			if(n % i == 0) return false;
		
		
		return true;
	}

	/**
	 * Users Sieve of Eratosthenes method to find all primes between 0 and n, inclusive.
	 * @param n
	 * @return
	 */
	public static boolean[] getPrimes(int n)
	{
		//initially, assume all values between 0 and n are primes.  
		//We'll go through this list and decide which ones are really prime
		boolean[] isPrimes = new boolean[n+1];
		Arrays.fill(isPrimes, true);
		isPrimes[0] = false;
		isPrimes[1] = false;
		
		int m = (int)Math.sqrt(n);

		//find the next prime number and mark all of it's multiples as not-prime
		for(int i = 0; i <= m; i++)
			if(isPrimes[i])
			{
				//remove every multiple of i since we know they won't be prime numbers 
				for(int j = i + i; j <= n; j += i) 
						isPrimes[j] = false;
			}
		
		
		return isPrimes;
	}
}
