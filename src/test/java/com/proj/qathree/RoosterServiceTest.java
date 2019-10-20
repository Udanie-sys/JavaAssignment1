package com.proj.qathree;

import org.junit.Test;

import junit.framework.Assert;

public class RoosterServiceTest {

	
	@Test
	public void testRoosterService(){
		Rooster rooster = new Rooster();
		rooster.setFly(new Flywithwings());
		Assert.assertEquals("I am flying",rooster.performFly());
		
		rooster.setSound(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo",rooster.performSound());
		
		rooster.walk();
	}
}
