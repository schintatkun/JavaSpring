package com.codingdojo.pokemon;

public interface PokemonInterface {	
	Pokemon createPokemon(String name,int help, String type);
	String pokemonInfo(Pokemon pokemon);
	void listPokemon();
	
}
