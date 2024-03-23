package com.example.fuckingend

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val del1 : Button = findViewById(R.id.del1)
        val del2 : Button = findViewById(R.id.del2)
        val del3 : Button = findViewById(R.id.del3)
        val del4 : Button = findViewById(R.id.del4)
        val ed1 : Button = findViewById(R.id.ed1)
        val ed2 : Button = findViewById(R.id.ed2)
        val ed3 : Button = findViewById(R.id.ed3)
        val ed4 : Button = findViewById(R.id.ed4)
        val view1 : View = findViewById(R.id.v1)
        val view2 : View = findViewById(R.id.v2)
        val view3 : View = findViewById(R.id.v3)
        val view4 : View = findViewById(R.id.v4)
        val img1 : ImageView = findViewById(R.id.img1)
        val img2 : ImageView = findViewById(R.id.img2)
        val img3 : ImageView = findViewById(R.id.img3)
        val img4 : ImageView = findViewById(R.id.img4)
        val login1 : TextView = findViewById(R.id.login1)
        val login2 : TextView = findViewById(R.id.login2)
        val login3 : TextView = findViewById(R.id.login3)
        val login4 : TextView = findViewById(R.id.login4)
        val pass1 : TextView = findViewById(R.id.pass1)
        val pass2 : TextView = findViewById(R.id.pass2)
        val pass3 : TextView = findViewById(R.id.pass3)
        val pass4 : TextView = findViewById(R.id.pass4)
        del1.setOnClickListener{
            del1.isVisible = false
            ed1.isVisible = false
            view1.isVisible = false
            img1.isVisible = false
            login1.isVisible = false
            pass1.isVisible = false
        }
        del2.setOnClickListener{
            del2.isVisible = false
            ed2.isVisible = false
            view2.isVisible = false
            img2.isVisible = false
            login2.isVisible = false
            pass2.isVisible = false
        }
        del3.setOnClickListener {
            del3.isVisible = false
            ed3.isVisible = false
            view3.isVisible = false
            img3.isVisible = false
            login3.isVisible = false
            pass3.isVisible = false
        }
        del4.setOnClickListener {
            del4.isVisible = false
            ed4.isVisible = false
            view4.isVisible = false
            img4.isVisible = false
            login4.isVisible = false
            pass4.isVisible = false
        }
    }
}