package com.example.listviewandrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycler_view.*
import kotlinx.android.synthetic.main.my_items_list.*

class RecyclerView : AppCompatActivity() {

    val animalArrayList :  ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        title = "Recycler View"
        // add items in list
        addItemsInArrayList()

        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = MyAddapter(animalArrayList, this)

    }

    fun addItemsInArrayList() {
        animalArrayList.add("Red")
        animalArrayList.add("Green")
        animalArrayList.add("Blue")
        animalArrayList.add("Cyan")
        animalArrayList.add("Yellow")
        animalArrayList.add("Purple")
        animalArrayList.add("Chartreuse")
        animalArrayList.add("Chocolate")
        animalArrayList.add("DarkCyan")
        animalArrayList.add("DarkGrey")
        animalArrayList.add("DarkOrange")
        animalArrayList.add("Aqua")
        animalArrayList.add("AntiqueWhite")
        animalArrayList.add("AliceBlue")
        animalArrayList.add("Aquamarine")
        animalArrayList.add("BlueViolet")
        animalArrayList.add("DarkRed")
        animalArrayList.add("DarkSlateGrey")
        animalArrayList.add("DeepPink")
        animalArrayList.add("ForestGreen")
        animalArrayList.add("FireBrick")
    }
}