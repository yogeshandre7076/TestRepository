package Automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {
	
	@Test
	public void z() {
		Assert.assertTrue(3 > 12);
		System.out.println("z test method");
	}
	
	@Test(dependsOnMethods = "z")
	public void b() {
		System.out.println("b test method");
	}
	

}
