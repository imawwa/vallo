package com.dicoding.tugasakhirvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.tugasakhirvalorant.Detail.AgentAdapter
import com.dicoding.tugasakhirvalorant.setdatta.AgentData
import com.dicoding.tugasakhirvalorant.setdatta.setData

class MainActivity : AppCompatActivity() {
    private lateinit var rvAgent: RecyclerView
    private var list: ArrayList<AgentData> = arrayListOf()
    private var menu: Menu? = null




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
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about,menu)
        this.menu = menu
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_profile -> {
                startActivity(Intent(this@MainActivity, profile::class.java))
                true
            }
            R.id.fav_list-> {
                startActivity(Intent(this@MainActivity, FavAgent::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

