import static org.junit.Assert.*;

import org.junit.Test;

public class MainPanelTest {

	//Test that the convert to int returns same value as input
	@Test
	public void testConvertToInt() {
		
		MainPanel x = new MainPanel(10);
		
		int m = x.convertToInt(20);
		assertEquals(20, m);
		
	}
	
	@Test
	public void testConvertToInt1() {
		
		MainPanel x = new MainPanel(20);
		
		int m = x.convertToInt(5);
		assertEquals(5, m);
		
	}
	
	@Test
	public void testConvertToInt2() {
		
		MainPanel x = new MainPanel(30);
		
		int m = x.convertToInt(15);
		assertEquals(15, m);
		
	}
	
}
