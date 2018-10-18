package com.fdmgroup;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class testCalculator {
	
	Calculator cal = new Calculator();
	
	@Mock
	private Calculator mockCalc;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		//mockCalc = mock(Calculator.class);
		MockitoAnnotations.initMocks(this);
		when(mockCalc.add(15, 20)).thenReturn(1000);
		when(mockCalc.div(anyInt(), eq(0))).thenThrow(ArithmeticException.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertEquals(10, cal.add(5, 5));
	}

	@Test
	public void testSub() {
		assertEquals(5, cal.sub(10, 5));
	}

	@Test
	public void testMult() {
		assertEquals(25, cal.mult(5, 5));
	}

	@Test
	public void testDiv() {
		assertEquals(5, cal.div(10, 2));
	}
	
	@Test
	public void testAddBehavior(){
		int actual = mockCalc.add(15, 20);
		assertEquals(1000, actual);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivBehavior(){
		mockCalc.div(450, 0);
	}
	
}
