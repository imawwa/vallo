package com.dicoding.tugasakhirvalorant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.tugasakhirvalorant.database.FavUser

class FavAgentAdapter(private val favusers : ArrayList<FavUser>) : RecyclerView.Adapter<FavAgentAdapter.FavAgentHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavAgentHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.activity_fav_agent,parent,false)
        return FavAgentHolder(view)
    }

    override fun onBindViewHolder(holder: FavAgentHolder, position: Int) {
        val agent = favusers[position]

        holder.tvAgentname.text= agent.agentname
        Glide.with(holder.itemView.context)
            .load(agent.fotoagent)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhotofav)
    }

    override fun getItemCount(): Int {
        return favusers.size
    }

    class FavAgentHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvAgentname : TextView = itemView.findViewById(R.id.tv_agentName_fav)
        var imgPhotofav : ImageView = itemView.findViewById(R.id.img_photo_fav)

    }

     fun setData (list: List<FavUser>){
         favusers.clear()
         favusers.addAll(list)
         notifyDataSetChanged()
     }
}