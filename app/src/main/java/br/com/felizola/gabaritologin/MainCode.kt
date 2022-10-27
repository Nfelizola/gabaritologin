package br.com.felizola.gabaritologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import android.view.View.OnClickListener
import android.view.View.OnKeyListener

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainCode : AppCompatActivity(), OnKeyListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telainicial)
        var user = findViewById<EditText>(R.id.usuario).text.toString()
        var pass = findViewById<EditText>(R.id.password).text.toString()
        var editsenha = findViewById<EditText>(R.id.password)
        var press = editsenha.setOnKeyListener(this)
        if (press) { Toast.makeText(this, "ola", Toast.LENGTH_SHORT).show()}

    }

    override fun onKey(p0: View?, p1: Int, p2: KeyEvent?): Boolean {

        return true
    }
}

