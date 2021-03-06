package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void BeforeClass() throws Exception {
		//System.out.println("BeforeClass: Code executed once before first Test Method");
	}

	@AfterClass
	public static void AfterClass() throws Exception {
		//System.out.println("AfterClass: Code executed once after last Test Method");
	}

	@Before
	public void Before() throws Exception {
		//System.out.println("Before: Code executed before each Test Method");
	}

	@After
	public void After() throws Exception {
		//System.out.println("After: Code executed after each Test Method");
	}

	@Test
	public void Test_01_assertEquals_Positive() {
		//System.out.println("Test_01_assertEquals_Positive");
		//assertEquals("Error", "Dilya", "Dilya");
		assertEquals("String not the same", "Testing JUnit 4", App.s);
	}
	
	@Test
	public void Test_02_assertEquals_Negative() {
		//System.out.println("Test_02_assertEquals_Negative");
		//assertEquals("Error", "Dilya", "Dili");
		assertEquals("String not the same.", "Testing TestNG 6", App.s);
	}
	
	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		//System.out.println("Test_03_assertEquals_Ignored");
		assertEquals("String not the same.", "Testing JUnit 3", App.s);
		}
	
	@Test
	public void Test_04_assertSame_Positive() {
		//System.out.println("Test_04_assertEquals_Positive");
		//assertSame("Error", "12", "12");
		assertSame("Integer not the same.", 55, App.i);
	}
	
	@Test
	public void Test_05_assertSame_Negative() {
		//System.out.println("Test_05_assertEquals_Negative");
		//assertSame("Error", "12", "13");
		assertSame("Integer not the same.", 54, App.i);
	}
	@Ignore
	@Test
	public void Test_06_assertSame_Ignored() {
		//System.out.println("Test_06_assertSame_Ignored");
		assertSame("Integer not the same.", 56,App.i);
		}
	
	@Test
	public void Test_07_assertFalse_Positive() {
		//System.out.println("Test_07_assertFalse_Positive");
		//assertFalse("Failure should be false", false);
		assertFalse("Boolean should be false", App.f);
	}
	
	@Test
	public void Test_08_assertFalse_Negative() {
		//System.out.println("Test_08_assertFalse_Negative");
		//assertFalse("Failure should be false", true);
		assertFalse("Boolean should be false", App.t);
	}
	@Test
	public void Test_09_assertTrue_Positive() {
		//System.out.println("Test_09_assertTrue_Positive");
		//assertTrue("Failure should be true", true);
		assertTrue("Boolean should be true", App.t);
	}
	@Test
	public void Test_10_assertTrue_Negative() {
		//System.out.println("Test_10_assertTrue_Negative");
		//assertTrue("Failure should be true", false);
		assertTrue("Boolean should be true", App.f);
	}
}

