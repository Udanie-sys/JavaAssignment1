package com.proj.qaone;

//import org.junit.Before;
import org.junit.Test;

import com.proj.qaone.Bird;

public class AnimalServiceTest {

	private Bird bird;

	//@Before
	public void setUp() throws Exception {
		bird = new Bird();
	}
	
	@Test
	public void testFly()
	{
		bird.fly();
	}

	@Test
	public void tesWalk()
	{
		bird.walk();
	}
	
}
