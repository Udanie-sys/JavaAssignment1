package com.proj.qb;

public class Clownfish extends Fish {
	
	
private FishI fish;
	
	public void setFishBehaviour(FishI fish) {
		this.fish = fish;
	}

	@Override
	public String sing() {
		System.out.println("Clownfish don’t sing");
		return "Clownfish don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Clownfish can swim");
		return "Clownfish can swim";
	}

	@Override
	public String walk() {
		System.out.println("Clownfish don't walk");
		return "Clownfish don't walk";
	}
	
	public String getFishColor(){
		return fish.color();
	}
	
	public String getFishBehaviour(){
		return fish.behaviour();
	}

	

}
