package com.fdmgroup;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testLoginController {

	private LoginController lc;
	
	private View mockView = mock(View.class);
	private Validator mockVal = mock(Validator.class);
	
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		lc = new LoginController(mockView, mockVal);
		when(mockView.getUserInput()).thenReturn("ABCDE");
		when(mockVal.validate("ABCDE")).thenReturn(true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHandle() {
		lc.handle();
		verify(mockView).getUserInput();
		verify(mockVal).validate("ABCDE");
	}

}
