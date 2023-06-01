package com.ahn.kotlintry

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_list.view.*

class HobbiesAdapter(val context:Context, val list:List<Hobbies>):RecyclerView.Adapter<HobbiesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate( R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val hobby:Hobbies = list[position]
        holder.setData(hobby)
    }

    override fun getItemCount(): Int {
       return list.size
    }

    inner class MyViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){

        fun setData(hobbies: Hobbies?){
            itemView.tv_hobby.text = hobbies!!.title
        }
    }
}