package com.design.demo1

import android.graphics.drawable.Icon
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.painterResource
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
                    YourTask()
                }
            }
        }
    }
}


@Composable
fun YourTask() {
    Column {

        Column(

            modifier = Modifier.fillMaxSize()

        )
        {
//            Spacer(modifier = Modifier.height(2.dp))

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp, horizontal = 4.dp)
            ) {


                Column {
                    Image(
                        modifier = Modifier.size(height = 350.dp, width = 400.dp),
                        painter = painterResource(id = R.drawable.ic_launcher_background),
                        contentScale = ContentScale.Crop,
                        contentDescription = null
                    )
                }


            }

                Column  {
                    Column {
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 4.dp, horizontal = 4.dp)
//                        Spacer(modifier = Modifier.padding(vertical = 4.dp, horizontal = 4.dp)))

                    }

//                            .fillMaxWidth()
//                            .padding(vertical = 4.dp, horizontal = 4.dp)
                    Text(
                        text = "Product Name",
                        fontSize = 30.sp,
                    )
                    Text(
                        text = "Technical Specification" ,
                        fontSize = 20.sp,
                    )

                    Text(
                        text = "Specification 0",
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Specification 1",
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Specification 2",
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Specification 3",
                        fontSize = 20.sp,
                    )
                    Text(
                        text = "Specification 4",
                        fontSize = 20.sp,
                    )


                }
                Spacer(modifier = Modifier.height(220.dp))
                Column {
                    Row {
                        IconButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Filled.ShoppingCart,

                                contentDescription = "Localized description"
                            )
                        }
                        Spacer(modifier = Modifier.width(50.dp))
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Text("Call Now")
                        }
                        Spacer(modifier = Modifier.width(50.dp))
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Text("Order Now")
                        }
                    }


                }
        }
        }


    }








@Preview(showBackground = true)
@Composable
private fun YourTaskPrev() {
    YourTask()
}