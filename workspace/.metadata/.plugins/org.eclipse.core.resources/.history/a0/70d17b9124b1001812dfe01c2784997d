package com.codingdojo.objectmaster;

public class Ninja extends Human{
	public Ninja() {
		this.stealth = 10;
	}
	public Ninja runAway() {
		this.health -=10;
		return this;
	}
	public Ninja steal(Human target) {
		target.health -=this.stealth;
		this.health +=this.stealth;
		return this;
	}
}
