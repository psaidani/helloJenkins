package com.Jenkins;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class OperationsTest {
	
	Operations o;
	
	@Before
	public void setUp()
	{
		o = new Operations();
	}
	
	@Test
	public void additionDeuxPositifsTest()
	{
		double r = o.addition(5, 4);
		
		assertTrue(9 == r);
	}
	
	@Test
	public void additionPositifNegatifTest()
	{		
		assertTrue(o.addition(-3, 5) == 2);
	}

}
