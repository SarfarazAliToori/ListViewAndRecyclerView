package com.example.listviewandrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.my_items_list.view.*

class MyAddapter(val items : ArrayList<String>, val context : Context) : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.my_items_list,parent,false))

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.animalListTextView.text = items.get(position)
        val item = items[position]
        holder.itemsListTextView.text = item

        holder.itemsListTextView.setOnClickListener(View.OnClickListener {
            Toast.makeText(context, "ID: $position   NAME: $item", Toast.LENGTH_LONG).show()
        })
    }

    override fun getItemCount(): Int {
        return items.size
    }
}

// ViewHolder Class
class ViewHolder (view : View) : RecyclerView.ViewHolder(view) {
    val itemsListTextView = view.tv_items
}