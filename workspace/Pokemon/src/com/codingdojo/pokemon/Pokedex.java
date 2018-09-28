package com.codingdojo.pokemon;
import java.util.ArrayList;

public class Pokedex extends AbstractPokemon {
	ArrayList<String> myPokemons = new ArrayList<>();
	
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newMonster = new Pokemon(name, health, type);
		myPokemons.add(newMonster.getName());
		return newMonster;
	}
	public void listPokemon() {
		for (String monster: myPokemons) {
//			System.out.println("All monster in my dex");
			System.out.print(monster+",");
		}
	}
}