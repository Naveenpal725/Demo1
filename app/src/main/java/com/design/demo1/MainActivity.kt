package com.design.demo1

import android.health.connect.datatypes.units.Length
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.design.demo1.ui.theme.Demo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Demo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Profile()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Profile() {
    // Write Your Code Here }

    Column(

        modifier = Modifier//.fillMaxSize()

    )
    {
        Spacer(modifier = Modifier.height(2.dp))

        ElevatedCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp, horizontal = 8.dp)
        ) {


            Row {
                Image(
                    modifier = Modifier.size(height = 150.dp, width =120.dp ),
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentScale = ContentScale.Crop,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column {
                    Text(
                        text = "Product Name",
                        fontSize = 20.sp,
                        )
                    Text(
                        text = "Technical Specification"
                    )

                    Text(
                        text = "Specification 0"
                    )
                    Text(
                        text =  "Specification 1"
                    )
                    Text(
                        text =  "Specification 2"
                    )
                    Text(
                        text =  "Specification 3"
                    )
                    Text(
                        text =  "Specification 4"
                    )

                }



            }


        }

    }
//    Column(
//
//        modifier = Modifier//.fillMaxSize()
//
//    )
//    {
//        Spacer(modifier = Modifier.height(4.dp))
//
//        ElevatedCard(
//            modifier = Modifier
//                .fillMaxWidth()
//                .padding(vertical = 8.dp, horizontal = 8.dp)
//        ) {
//
//
//            Row {
//                Image(
//                    modifier = Modifier.size(60.dp),
//                    painter = painterResource(id = R.drawable.ic_launcher_background),
//                    contentScale = ContentScale.Crop,
//                    contentDescription = null
//                )
//                Spacer(modifier = Modifier.width(30.dp))
//                Column {
//                    Text(
//                        text = "Product Name",
//                        fontSize = 20.sp,
//                    )
//                    Text(
//                        text = "Features of Product"
//                    )
//
//                    Text(
//                        text = "Features of Product"
//                    )
//                    Text(
//                        text = "Features of Product"
//                    )
//                    Text(
//                        text = "Features of Product"
//                    )
//
//                }
//
//
//
//            }
//
//
//        }
//
//    }
}


@Preview(showBackground = true)
@Composable
private fun ProfilePrev() {
    Profile()
}