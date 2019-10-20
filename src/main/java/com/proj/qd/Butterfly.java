package com.proj.qd;

public class Butterfly implements FlyI,SoundI {
	
	
	public String fly() {
		System.out.println("Butterfly can fly");
		return "Butterfly can fly";
	}

	
	public String sound() {
		System.out.println("Butterfly does not make a sound");
		return "Butterfly does not make a sound";
	}

}
