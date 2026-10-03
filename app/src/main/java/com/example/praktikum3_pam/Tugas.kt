package com.example.praktikum3_pam

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Alignment
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

@Composable
fun Halamanlogin (modifier: Modifier) {
    Box (
        modifier = modifier.fillMaxSize()
    ) {
        Image (
            painter = painterResource(id = R.drawable.foto_bg),
            contentDescription = "Background Masjid",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

          }
      }
}