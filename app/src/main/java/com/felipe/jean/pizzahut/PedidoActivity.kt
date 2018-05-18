package com.felipe.jean.pizzahut

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.felipe.jean.pizzahut.R.id.tvUsuario

class PedidoActivity : AppCompatActivity() {

    val pizzaSelecionadas = ArrayList<String>()
    var tamanhoSelecionado = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)


    val bundle = intent.extras
    val usuario = bundle.getString("usuario")

    tvUsuario.text = "Óla usuario"
    }




}
