package org.exercise;

import java.util.Scanner;

public class ReverseString {
	
	private void reverse(String str)
	{
		String[] split = str.split(" ");
		for(int i=split.length-1; i>=0; i--)
		{
			System.out.print(" "+split[i]);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ReverseString s = new ReverseString();
		System.out.println("Enter The Given String: ");
		String str = scan.nextLine();
		System.out.println("Reverse String: ");
		s.reverse(str);
		}
	

}
