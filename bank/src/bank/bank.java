package bank;

import java.util.Scanner;

public class bank {

	double with,dep,charg,trans=1,bal=100;
	Scanner in=new Scanner(System.in);
	private static Scanner in2;
	
	
	public void withd()
	{
		System.out.println("Enter the amount to be withdrawn:\n");
		with=in.nextInt();
		
		charg=with*0.005;
		with=with-charg;
		bal=bal-with;
		
		
		if(trans>1)
		{
			charg=with*0.004;
			with=with-charg;
			bal=bal-with;
		}
		
		System.out.println("Charges are:"+charg);
		trans++;
		
		
	}
	
	public void dep()
	{
		System.out.println("Enter the amount to be deposited:\n");
		dep=in.nextInt();
		
		charg=dep*0.0025;
		dep=dep-charg;
		bal=bal+dep;
		
		
		if(trans>1)
		{
			charg=dep*0.002;
			dep=dep-charg;
			bal=bal+dep;
		}
		
		System.out.println("Charges are:"+charg);
		trans++;
		
		}
	
	
	
	
	public void bal()
	{
		System.out.println("The balance of the account is\n"+bal);
	}
	
	public static void main(String args[])
	{
		int ch;
		in2 = new Scanner(System.in);
		
		bank ob=new bank();
		
		
		do {
		
		System.out.println("1.Withdraw\n");
		System.out.println("2.Deposit\n");
		System.out.println("3.Balance\n");
		System.out.println("4.Quit\n");
		
		System.out.println("Enter choice\n");
		ch=in2.nextInt();
		
		switch(ch)
		{
		   
		   case 1: ob.withd();
		      
		      break; 
		   
		   case 2 :
			   ob.dep();
		      break; 
		   
		   case 3 :
			   ob.bal();	
		      break; 
		      
		      default:
		    	  System.out.println("Wrong choice\n");
			}
		}while(ch!='4');
	}
}
