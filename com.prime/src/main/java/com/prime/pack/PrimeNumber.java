package com.prime.pack;

import java.util.Scanner;

 class PrimeThread1 extends Thread{
	public synchronized void run() {
		int limit;
		System.out.println("Enter the limit ");
		Scanner sn=new Scanner(System.in);
		limit=sn.nextInt();
		PrimeCalculation(limit);
		
	}
	static String PrimeCalculation(int limitVal)
	{
		String primeNumbers=" ";
		for(int i=0;i<=limitVal;i++) 
		{
			int counter=0;
			for(int num=i;num>=1;num--)
			{
				if(i%num==0) 
				{
					counter=counter+1;
				
				}
			}
		
			if(counter==2) {
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println("Prime Numbers for " + Thread.currentThread().getName()+"  "+primeNumbers);
		System.out.println();
		return primeNumbers;
	
	}

}
public class PrimeNumber {
	public static void main(String args[]) {
		PrimeThread1 pt1=new PrimeThread1();
		Thread m1=new Thread(pt1);
		Thread m2=new Thread(pt1);
		Scanner sn=new Scanner(System.in);
		m1.start();
		m2.start();
		try {
			m1.join();
			m2.join();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}