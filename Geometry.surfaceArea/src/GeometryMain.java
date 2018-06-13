
public class GeometryMain {

	public static void main(String args[]){
    	Geometry2d geometry2d = new Geometry2d();
       
    	geometry2d.calculateArea(5);
	   
    	geometry2d.calculateArea(10,20);
	   
    	Geometry3d geometry3d = new Geometry3d();
        
    	geometry3d.calculateArea(2.1f);
	   
    	geometry3d.calculateVolume(4.3f);
    	
    	geometry3d.calculateVolume(4,3,7);
    }
}
