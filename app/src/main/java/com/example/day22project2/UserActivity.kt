package com.example.day22project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val phoneNumber = intent.getStringExtra("phoneNumber")
        val imageId = intent.getIntExtra("imageId",R.drawable.pic0)

        val nameTV = findViewById<TextView>(R.id.textView3)
        val phoneTv = findViewById<TextView>(R.id.textView4)
        val imageTid = findViewById<CircleImageView>(R.id.profile_image)

        nameTV.text = name
        phoneTv.text = phoneNumber
        imageTid.setImageResource(imageId)
    }
}