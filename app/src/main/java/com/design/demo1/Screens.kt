package com.design.demo1

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Screen() {
    var clicked by rememberSaveable {
        mutableStateOf(true)
    }
    Column {
        if (clicked) {
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
                onClick = { clicked = !clicked }
            ) {
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null)
            }
        } else {
            Text(text = "Hi There!..", fontSize = 40.sp)
            Text(text = "You Clicked me!!!", fontSize = 40.sp)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Sp() {
    Screen()
}