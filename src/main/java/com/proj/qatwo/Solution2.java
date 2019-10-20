package com.proj.qatwo;

public class Solution2 {

	public static void main(String args[]){
		//Duck
		Duck duck = new Duck();
		duck.setFly(new Flywithwings());
		duck.performFly();
		
		duck.setSound(new DuckSound());
		duck.performSound();
		
		duck.setSwim(new DuckSwim());
		duck.performSwim();
		duck.walk();
		
		//Chicken
		Chicken chicken = new Chicken();
		chicken.setFly(new Flywithoutwings());
		chicken.performFly();
		
		chicken.setSound(new ChickenSound());
		chicken.performSound();
		
		chicken.setSwim(new ChickenSwim());
		chicken.performSwim();
		chicken.walk();
		
	}
}
