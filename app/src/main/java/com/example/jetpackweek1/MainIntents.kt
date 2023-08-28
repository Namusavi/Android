package com.example.jetpackweek1

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.app.ActivityCompat
import androidx.core.app.ActivityCompat.requestPermissions
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.core.content.PermissionChecker.checkSelfPermission

class MainIntents : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        Myintent()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Myintent() {
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize()
            .padding(15.dp)


    ) {

        Spacer(modifier = Modifier.height(15.dp))

        val sms = LocalContext.current


        Button(
            onClick = {
              val phonenumber = "0701110504"
                val messagetext ="Hello its been a while"


                val uri = Uri.parse("snsto:$phonenumber")
                val intent = Intent(Intent.ACTION_SENDTO, uri)
                intent.putExtra("sms_body",messagetext)
              sms.startActivity(intent)

            },
            shape = RoundedCornerShape(4.dp),
            modifier = Modifier.fillMaxWidth()


        ) {
            Text(text = "Launch SMS")
        }



        Spacer(modifier = Modifier.height(21.dp))

        val takepic = LocalContext.current

        Button(
            onClick = {
                val takepictureintent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                takepic.startActivity(takepictureintent,)


            },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()

        ) {
            Text(text = "Launch Camera")

        }




        Spacer(modifier = Modifier.height(21.dp))

        val emaillaunch = LocalContext.current

        Button(
            onClick = {
             val email_intent = Intent(Intent.ACTION_SENDTO).apply {
                 data = Uri.parse("amusavikhamasi@gmail.com")
                 putExtra(Intent.EXTRA_SUBJECT, "Subject")
                 putExtra(Intent.EXTRA_TEXT, "Body")

             }
                val chooserIntent = Intent.createChooser(email_intent,"send email...")
                emaillaunch.startActivity(chooserIntent)
            },
            shape = RoundedCornerShape(6.dp),
            modifier = Modifier.fillMaxWidth()


        ) {
            Text(text = "Launch Email")
        }

      Spacer(modifier = Modifier.height(21.dp))

        val calllaunch = LocalContext.current

        Button(
            onClick = {

                val phoneNumber = "+254701110504"
                val callIntent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber"))

                if (checkSelfPermission("android.permission.CALL_PHONE") != PackageManager.PERMISSION_GRANTED) { requestPermissions(arrayOf("android.permission.CALL_PHONE"), 1) }

                else { calllaunch.startActivity(callIntent)}
            },
           shape = RoundedCornerShape(7.dp),
            modifier = Modifier.fillMaxWidth()

            ) {
            Text(text = "Launch Call")
        }

        Spacer(modifier = Modifier.height(21.dp))


        Button(
            onClick = {


            },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()


            ) {
            Text(text = "Launch Mpesa")
        }

       Spacer(modifier = Modifier.height(21.dp))


        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
         Text(text = "Share")
        }





    }
}
