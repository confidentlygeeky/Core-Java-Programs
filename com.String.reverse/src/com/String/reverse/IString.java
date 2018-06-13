package com.String.reverse;

public class IString
{
	StringBuffer string=new StringBuffer();
	
	public IString(String istring)
	{
		this.string.append(string);
		this.string=this.string.reverse();
	}

	@Override
	public boolean equals(Object obj) 
	{
		IString istring2=(IString)obj;
		boolean status=false;
		for(int i=0;i<this.string.length();i++)
		{
			int j=i+1;
			if(j%2!=0)
			{
				if(this.string.charAt(i)==istring2.string.charAt(i))
				{
					status=true;
				}
				else
				{
					status=false;
					break;
				}
			}
		}
		return status;
	}
}