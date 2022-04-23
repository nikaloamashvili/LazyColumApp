package com.example.lazycolumappjekpack.repository

import com.example.lazycolumappjekpack.model.Person
import com.example.lazycolumappjekpack.model.Robot

class RobotRepository {
    fun getRobotData(): List<Robot> {
        return listOf(
            Robot(
                id = 0,
                "sh- 1",
                "11.5.1995"
            ,1.2
            ),            Robot(
                id = 1,
                "sh- 2",
                "11.5.2000"
                ,1.4
            ),            Robot(
                id = 2,
                "sh- 4",
                "11.5.0000"
                ,1.3
            ),            Robot(
                id = 3,
                "sh-10",
                "11.5.3000"
                ,1.1
            )
        )
    }
}
