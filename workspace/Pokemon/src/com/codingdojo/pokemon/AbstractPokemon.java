package com.codingdojo.pokemon;

public abstract class AbstractPokemon implements PokemonInterface{
	
	public abstract Pokemon createPokemon(String name, int health, String type);
	public String pokemonInfo(Pokemon pokemon) {
		String result = String.format("Name: %s, Health: %s, Type:  %s", pokemon.getName(), pokemon.getHealth(), pokemon.getType());
		return result;
	}
	
//	public abstract String pokemonInfo(Pokemon pokemon);
}
