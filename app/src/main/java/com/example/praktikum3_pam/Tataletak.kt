package com.example.praktikum3_pam

import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text

@Composable
fun TataletakColumn(modifier: Modifier){
    Column(modifier = Modifier.padding(
        top = 20.dp,
        start = 20.dp,
        end = 20.dp)) {
        Text(text = "Kompeni1")
        Text(text = "Kompeni2")
        Text(text = "Kompeni3")
        Text(text = "Kompeni4")
    }
}
