package com.proj.qd;

public class Caterpillar extends Animal implements FlyI {
	
	private FlyI fly;
	private SoundI sound;

	public void setFly(FlyI fly) {
		this.fly = fly;
	}

	public void setSound(SoundI sound) {
		this.sound = sound;
	}

	public void performAction(){
	  fly.fly();
	  sound.sound();
	}

	
	public String fly() {
		System.out.println("Caterpillar can not fly");
		return "Caterpillar can not fly";
	}
	

}
