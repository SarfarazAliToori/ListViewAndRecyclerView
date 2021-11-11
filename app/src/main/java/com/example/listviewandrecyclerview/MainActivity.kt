package com.example.listviewandrecyclerview

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mInit()

    }

    private fun mInit() {
        btn_listView.setOnClickListener(this)
        btn_recyclerView.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0?.id) {
            R.id.btn_listView -> mListView()
            R.id.btn_recyclerView -> mRecyclerView()
        }
    }

    fun mListView() {
        val intent = Intent(applicationContext, ListView::class.java)
        startActivity(intent)
    }

    fun mRecyclerView() {
        val intent = Intent(applicationContext, RecyclerView::class.java)
        startActivity(intent)
    }
}