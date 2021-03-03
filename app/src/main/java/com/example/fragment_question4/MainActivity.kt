package com.example.fragment_question4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fm = supportFragmentManager



        btn_manish.setOnClickListener(){

            fm.beginTransaction().replace(R.id.fragment, Frag_1(),"f").commit()


        }
        btn_ritik.setOnClickListener(){
            fm.beginTransaction().replace(R.id.fragment, Frag_2(),"r").commit()

        }
        btn_shoaib.setOnClickListener(){
            fm.beginTransaction().replace(R.id.fragment, Frag_Three(),"m").commit()
        }
    }
}
