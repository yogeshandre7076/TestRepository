package Automation;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	//@Test
	public void a() {
		System.out.println("a test method");
	}
	// Industry Mostly use - recommended
	// test case not handle to run the test using @Test(enabled = false)
	@Test(enabled = false)
	public void b() {
		System.out.println("b test method");
	}
	// test case handle to run the test using @Test(enabled = true)
	@Test(enabled = true)
	public void c() {
		System.out.println("c test method");
	}
	// Test Case execution 2 times
	@Test(invocationCount = 2)
	public void d() {
		System.out.println("d test method");
	}
	// Test Case execution 0 times, means test case will skip 
	@Test(invocationCount = 0)
	public void e() {
		System.out.println("e test method");
	}
	
	//Correct way but not recommended
	@Test
	public void f() {
		System.out.println("e test method");
		throw new SkipException("Skipping f test method");
		//System.out.println("Unreachable code");
	}
	

}
