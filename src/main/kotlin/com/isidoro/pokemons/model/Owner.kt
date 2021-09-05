package es.isidoro.pokemon.pokemonserver.domain

import java.util.UUID

data class Owner (
    val _id: UUID = UUID.randomUUID(),
    val name: String = "anonymous",
    val favourites: MutableList<Pokemon> = mutableListOf()
)