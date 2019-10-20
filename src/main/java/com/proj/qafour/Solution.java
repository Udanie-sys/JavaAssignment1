package com.proj.qafour;

public class Solution {
	
	public static void main(String[] args) {
		Parrot parrot = new Parrot();
		parrot.setSound(new DogSound());
		parrot.performSound();
		parrot.setSound(new DuckSound());
		parrot.performSound();
		parrot.setSound(new CatSound());
		parrot.performSound();
		parrot.setSound(new RoosterSound());
		parrot.performSound();
		parrot.setSound(new PhoneSound());
		parrot.performSound();
	}

}
