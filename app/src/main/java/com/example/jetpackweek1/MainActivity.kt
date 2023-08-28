

package com.example.getting_started_jetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackweek1.LoginActivity
import com.example.jetpackweek1.Scrolllist

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Home()

        }
    }
}

@Preview(showBackground = true)
@Composable

fun Home(){

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {


    }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        ,
        modifier = Modifier
            .background(Color.Transparent)
            .fillMaxSize()//covers entire width of your device
    ) {

        Text(text = "WELCOME TO OUR APPLICATION", color = Color.Blue, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(12.dp))

        var login = LocalContext.current

        Button(onClick = {
            login.startActivity(Intent(login,LoginActivity::class.java)) },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

        )



        {

            Text(text = "LOGIN", fontSize = 20.sp)
        }



        //another button

        Spacer(modifier = Modifier.height(12.dp))



        var scroll = LocalContext.current

        Button(onClick = {
            scroll.startActivity(Intent(scroll,Scrolllist::class.java)) },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

        )



        {

            Text(text = "SCROLL", fontSize = 20.sp)
        }

    }
}









