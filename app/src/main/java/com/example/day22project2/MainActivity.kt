package com.example.day22project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    lateinit var userArrayList: ArrayList<Users>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = arrayOf("Ajay", "Pratiksha","Vaibhav","Akash","Somesh")
        var lastMsg = arrayOf("hello","How are You","fine","Mast","Kaisa hai")
        var lastMsgTime = arrayOf("9:00 PM","9:45 AM","4:34 PM","6:00 AM","10:56 PM")
        var phoneNumber = arrayOf("9766075384","9860650059","8970654320","9708654321","8734567891")
        var imgId = intArrayOf(R.drawable.pic2,R.drawable.pic1,R.drawable.pic3,R.drawable.pic0,R.drawable.pic2)

        userArrayList = ArrayList()
        for (eachIndex in name.indices){
            val user = Users(name[eachIndex],lastMsg[eachIndex], lastMsgTime[eachIndex],phoneNumber[eachIndex],imgId[eachIndex])
            userArrayList.add(user)

            val listView = findViewById<ListView>(R.id.listView)
            listView.isClickable = true

            listView.adapter = MyAdapter(this, userArrayList)

            listView.setOnItemClickListener { parent, view, position, id ->
                val username = name[position]
                val phoneNumber = phoneNumber[position]
                val imageId = imgId[position]

                 // open new activity
                val i = Intent(this,UserActivity::class.java)
                i.putExtra("name",username)
                i.putExtra("phone",phoneNumber)
                i.putExtra("imageId",imageId)
                startActivity(i)
            }
        }


    }
}