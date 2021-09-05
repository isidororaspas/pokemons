package com.isidoro.pokemons.model

import com.isidoro.pokemons.model.PokemonType.GRASS
import com.isidoro.pokemons.model.PokemonType.POISON
import com.isidoro.pokemons.model.PokemonType.WATER
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactlyInAnyOrder
import io.kotest.matchers.reflection.shouldBeData
import io.kotest.matchers.reflection.shouldHaveMemberProperty
import io.kotest.matchers.shouldBe

class PokemonTest : StringSpec({

    "Pokemon entity should have properties" {
        Pokemon::class.shouldBeData()
        Pokemon::class.shouldHaveMemberProperty("name")
        Pokemon::class.shouldHaveMemberProperty("types")
        Pokemon::class.shouldHaveMemberProperty("cp")
        Pokemon::class.shouldHaveMemberProperty("hp")
        Pokemon::class.shouldHaveMemberProperty("evolutions")
        Pokemon::class.shouldHaveMemberProperty("weightKg")
        Pokemon::class.shouldHaveMemberProperty("heightCm")
    }

    "A pokemon may have several types" {
        val ivysaur = Pokemon(
            name = PokemonName("Ivysaur"),
            types = listOf(GRASS, POISON)
        )
        ivysaur.types shouldContainExactlyInAnyOrder listOf(GRASS,POISON)
    }

    "Pokemon domain item" {
        val wartortle = Pokemon(name = PokemonName("Wartortle"))
        val blastoise = Pokemon(name = PokemonName("blastoise"))
        val squirtle = Pokemon(
            name = PokemonName("Squirtle"),
            types = listOf(WATER),
            cp = 891,
            hp = 1008,
            weightKg = Pair(7.88, 10.13),
            heightCm = Pair(0.44, 0.56),
            evolutions = setOf(wartortle,blastoise)
        )

        squirtle.name.value shouldBe "Squirtle"

    }

})