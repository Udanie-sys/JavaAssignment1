package com.proj.qd;

public class Solution {
	
	public static void main(String args[]){

		Caterpillar caterpillar = new Caterpillar();
		caterpillar.walk();
		caterpillar.fly();
		
		caterpillar.setFly(new Butterfly());
		caterpillar.setSound(new Butterfly());
		
		caterpillar.performAction();
	}

}
