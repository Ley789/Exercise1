package test.java;
import static org.junit.Assert.assertTrue;
import main.java.Main;

import org.junit.Test;
import org.junit.Test;
public class Testing{
	
	@Test
	public void asserterMath(){
		assertTrue( 4 == Main.powerOf(2,2));
	}
}