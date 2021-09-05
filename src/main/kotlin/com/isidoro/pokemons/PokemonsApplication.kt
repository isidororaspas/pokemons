package com.isidoro.pokemons

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokemonsApplication

fun main(args: Array<String>) {
	runApplication<PokemonsApplication>(*args)
}
