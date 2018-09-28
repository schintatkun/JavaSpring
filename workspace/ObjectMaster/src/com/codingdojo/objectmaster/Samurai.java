package com.codingdojo.objectmaster;

public class Samurai extends Human {
	private static int sumSamurai;
	public Samurai() {
		this.health =200;
		sumSamurai ++;
	}
	public Samurai deathBlow(Human target) {
		this.health = this.health/2;
		target.health = 0;
		return this;
	}
	public Samurai meditate() {
		this.health += this.health/2;
		return this;
	}
	public int howMany() {
		return sumSamurai;
	}
}
