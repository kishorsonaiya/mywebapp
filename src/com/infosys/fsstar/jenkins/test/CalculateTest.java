package com.infosys.fsstar.jenkins.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.infosys.fsstar.jenkins.Calculation;

public class CalculateTest {
	private int value1;
	private int value2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		value1 = 3;
		value2 = 5;
	}

	@After
	public void tearDown() throws Exception {
		value1 = 0;
		value2 = 0;
	}

	@Test
	public void testAdd() {
		int total = 8;
		int sum = Calculation.add(value1, value2);
		assertEquals(sum, total);
	}

	@Test
	public void testFailedAdd() {
		int total = 9;
		int sum = Calculation.add(value1, value2);
		assertNotSame(sum, total);
	}

	@Test
	public void testSub() {
		int total = 0;
		int sub = Calculation.sub(4, 4);
		assertEquals(sub, total);
	}
	
	@Test
	public void testFailedSub() {
		int total = 8;
		int sub = Calculation.sub(value1, value2);
		assertNotSame(sub, total);
	}	

	@Test
	public void testMultiply() {
		int total = 15;
		int sub = Calculation.multiply(value1, value2);
		assertEquals(sub, total);
	}
	
	@Test
	public void testDivied() {
		value1 = 10;
		value2 = 2;
		int total = 5;
		int sub = Calculation.divied(value1, value2);
		assertEquals(sub, total);
	}	
	
	
}
