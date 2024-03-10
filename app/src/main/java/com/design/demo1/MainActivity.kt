package com.design.demo1

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
    // Write Your Code Here
    Column(
        modifier = Modifier.fillMaxSize()
    )
    {
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(vertical = 8.dp, horizontal = 16.dp)
        ) {
            Image(
                modifier = Modifier.clip(CircleShape),
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null
            )
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Name",
                    fontSize = 32.sp,
                )

            }

        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                modifier = Modifier.size(36.dp),
                imageVector = Icons.Default.Call,
                contentDescription = null,
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Phone Number",
                fontSize = 32.sp,
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Icons.Default.Email,
                contentDescription = null,
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Email",
                fontSize = 32.sp,
            )

        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                modifier = Modifier.size(40.dp),
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint = Color.Blue
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(
                text = "Address",
                fontSize = 32.sp,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Button(onClick = { /*TODO*/ }) {
                //    Spacer(modifier = Modifier.width(16.dp))
                // Spacer(modifier = Modifier.height(16.dp))
                Icon(
                    modifier = Modifier.size(36.dp),
                    imageVector = Icons.Default.ShoppingCart,
                    contentDescription = null,
                    tint = Color.Blue
                )
                //    Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "My Order",
                    fontSize = 20.sp,
                )

            }

            Button(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.size(36.dp),
                    imageVector = Icons.Default.Create,
                    contentDescription = null,
                    tint = Color.Blue
                )
                Text(
                    text = "Edit",
                    fontSize = 20.sp,
                )
            }

        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Button(onClick = { /*TODO*/ }) {
                Icon(
                    modifier = Modifier.size(28.dp),
                    imageVector = Icons.Default.Person,
                    contentDescription = null,
                    tint = Color.Blue
                )
                Text(
                    text = "My Cart",
                    fontSize = 20.sp,
                )

            }
            Button(onClick = { /*TODO*/ }) {
                Spacer(modifier = Modifier.width(16.dp))
                Icon(
                    modifier = Modifier.size(28.dp),
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.Blue
                )
                Text(
                    text = "Search",
                    fontSize = 20.sp,

                    )

            }
        }
        LazyColumn {
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }
            item { Options(heading = "My Orders", subHeading = "1") }

        }
    }

}

@Composable
fun Options(
    heading: String,
    subHeading: String
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column{
            Text(text = heading, fontSize = 20.sp,
                fontWeight = FontWeight.Bold)
            Text(text = subHeading)
        }
        Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
    }
    Divider()
}

@Preview(showBackground = true)
@Composable
private fun ProfilePrev() {
    Profile()
}