package com.kautec.applicationnotification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import com.google.firebase.iid.FirebaseInstanceId

class MainActivity : AppCompatActivity() {
    lateinit var btnSendNotification : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSendNotification = findViewById(R.id.button_send_notification)
        btnSendNotification.setOnClickListener{
            this.showNotification("1234", "Bootcamp Android", "Curso de Kotlin")
        }

        Log.i("**newToken", FirebaseInstanceId.getInstance().token.toString())
    }
}