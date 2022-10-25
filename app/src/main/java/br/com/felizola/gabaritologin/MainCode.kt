package br.com.felizola.gabaritologin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainCode : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.telainicial)
        val user = findViewById<EditText>(R.id.usuario).text.toString()
        val pass = findViewById<EditText>(R.id.password).text.toString()
        val bt = findViewById<Button>(R.id.btnok)
        bt.setOnClickListener {
            val user = findViewById<EditText>(R.id.usuario).text.toString()
            val pass = findViewById<EditText>(R.id.password).text.toString()
            if (user=="nfelizola" && pass=="1234") {
                Toast.makeText(this, "Bem vindo Sr. $user sua senha está  correta", Toast.LENGTH_LONG).show()
                // depois da mensagem de usuário correto colocar a imagem do avatarok
            }else{
                // nesta linha colocar o codigo para trocar a imagem do avatar para a que indica acesso negado
                Toast.makeText(this,"Revise suas informações",Toast.LENGTH_LONG).show()

                 }
        }
    }
}
