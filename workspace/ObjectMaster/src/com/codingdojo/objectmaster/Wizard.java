package com.codingdojo.objectmaster;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	}
	public Human heal(Human healed) {
		healed.health += this.intelligence;
		return this;
	}
	public Human fireBall(Human target) {
		target.health -= this.intelligence*3;
		return this;
	}
}
