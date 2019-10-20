package com.proj.qafour;

import org.junit.Test;

import junit.framework.Assert;

public class ParrotServiceTest {
	
	@Test
	public void testRoosterSound(){
		Parrot parrot = new Parrot();
		parrot.setSound(new DogSound());
		Assert.assertEquals("Woof, woof", parrot.performSound());
		parrot.setSound(new DuckSound());
		Assert.assertEquals("Quack, quack", parrot.performSound());
		parrot.setSound(new CatSound());
		Assert.assertEquals("Meow", parrot.performSound());
		parrot.setSound(new RoosterSound());
		Assert.assertEquals("Cock-a-doodle-doo", parrot.performSound());
		parrot.setSound(new PhoneSound());
		//Assert.assertEquals("", parrot.performSound());
	}

}
