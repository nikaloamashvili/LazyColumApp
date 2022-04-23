package com.example.lazycolumappjekpack

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import com.example.lazycolumappjekpack.model.Alien
import com.example.lazycolumappjekpack.model.Animal
import com.example.lazycolumappjekpack.model.Person
import com.example.lazycolumappjekpack.model.Robot
import com.example.lazycolumappjekpack.ui.theme.Typography

@Composable
fun CustomItem(person:Person) {
    val context1 = LocalContext.current
    Row(
        modifier = Modifier
            .clickable {
                Toast
                    .makeText(
                        context1,
                        "${person.id}",
                        Toast.LENGTH_SHORT
                    )
                    .show()
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
        CoilImage("https://i.pinimg.com/564x/45/ea/97/45ea9732f6d0525ab216c3cbd20e3a7c.jpg")

    }
}

@Composable
fun CustomItem(alien:Alien) {
    val context2 = LocalContext.current

    Row(
        modifier = Modifier
            .clickable {
                Toast
                    .makeText(
                        context2,
                        "${alien.id}",
                        Toast.LENGTH_SHORT
                    )
                    .show()
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
        CoilImage("https://i.pinimg.com/564x/71/e2/11/71e211238e2fbd57010c6c5a178f4859.jpg")
    }
}

@Composable
fun CustomItem(robot:Robot) {
    val context3 = LocalContext.current

    Row(
        modifier = Modifier
            .clickable {
                Toast
                    .makeText(
                        context3,
                        "${robot.id}",
                        Toast.LENGTH_SHORT
                    )
                    .show()

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
        CoilImage("https://toppng.com/uploads/preview/robot-png-11553969566hs4wsrryg5.png")
    }
}

@Composable
fun CustomItem(animal: Animal) {
    val context5 = LocalContext.current

    Row(
        modifier = Modifier
            .clickable {
                Toast
                    .makeText(
                        context5,
                        "${animal.id}",
                        Toast.LENGTH_SHORT
                    )
                    .show()
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
        CoilImage("https://i.pinimg.com/564x/b6/34/f1/b634f100fbf4e11ed044ab8e043972f0.jpg")
    }
}


@Composable
@Preview
fun CustomItemPreview() {


}
@Composable
fun CoilImage(urlo : String){

    Box(modifier= Modifier
        .height(150.dp)
        .width(150.dp),
        contentAlignment = Alignment.Center)
        {
            val painter1= rememberImagePainter(
                data =urlo,
                builder ={
                    error(R.drawable.erorr_1)
                }
            )
            val printerState =painter1.state
            Image(painter =painter1,contentDescription="logo")
            if(printerState is ImagePainter.State.Loading){
                CircularProgressIndicator()
            }
        }

}
