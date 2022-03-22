package com.example.lazycolumappjekpack

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lazycolumappjekpack.model.Alien
import com.example.lazycolumappjekpack.model.Animal
import com.example.lazycolumappjekpack.model.Person
import com.example.lazycolumappjekpack.model.Robot
import com.example.lazycolumappjekpack.ui.theme.Typography

@Composable
fun CustomItem(person:Person) {
    val context1 = LocalContext.current
    Row(
        modifier = Modifier.clickable {
            Toast.makeText(
                context1,
                "${person.id}",
                Toast.LENGTH_SHORT
            ).show()
        }
            .background(Color.LightGray)
            .fillMaxWidth()
            .border(12.dp, Color.Blue)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = person.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = person.lastName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun CustomItem(alien:Alien) {
    val context2 = LocalContext.current

    Row(
        modifier = Modifier.clickable {
            Toast.makeText(
                context2,
                "${alien.id}",
                Toast.LENGTH_SHORT
            ).show()
        }
            .background(Color.LightGray)
            .fillMaxWidth()
            .border(12.dp, Color.Green)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${alien.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = alien.firstName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = alien.lastName,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = alien.originPlanet,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun CustomItem(robot:Robot) {
    val context3 = LocalContext.current

    Row(
        modifier = Modifier.clickable {
            Toast.makeText(
                context3,
                "${robot.id}",
                Toast.LENGTH_SHORT
            ).show()

        }
            .background(Color.LightGray)
            .fillMaxWidth()
            .border(12.dp, Color.Red)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${robot.Name}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = robot.Name,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = robot.buildDate,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}

@Composable
fun CustomItem(animal: Animal) {
    val context5 = LocalContext.current

    Row(
        modifier = Modifier.clickable {
            Toast.makeText(
                context5,
                "${animal.id}",
                Toast.LENGTH_SHORT
            ).show()
        }
            .background(Color.LightGray)
            .fillMaxWidth()
            .border(12.dp, Color.Yellow)
            .padding(24.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = "${animal.age}",
            color = Color.Black,
            fontSize = Typography.h4.fontSize,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = animal.Type,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
        Text(
            text = animal.Name,
            color = Color.Black,
            fontSize = Typography.h5.fontSize,
            fontWeight = FontWeight.Normal
        )
    }
}


@Composable
@Preview
fun CustomItemPreview() {
    CustomItem(
        person = Person(
            id = 0,
            firstName = "John",
            lastName = "Doe",
            age = 20
        )
    )
}
