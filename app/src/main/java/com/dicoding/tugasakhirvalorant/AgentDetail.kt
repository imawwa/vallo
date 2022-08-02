package com.dicoding.tugasakhirvalorant

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AgentDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agent_detail)
        val AgentIntent = intent.getParcelableExtra<AgentData>(INTENT_PARCEABLE) as AgentData

        val tvName : TextView = findViewById(R.id.tv_agentName)
        val imgPhoto: ImageView = findViewById(R.id.img_photo)
        val tvRealname: TextView = findViewById(R.id.tv_agent_real_name)
        val tvDetail: TextView = findViewById(R.id.tv_deskripsi)
        val tvRolesinfo: TextView = findViewById(R.id.tv_agent_info)
        val tvGenderinfo : TextView = findViewById(R.id.tv_agent_gender_info)

        tvName.text= AgentIntent.agentName
        imgPhoto.setImageResource(AgentIntent.agentPhoto)
        tvRealname.text= AgentIntent.agentRealname
        tvDetail.text= AgentIntent.agentDeskripsi
        tvRolesinfo.text= AgentIntent.agentRole
        tvGenderinfo.text= AgentIntent.agentGender




    }
    companion object{
        const val INTENT_PARCEABLE= "INTENT_PARCEABLE"

    }
}