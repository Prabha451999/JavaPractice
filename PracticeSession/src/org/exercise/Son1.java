package org.inheritance;

public class Son1 extends Mother {
	
public void son1Details()
{
	System.out.println("son 1 is"+true);
}
public static void main(String[] args) {
	
	
	Son1 s1 = new Son1();
	s1.motherDetails("bbb", 54);
	s1.son1Details();
}
}
