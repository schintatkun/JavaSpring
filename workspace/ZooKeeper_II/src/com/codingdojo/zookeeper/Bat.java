package com.codingdojo.zookeeper;

public class Bat extends Mammal{
	
	public Bat() {
		this.energy = 300;
	}
	public void fly() {
		this.energy -=50;
		System.out.println("Bat is taking off");
	}
	public void eatHumans() {
		this.energy +=25;
		System.out.println("Eat Humans");
	}
	public void attackTown() {
		this.energy -=100;
		System.out.println("Attack Town");
	}
}
