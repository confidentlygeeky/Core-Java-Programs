import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Geometry2dTest {
	
	Geometry2d geometry2d;

	@Before
	public void setUp() throws Exception {
		
		geometry2d=new Geometry2d();
	}

	@After
	public void tearDown() throws Exception {
		geometry2d=null;
		
	}

	
	@Test
	public void calculateAreaTest() {
		
		assertEquals(4,geometry2d.calculateArea(2));
	}

}
