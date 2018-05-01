package src.test;

import src.Main;
import org.junit.*;
import static org.junit.Assert.*;

public class TestMain {
	@Test
	public void test() {
		assertTrue(true);
		assertFalse(false);
	}
	
	@Test
	public void intAdd() {
		Main main = new Main();
		
		assertTrue(main.add(1,1) == 2);
		assertTrue(main.add(1,1.0) == 2);
		assertTrue(main.add(1.0,1) == 2);
	}
}
