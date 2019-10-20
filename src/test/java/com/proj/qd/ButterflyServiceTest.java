package com.proj.qd;

import org.junit.Test;

public class ButterflyServiceTest {
	
	@Test
	public void testFishService(){
		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();

		caterpillar.setFly(new Butterfly());
		caterpillar.setSound(new Butterfly());

		caterpillar.performAction();
	}

}
