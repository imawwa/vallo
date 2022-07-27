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


        val tvName : TextView = findViewById(R.id.tv_agentName)
        val imgPhoto: ImageView = findViewById(R.id.img_photo)
        val tvDetail: TextView = findViewById(R.id.tv_deskripsi)
        val tvRealname: TextView = findViewById(R.id.tv_agent_real_name)
        val tvRolesinfo: TextView = findViewById(R.id.tv_agent_info)
        val tvRoles : TextView = findViewById(R.id.tv_agent_roles)
        val tvGenderinfo : TextView = findViewById(R.id.tv_agent_gender_info)
        val tvGender : TextView = findViewById(R.id.tv_agent_gender)

        val tImg = intent.getIntExtra("agentPhoto",0)
        val tName = intent.getStringExtra("agentName")
        val tDetail= intent.getStringExtra("agentDeskripsi")
        val tRealname = intent.getStringExtra("agentRealName")

        Glide.with(this)
            .load(imgPhoto)
            .apply(RequestOptions())
            .into(imgPhoto)
        tvName.text=tName
        tvDetail.text=tDetail
        tvRealname.text=tRealname

    }
    companion object
    const val agentPhoto = "agentphoto"

}