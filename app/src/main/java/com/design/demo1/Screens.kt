package com.design.demo1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen() {
    var clicked by rememberSaveable {
        mutableIntStateOf(0)
    }
    var name by rememberSaveable {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        when (clicked) {
            0 -> {
                Text(
                    text = "Hello There!!!",
                    modifier = Modifier
                )
                Spacer(modifier = Modifier.height(8.dp))
                ElevatedButton(
                    modifier = Modifier,
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    ),
                    shape = ShapeDefaults.Medium,
                    elevation = ButtonDefaults.buttonElevation(
                        defaultElevation = 8.dp,
                        pressedElevation = 0.dp,
                        hoveredElevation = 6.dp,
                    ),
                    onClick = { clicked++ }
                ) {
                    Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
                }
            }

            1 -> {
                TextField(
                    value = name,
                    onValueChange = { name = it },
                    maxLines = 1,
                    minLines = 1,
                    placeholder = {
                        Text(
                            text = "Enter Your Name"
                        )
                    })
                Button(onClick = { clicked++ }) {
                    Text(text = "Submit")
                }
            }

            else -> {
                Text(text = "Hi $name", fontSize = 40.sp)
                Text(text = "Fuck You!!!", fontSize = 40.sp)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Sp() {
    Screen()
}