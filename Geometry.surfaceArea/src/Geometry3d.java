
public class Geometry3d extends Geometry2d {

	public void calculateArea(float x)
    {
        System.out.println("Area of the cube: "+6*x*x+"");
    }
	
	public void calculateVolume(float x)
	{
		System.out.println("voulme of the cube: "+x*x*x+"");
	}
	
	public void calculateVolume(float x, float y, float z)
	{
		System.out.println("voulme of the cuboid: "+x*y*z+"");
	}
}
