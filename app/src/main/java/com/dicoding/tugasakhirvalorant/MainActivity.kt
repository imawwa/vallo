package com.dicoding.tugasakhirvalorant

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var rvAgent: RecyclerView
    private var list: ArrayList<AgentData> = arrayListOf()





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvAgent = findViewById(R.id.rvAgent)
        rvAgent.setHasFixedSize(true)
        list.addAll(setData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvAgent.layoutManager = LinearLayoutManager(this)
        val AgentAdapter = AgentAdapter(list)
        rvAgent.adapter = AgentAdapter

    }
}

