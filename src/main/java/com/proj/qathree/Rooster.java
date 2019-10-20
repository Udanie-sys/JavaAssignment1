package com.proj.qathree;

public class Rooster extends Bird {
	
	
	private SoundI sound;
	private FlyI fly;

	public void setSound(SoundI sound) {
		this.sound = sound;
	}

	public void setFly(FlyI fly) {
		this.fly = fly;
	}

	
	public String performSound(){
		return sound.sound();
	}
	
	public String performFly(){
		return fly.fly();
	}

}
