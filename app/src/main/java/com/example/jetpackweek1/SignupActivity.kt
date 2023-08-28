package com.example.jetpackweek1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SignupActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
     signupinterface()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable

fun signupinterface() {

    val firstname by remember {
        mutableStateOf("")
    }
    val lastname by remember {
        mutableStateOf("")
    }

    val phonenumber by remember {
        mutableStateOf("")
    }

    val email by remember {
        mutableStateOf("")
    }
    val password by remember {
        mutableStateOf("")
        }

    Column(
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize() ,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ){



        Text(text = "Welcome to Detox Please Sign up", color = Color.DarkGray, fontSize = 25.sp)

        OutlinedTextField(
            value =   firstname,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="Firstname Icon" ) },
            onValueChange =   {firstname},
            label = { Text(text = "firstname") },
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(21.dp))

        OutlinedTextField(
            value = lastname,
            leadingIcon = { Icon(Icons.Default.Person, contentDescription ="lastname Icon" ) },
            onValueChange = {lastname},
            label = { Text(text = "lastname") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(21.dp))


        OutlinedTextField(
            value = phonenumber,
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription ="Phonenumber Icon" ) },
            onValueChange = {phonenumber},
            label = { Text(text = "phonenumber") },
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(21.dp))

        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="email Icon" ) },
            onValueChange = {email},
            label = { Text(text = "email") },
            modifier = Modifier.fillMaxWidth()

        )
        Spacer(modifier = Modifier.height(21.dp))

        OutlinedTextField(
            value = password,
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription ="pass Icon" ) },
            onValueChange = {password},
            label = { Text(text = "password") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(21.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "SignUp")
        }


    }



}








