package com.niit.ExceptionContainer;

public class TestException {
	
	static void check(double vol) throws ContainerException
	{
		
	}

	public static void main(String[] args) {

		Container testException=new Container (1.1,2.2,3.3);
		
		Container testException2=new Container(2.2, 3.3, 4.4);
		
		testException.calcVol();
		
		try
		{
			testException.Difference(testException2);
			
		}
		
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);  
		}

	}

}
