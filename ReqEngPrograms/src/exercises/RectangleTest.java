package exercises;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class RectangleTest {
	
	Rectangle r = new Rectangle(20.5, 10.3);
	
	@Test
	public void Test1 () {
		
		assertNotNull(r);
		assertEquals(20.5, r.getLength());
		assertEquals(10.3, r.getWidth());
		
	}
	
	public void Test2() {
		assertEquals(61.6, r.getSize());
	}
	
	public void Test3() {
		assertEquals(211.15, r.getVolume());
	}

}
