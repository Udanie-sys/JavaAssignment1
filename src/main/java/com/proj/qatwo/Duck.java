package com.proj.qatwo;

public class Duck extends Bird{
	
	
	private FlyI fly;
	private SoundI sound;	
	private SwimI swim;
	
	
	public void setSwim(SwimI swim) {
		this.swim = swim;
	}

	public String performSound(){
		return sound.sound();
	}
	
	public String performFly(){
		return fly.fly();
	}
	
	public String performSwim(){
		return swim.swim();
	}
	
	public void setFly(FlyI fly) {
		this.fly = fly;
	}
	public void setSound(SoundI sound) {
		this.sound = sound;
	}
	//common behaviour for all animals 
	public void walk(){
		System.out.println("I am walking");
	}
	
	

}
