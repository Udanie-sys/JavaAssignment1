package com.proj.qatwo;

import org.junit.Test;

import junit.framework.Assert;

public class DuckServiceTest {
	
	@Test
	public void test(){
		Duck duck = new Duck();
		duck.setFly(new Flywithwings());
		Assert.assertEquals("I am flying",duck.performFly());

		duck.setSound(new DuckSound());
		Assert.assertEquals("Quack, quack",duck.performSound());

		duck.setSwim(new DuckSwim());
		Assert.assertEquals("Duck can Swim",duck.performSwim());

		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFly(new Flywithoutwings());
		Assert.assertEquals("I am not flying",chicken.performFly());

		chicken.setSound(new ChickenSound());
		Assert.assertEquals("Cluck, cluck",chicken.performSound());

		chicken.setSwim(new ChickenSwim());
		Assert.assertEquals("Chicken can't swim",chicken.performSwim());
	}

}
