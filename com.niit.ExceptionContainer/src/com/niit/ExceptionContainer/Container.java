package com.niit.ExceptionContainer;

public class Container {

	double l;
	double b;
	double h;
	
	double vol;
	
	public Container(double l, double b,double h ) {
		this.l=l;
		this.b=b;
		this.h=h;	
	}
	
	public double calcVol()
	{
		vol=l*b*h;
		return vol;
	}
	
	public void Difference(Container c) throws ContainerException
	{
		double diff=this.calcVol()-c.calcVol();
		
		if(this.l<=c.l && this.b<=c.b && this.h<=c.h)
		{
			throw new ContainerException("Not same");
		}
		
		else
		{
			System.out.println("Difference:"+diff);
		}
	}
}
