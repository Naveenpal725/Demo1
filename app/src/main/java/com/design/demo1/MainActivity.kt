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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
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


@Composable
fun Profile() {
    // Write Your Code Here
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(100.dp)
                .padding(vertical = 8.dp, horizontal = 16.dp)
        ) {
            Image(
                modifier = Modifier.clip(CircleShape),
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
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
                Text(
                    text = "Designation",
                    fontSize = 32.sp,
                )
            }
        }
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
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
        ) {
            Icon(
                modifier = Modifier.size(36.dp),
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
    }
}

@Preview(showBackground = true)
@Composable
private fun ProfilePrev() {
    Profile()
}