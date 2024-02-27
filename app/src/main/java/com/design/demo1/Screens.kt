package com.design.demo1

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ShapeDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Screen() {
    Column {
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
            onClick = { /*TODO*/ }
        ) {
            Icon(imageVector = Icons.Default.AccountCircle , contentDescription = null)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Sp() {
    Screen()
}