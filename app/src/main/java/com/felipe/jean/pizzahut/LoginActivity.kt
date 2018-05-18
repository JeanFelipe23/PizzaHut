package com.felipe.jean.pizzahut

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun logar(view:View){

        val login = etLogin.text.toString()
        val senha = etSenha.text.toString()

        if (login == "FIAP" && senha == "123") {

            val intent = Intent(this, PedidoActivity::class.java)

            intent.putExtra("usuario", login)
//o que vc quer?PARCELable isto se faz no objeto; vc nao tem objeto.
            startActivity(intent)
            PedidoActivity()
        }else{
            Toast.makeText(this,"Usúario ou senha invalidos",
                    Toast.LENGTH_SHORT).show()

        }



    }




 }









