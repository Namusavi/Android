package com.example.jetpackweek1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MpesaActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}
private  val menuList = mutableListOf("Send Money", "Withdraw Cash", "Buy Airtime", "Loans and Savings", "Lipa na Mpesa","My Account")
private val listModifier = Modifier
    .fillMaxSize()
    .background(Color.DarkGray)
    .padding(13.dp)

private val textStyle: androidx.compose.ui.text.TextStyle
    get() = androidx.compose.ui.text.TextStyle(fontSize = 20.sp)



@Preview(showBackground = true)
@Composable
fun mpesamenu() {
   LazyColumn(modifier = listModifier ){
       items(menuList){
        menu->
           Text(text = menu)

        }
    }
}

