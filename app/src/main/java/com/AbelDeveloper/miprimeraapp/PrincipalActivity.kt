package com.AbelDeveloper.miprimeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.AbelDeveloper.miprimeraapp.R.*


class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_principal)

        val btnStart = findViewById<AppCompatButton>(id.btnStart)
        val etName = findViewById<AppCompatEditText>(id.etName)

        btnStart.setOnClickListener{
            val name:String = etName.text.toString()

            if(name.isNotEmpty()){
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME",name)
                startActivity(intent)
//                Log.i("Abel Camilo","boton pulsado $name")
            }

        }

    }
}