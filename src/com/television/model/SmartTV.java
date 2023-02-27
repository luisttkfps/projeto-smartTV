package com.television.model;

public class SmartTV {
	public boolean on = false;
	public int channel = 1;
	public int volume = 25;
	
	public void turnOn(){
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void volumeUp() {
		++volume; 
	}
	
	public void volumeDown() {
		--volume;
	}
	
	public void nextChannel() {
		++channel;
	}
	
	public void previousChannel() {
		--channel;
	}
}
