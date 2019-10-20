package com.proj.qb;

public class Solution {
	
public static void main(String[] args) {
		
		Fish fish = new Shark();
		fish.sing();
		fish.swim();
		fish.walk();
		
				

		Shark s = new Shark();
		s.setFish(new Sharknature());
		s.getFish();
		s.getFishColor();
		Fish clownfish = new Clownfish();
		clownfish.sing();
		clownfish.swim();
		clownfish.walk();
		
		Clownfish c = new Clownfish();
		c.setFishBehaviour(new Colwnfishnature());
		c.getFishBehaviour();
		c.getFishColor();

		SwimI d = new Dolphin();
		d.swim();
	}

}
