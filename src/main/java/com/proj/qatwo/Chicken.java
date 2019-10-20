package com.proj.qatwo;


public class Chicken extends Bird{

	private FlyI fly;
	private SoundI sound;
	private SwimI swim;
	
	
	public String performSound(){
		return sound.sound();
	}
	public String performFly(){
		return fly.fly();
	}
	
	public String performSwim(){
		return swim.swim();
	}
	
	//setters
	
	public void setFly(FlyI fly) {
		this.fly = fly;
	}
	public void setSound(SoundI sound) {
		this.sound = sound;
	}
	public void setSwim(SwimI swim) {
		this.swim = swim;
	}
	
}
