package com.codingdojo.objectmaster;

public class subHumanClassTest {
	public static void main(String[] args) {
		Wizard newWizard = new Wizard();
		Ninja newNinja = new Ninja();
		Samurai newSamurai = new Samurai();
		Samurai noviceSamurai = new Samurai();
		noviceSamurai.displayHealth();
		newWizard.displayHealth();
		newWizard.fireBall(newNinja);
		newWizard.fireBall(newSamurai);
		newSamurai.displayHealth();
		
		newWizard.heal(newSamurai);
		newSamurai.displayHealth();
		newSamurai.meditate();
		newSamurai.displayHealth();
		newNinja.displayHealth();
		newNinja.steal(newWizard);		
		newWizard.displayHealth();
		newNinja.runAway();
		newSamurai.deathBlow(newNinja);
		newNinja.displayHealth();
	}
}
