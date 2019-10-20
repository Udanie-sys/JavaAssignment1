package com.proj.qafour;

public class Parrot {
	
	//Used composition (has-a relationship) with abstraction to implement this
	
		private SoundI sound;
		
		public void setSound(SoundI sound) {
			this.sound= sound;
		}

		public String performSound(){
			return sound.sound();
		}

}
