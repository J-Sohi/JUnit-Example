package com.fdmgroup;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringOperationTest {
	
	private static StringOperation so;
	
	@BeforeClass
	public static void setUpBeforeClass(){
		so = new StringOperation();
		System.out.println("Inside setUpBeforeClass()....");
	}
	
	@Before
	public void setUp(){
		System.out.println("Inside setUp()....");
	}
	
	@Test
	public void testReverseWithMoreThanTwoCharacters(){
		
	}
	
	@After
	public static void tearDown() {
		System.out.println("Inside tearDown()....");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("Inside tearDownAfterClass()....");
	}
}
