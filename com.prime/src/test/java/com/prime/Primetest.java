package com.prime;

import static org.junit.Assert.*;

import org.junit.Test;

import com.prime.pack.PrimeNumber;


public class Primetest {

	@Test
	public void primeNumberTestWithMultithreading() throws Exception {
		
		String Val1 = " 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 ";
		String Val2 = " 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 ";
		assertEquals(Val1, PrimeThread1.PrimeCalculation(100)); 
		assertEquals(Val2, PrimeThread1.PrimeCalculation(60));
		
		
		  
		 
	}

}