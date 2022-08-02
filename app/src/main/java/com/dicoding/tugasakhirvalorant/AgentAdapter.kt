package com.dicoding.tugasakhirvalorant

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.view.view.*
import com.dicoding.tugasakhirvalorant.AgentData as AgentData1

class AgentAdapter(val listAgent :ArrayList<AgentData1>) : RecyclerView.Adapter<AgentAdapter.ListViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.view,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val agent = listAgent[position]

        Glide.with(holder.itemView.context)
            .load(agent.agentPhoto)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = agent.agentName

        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context,AgentDetail::class.java)
            intent.putExtra(AgentDetail.INTENT_PARCEABLE, agent)
            holder.itemView.context.startActivity(intent)
        }

    }





    override fun getItemCount(): Int {
        return listAgent.size
    }



    class ListViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var tvName : TextView = itemView.findViewById(R.id.tv_agentName)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)




    }
}

