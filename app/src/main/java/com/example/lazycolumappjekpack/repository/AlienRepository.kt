package com.example.lazycolumappjekpack.repository

import com.example.lazycolumappjekpack.model.Alien
import com.example.lazycolumappjekpack.model.Person

class AlienRepository {
    fun getAlienData(): List<Alien> {
        return listOf(
            Alien(
                 0,
             "nika",
         "partush",
         15,
         "originPlanet"
            ),
            Alien(
                0,
                "nika",
                "partush",
                15,
                "neptun"
            ),            Alien(
                1,
                "yosi",
                "partush",
                78,
                "moon"
            ),            Alien(
                2,
                "daniel",
                "partush",
                26,
                "moon"
            ),            Alien(
                3,
                "popo",
                "lomashvili",
                15,
                "earth 2"
            ),           Alien(
                4,
                "lopo",
                "partush",
                15,
                "mars"
            ),

        )
    }
}
