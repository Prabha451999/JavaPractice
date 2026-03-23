package org.exercise;

import java.util.Scanner;

public class NumberReverse {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = scan.nextInt();
		int[] num = new int[size];
		for(int i=0; i<size; i++)
		{
			System.out.println("Enter num["+i+"]:");
			num[i]=scan.nextInt();
		}
		int lastindex=size-1;
		int firstindex=0;
		for(int i=0; i<num.length; i++)
		{
			if(num[i]==0)
			{
				num[lastindex]=num[i];	
				lastindex--;
			}
			else
			{
				num[firstindex]=num[i];
				firstindex++;
			}
		}
		for(int i=0; i<num.length; i++)
		{
			System.out.print(" "+num[i]);
		}
		
	}

}
