package com.proj.qathree;

public class Solution {
	
	public static void main(String args[]){
		Rooster rooster = new Rooster();
		rooster.setFly(new Flywithwings());
		rooster.performFly();

		rooster.setSound(new RoosterSound());
		rooster.performSound();
		
		rooster.walk();

	}

}
