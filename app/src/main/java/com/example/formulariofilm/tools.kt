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
fun getSpinner(spinner: Spinner, myContext:Context, opselect:Array<String>, data:Int){
    val adaptador: ArrayAdapter<*> = ArrayAdapter.createFromResource(myContext, R.array.Year,
        android.R.layout.simple_spinner_item)
    spinner.adapter = adaptador
    spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
        override fun onItemSelected(
            parent: AdapterView<*>?,
            view: View?,
            position: Int,
            id: Long
        ) {
            opselect[0] = parent?.getItemAtPosition(position).toString()
        }

        override fun onNothingSelected(parent: AdapterView<*>?) {
            opselect[0] = "No ha habido selección"
        }
    }
}

