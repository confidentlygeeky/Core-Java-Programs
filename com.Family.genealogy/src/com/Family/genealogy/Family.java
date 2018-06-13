package com.Family.genealogy;

import java.util.Scanner;

public class Family {
	
	Scanner in=new Scanner(System.in);
	
	String irisColour;
	String gender;
	
	String firstName;
	String lastName;
	String address;
	
	public Family(String irisColour, String lastName, String address)
	{
		this.irisColour="Black";
		this.lastName="x";
		this.address="Versova";
	}
	
	public Family(String irisColour)
	{
		this.irisColour="Blue";
	}
	
	
	public Family() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public void irisColor()
	{
		Family father=new Family("Black", "x", "Versova");
		Family mother=new Family("Blue");
		Family child=new Family();
		if(father.irisColour.equals(mother.irisColour))
		{
			if(gender.equals("male"))
			{
				irisColour="blue";
				System.out.println("The color of the iris of the male child is:"+irisColour);
			}
			
			else
			{
				System.out.print("The colour of the iris is some other color");
			}
		}
			
		else
		{
			child.irisColour=mother.irisColour;
			System.out.println("The color of the iris of the male child is:\n"+child.irisColour);
			
			
			child.irisColour=father.irisColour;
			System.out.println("The color of the iris of the female child is:\n"+child.irisColour);
			
		}
				
	}
	
	public void getDetails()
	{
		System.out.println("Enter first name of male parent:");
		firstName=in.nextLine();
		
		System.out.println("Enter gender of the child:");
		gender=in.next();
		
	}
	
	public void printDetails()
	{
		
		System.out.println("First name of male parent is:\n"+firstName);
		System.out.println("Last name of child is:\n"+lastName);
		System.out.println("Address of child is\n"+address);
	}
}