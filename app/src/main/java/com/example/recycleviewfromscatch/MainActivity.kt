package com.example.recycleviewfromscatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

private  lateinit var  linearLayoutManager: LinearLayoutManager
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(this)
        my_recyview.layoutManager = linearLayoutManager
        my_recyview.adapter = RecyleApdater(createOneUser(),this)
        my_recyview.setHasFixedSize(true)
    }
    fun createOneUser():ArrayList<UserData>{
        var arrListUser = ArrayList<UserData>()
        for (i in 1.. 100){
            var user = UserData("user"+i,
            "https://koenig-media.raywenderlich.com/uploads/2019/06/Picasso-feature.png")
            arrListUser.add(user)
        }
        return arrListUser
    }
}