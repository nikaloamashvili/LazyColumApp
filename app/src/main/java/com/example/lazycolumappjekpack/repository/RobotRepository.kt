package com.example.lazycolumappjekpack.repository

import com.example.lazycolumappjekpack.model.Person
import com.example.lazycolumappjekpack.model.Robot

class RobotRepository {
    fun getRobotData(): List<Robot> {
        return listOf(
            Robot(
                id = 0,
                "sherlok 1",
                "11.05.1995"
            ,1.2
            ),            Robot(
                id = 1,
                "sherlok 2",
                "11.05.2000"
                ,1.4
            ),            Robot(
                id = 2,
                "sherlok 4",
                "11.05.0000"
                ,1.3
            ),            Robot(
                id = 3,
                "sherlok from the future",
                "11.05.3000"
                ,1.1
            )
        )
    }
}
