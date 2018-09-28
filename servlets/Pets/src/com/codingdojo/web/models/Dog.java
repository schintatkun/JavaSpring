package com.codingdojo.web.models;

public class Dog extends Animal implements Pet{
	
	public Dog(String name, String breed, int weight) {
		super(name, breed, weight);
	}
	
	
	public String showAffection() {
		if (weight<30) {
			return this.name+" hopped into your lap and cuddled you.";
		}
		else {
			return this.name+"curled up next to you";
		}
	}
}
