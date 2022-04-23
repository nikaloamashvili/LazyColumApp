package com.example.lazycolumappjekpack

//import android.graphics.Color
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.lazycolumappjekpack.repository.AlienRepository
import com.example.lazycolumappjekpack.repository.AnimalRepository
import com.example.lazycolumappjekpack.repository.PersonRepository
import com.example.lazycolumappjekpack.repository.RobotRepository
import com.example.lazycolumappjekpack.ui.theme.LazyColumAppJekPackTheme

class MainActivity : ComponentActivity() {

    @ExperimentalFoundationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazyColumAppJekPackTheme  {

                val sections = listOf("Humans", "Animals", "Aliens", "Robots")
                val personRepository = PersonRepository()
                val getPersonData = personRepository.getPersonData()

                val alienRepository = AlienRepository()
                val getAlienData = alienRepository.getAlienData()

                val animalRepository = AnimalRepository()
                val getAnimalData = animalRepository.getAnimalData()

                val robotRepository = RobotRepository()
                val getRobotData = robotRepository.getRobotData()

                LazyColumn(
                    verticalArrangement = Arrangement.spacedBy(12.dp)
                ) {
//                    itemsIndexed( items = getPersonData){index , person ->
//                        Log.d("result" , index.toString())
////                        CustomItem (person = person )
//                    }

                    sections.forEach { section ->
                       stickyHeader {
                           Text(
                               modifier = Modifier
                                   .fillMaxWidth()
                                   .background(Color.LightGray)
                                   .padding(12.dp),
                               text = "Section $section"
                           )
                       }
//                        items(10) {
//                            Text(
//                                modifier = Modifier.padding(12.dp),
//                                text = "Item $it from the section $section"
//
//
//                            )
                            if (section == "Humans") {
                                itemsIndexed(items = getPersonData) { index, person ->
                                    Log.d("result", index.toString())
                                    CustomItem(person = person)
                                }
                            }
                            if (section == "Animals") {
                                itemsIndexed(items = getAnimalData) { index, animal ->
                                    Log.d("result", index.toString())
                                    CustomItem(animal=animal)
                                }
                            }
                            if (section == "Aliens") {
                                itemsIndexed(items = getAlienData) { index, aliens ->
                                    Log.d("result", index.toString())
                                    CustomItem(alien = aliens)
                                }
                            }
                            if (section == "Robots") {
                                itemsIndexed(items = getRobotData) { index, robots ->
                                    Log.d("result", index.toString())
                                    CustomItem(robot = robots)
                                }
                            }
                        }




                }
            }
        }
    }
}


