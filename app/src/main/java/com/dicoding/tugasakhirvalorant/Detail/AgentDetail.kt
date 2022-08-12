package com.dicoding.tugasakhirvalorant.Detail

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.ToggleButton
import com.dicoding.tugasakhirvalorant.setdatta.AgentData
import com.dicoding.tugasakhirvalorant.R
import com.dicoding.tugasakhirvalorant.database.FavUser
import com.dicoding.tugasakhirvalorant.database.UserDatabase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AgentDetail() : AppCompatActivity() {

    val db by lazy { UserDatabase(this) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_detail)
        val actionbar = supportActionBar
        actionbar!!.title = "Agent Details"
        actionbar.setDisplayHomeAsUpEnabled(true)

        setFavorite()




        val AgentIntent = intent.getParcelableExtra<AgentData>(INTENT_PARCEABLE) as AgentData

        val tvName : TextView = findViewById(R.id.tv_agentName_detail)
        val imgPhoto: ImageView = findViewById(R.id.img_photo)
        val tvRealname: TextView = findViewById(R.id.tv_agent_real_name_detail)
        val tvDetail: TextView = findViewById(R.id.tv_deskripsi_detail)
        val tvRolesinfo: TextView = findViewById(R.id.tv_agent_roles_detail)
        val tvGenderinfo : TextView = findViewById(R.id.tv_gender)

        tvName.text=AgentIntent.agentName
        imgPhoto.setImageResource(AgentIntent.agentPhoto)
        tvRealname.text= AgentIntent.agentRealname
        tvDetail.text= AgentIntent.agentDeskripsi
        tvRolesinfo.text= AgentIntent.agentRole
        tvGenderinfo.text= AgentIntent.agentGender


    }







    companion object{
        const val INTENT_PARCEABLE= "INTENT_PARCEABLE"

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}