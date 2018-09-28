package com.codingdojo.pokemon;

public class pokemonTest {
	public static void main(String[] args) {
		Pokemon monster1 = new Pokemon("Pikachu", 300, "Lighting");
		
		Pokedex dex1 = new Pokedex();

		Pokemon monster2 = dex1.createPokemon("Charamander", 200, "Fire");
		Pokemon monster3 = dex1.createPokemon("Bulbasaur", 250, "Plant");
		Pokemon monster4 = dex1.createPokemon("Arbok", 150, "Snake");
		System.out.println(dex1.pokemonInfo(monster1));
		monster1.attackPokemon(monster2);
		
		System.out.println(dex1.pokemonInfo(monster2));
		System.out.println(dex1.pokemonInfo(monster3));
		System.out.println(dex1.pokemonInfo(monster4));
		
		dex1.listPokemon();
	}
}
