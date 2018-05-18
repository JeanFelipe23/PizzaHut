package com.felipe.jean.pizzahut

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by logonrm on 18/05/2018.
 */
//saquei eu estava tentando importar primeiro ,vou sair aqui to atrasado mas ele faz auto para se lembra de como implementar a biblioteca la
//era para lista isto?tambem suave vlw flw =D
data class Pedido (val nomeCliente:String,
                   val sabores: List<String>,
                   val tamanho:String,
                   val tipoPagamento:String):Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.createStringArrayList(),
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nomeCliente)
        parcel.writeStringList(sabores)
        parcel.writeString(tamanho)
        parcel.writeString(tipoPagamento)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Pedido> {
        override fun createFromParcel(parcel: Parcel): Pedido {
            return Pedido(parcel)
        }

        override fun newArray(size: Int): Array<Pedido?> {
            return arrayOfNulls(size)
        }
    }
}