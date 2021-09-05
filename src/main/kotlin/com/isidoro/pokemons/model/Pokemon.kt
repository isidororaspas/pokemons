package com.isidoro.pokemons.model

import com.isidoro.pokemons.model.PokemonType.ANY_POWER
import java.util.UUID

/**
 * Here we take Ubiquitous Language serious and use
 * only words for our world avoiding primitives.
 */
@JvmInline
value class PokemonName(val value: String)

enum class PokemonType{ANY_POWER,WATER,GRASS,FIRE,GROUND,ELECTRIC,POISON,ROCK,STEEL,FLYING}

typealias WeightLimits = Pair<Double,Double>
typealias HeightLimits = Pair<Double,Double>

/**
 * Domain entity representing a Pokemon
 *
 */
data class Pokemon(
    val _id: UUID = UUID.randomUUID(),
    val name: PokemonName,
    val types: List<PokemonType> = listOf(ANY_POWER),
    val cp: Int = 0,
    val hp: Int = 0,
    val evolutions: Set<Pokemon> = emptySet(),
    val weightKg: WeightLimits = Pair(0.0, 0.0),
    val heightCm: HeightLimits = Pair(0.0, 0.0)
)
