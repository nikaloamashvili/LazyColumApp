package com.example.lazycolumappjekpack.repository

import com.example.lazycolumappjekpack.model.Animal
import com.example.lazycolumappjekpack.model.Person

class AnimalRepository {
    fun getAnimalData(): List<Animal> {
        return listOf(
            Animal(
                id = 0,
                 "invader",
                age = 20
            ,"Chicken"
            ),
            Animal(
                id = 1,
                "Scooby-Doo",
                age = 25
                ,"Dog"
            ) ,
            Animal(
                id = 2,
                "meu",
                age = 2
                ,"Cat"
            ),
            Animal(
                id = 3,
                "kuku",
                age = 60
                ,"Horse"
            )
        )
    }
}
