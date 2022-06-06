package com.example.formulariofilm

import android.content.Context
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

fun msj(context:Context, str:String,lengthShort: Boolean){
    Toast.makeText(context,str, if (lengthShort){Toast.LENGTH_SHORT}else{Toast.LENGTH_LONG}).show()
}
