package com.example.listviewandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*
import kotlinx.android.synthetic.main.my_items_list.*

class RecyclerView : AppCompatActivity() {

    val myArrayList :  ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        title = "Recycler View"
        // add items in list
        addItemsInArrayList()

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MyAddapter(myArrayList, this)

        // for notify the recycler view... When we delete or add data into recycler view
        val myAddapter : RecyclerView.Adapter<ViewHolder>? = null
        myAddapter?.notifyDataSetChanged()

    }

    fun addItemsInArrayList() {
        myArrayList.add("Red")
        myArrayList.add("Green")
        myArrayList.add("Blue")
        myArrayList.add("Cyan")
        myArrayList.add("Yellow")
        myArrayList.add("Purple")
        myArrayList.add("Chartreuse")
        myArrayList.add("Chocolate")
        myArrayList.add("DarkCyan")
        myArrayList.add("DarkGrey")
        myArrayList.add("DarkOrange")
        myArrayList.add("Aqua")
        myArrayList.add("AntiqueWhite")
        myArrayList.add("AliceBlue")
        myArrayList.add("Aquamarine")
        myArrayList.add("BlueViolet")
        myArrayList.add("DarkRed")
        myArrayList.add("DarkSlateGrey")
        myArrayList.add("DeepPink")
        myArrayList.add("ForestGreen")
        myArrayList.add("FireBrick")
    }
}