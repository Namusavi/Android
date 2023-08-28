package com.example.jetpackweek1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class Scrolllist : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          scroll()
            }
        }
    }



@Preview(showBackground = true)
@Composable
fun scroll(){

   Column(
     horizontalAlignment = Alignment.CenterHorizontally,
       verticalArrangement = Arrangement.Center,
       modifier = Modifier
           .fillMaxSize()
           .background(Color.LightGray)




) {
     LazyColumn(){

         items(200){


             index ->
             Text(text = "This is my content")

//to use image
             item{
                 Column{
                   Text(text = "Friday party")
                     androidx.compose.foundation.Image(painter = painterResource(id = R.drawable.pexels-jpeg), contentDescription = null)
                 }
             }



         }




     }




}

}