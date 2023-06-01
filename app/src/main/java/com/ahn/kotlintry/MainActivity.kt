package com.ahn.kotlintry

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_click_me.setOnClickListener {
            Log.i("MainActivity", "Hit Me")
            Toast.makeText(this, "Hit Me", Toast.LENGTH_SHORT).show()
        }

        /*btn_click_me2.setOnClickListener {
            Toast.makeText(this, "Hit Me 2", Toast.LENGTH_SHORT).show()
        }*/

        btn_click_me2.setOnClickListener(this)
        btn_recycle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        var id = v?.id
        if (id == R.id.btn_click_me2){
            //Toast.makeText(this, "Hit Me 2", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("val", "Hi.....")
            startActivity(intent)
        }

        if(id == R.id.btn_recycle){
            val intent2 = Intent(this, MainActivity2::class.java)
            startActivity(intent2)
        }
    }
}