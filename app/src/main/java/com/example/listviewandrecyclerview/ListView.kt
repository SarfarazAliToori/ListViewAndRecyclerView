package com.example.listviewandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_list_view.*

class ListView : AppCompatActivity() {

    var myArray = arrayOf("Red", "Green", "Blue", "Yellow", "Brown", "Chocolate", "Cyan")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        listViewImplementation()
    }

    fun listViewImplementation() {
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myArray)
        list_view.adapter = arrayAdapter

        // item click
        list_view.onItemClickListener = object : AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val name = list_view.getItemAtPosition(p2) as String
                Toast.makeText(applicationContext, "Color Name : $name, Position : $p2", Toast.LENGTH_SHORT).show()
            }
        }
    }
}