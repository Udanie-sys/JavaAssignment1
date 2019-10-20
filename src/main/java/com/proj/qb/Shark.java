package com.proj.qb;

public class Shark extends Fish{
	
private FishI fish;
	
	public void setFish(FishI fish) {
		this.fish = fish;
	}

	@Override
	public String sing() {
		System.out.println("Sharks don’t sing");
		return "Sharks don’t sing";
	}

	@Override
	public String swim() {
		System.out.println("Sharks can swim");
		return "Sharks can swim";
	}

	@Override
	public String walk() {
		System.out.println("Sharks don't walk");
		return "Sharks don't walk";
	}
	
	public String getFishColor(){
		return fish.color();
	}
	
	public String getFish(){
		return fish.behaviour();
	}


}
