package com.dicoding.tugasakhirvalorant

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.tugasakhirvalorant.database.UserDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FavAgent : AppCompatActivity() {

    val db by lazy { UserDatabase(this) }
    lateinit var favAgentAdapter: FavAgentAdapter
    private lateinit var rvAgent : RecyclerView




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fav_agent)


        rvAgent=findViewById(R.id.rvAgent)

        showFavList()
        showRecylerList()
    }

    override fun onStart() {
        super.onStart()
        CoroutineScope(Dispatchers.IO).launch {
            val favagents = db.favDao().getFavorites()
            Log.e("FavAgent","dbRespon: $favagents")
            withContext(Dispatchers.Main){
                favAgentAdapter.setData(favagents)
            }
        }
    }
    private fun showRecylerList(){

        favAgentAdapter = FavAgentAdapter(arrayListOf())
        rvAgent.apply {
            layoutManager = LinearLayoutManager(this@FavAgent)
            adapter = favAgentAdapter
        }
    }

    fun showFavList(){
        val actionBar = supportActionBar

        actionBar!!.title="Favorite Agent"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
