package com.niit.stringmain;

import com.String.reverse.IString;

public class StringMain {

	public static void main(String[] args) {
		IString first=new IString("Kunaal");
		IString second=new IString("Lubanl");
		
		if(first.equals(second))
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}

	}

}
