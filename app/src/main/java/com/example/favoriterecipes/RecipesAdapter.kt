package com.example.favoriterecipes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.favoriterecipes.api.model.RecipesItem


class RecipesAdapter(var recipesList:List<RecipesItem?>?):
    RecyclerView.Adapter<RecipesAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView =itemView.findViewById(R.id.title)
        val image: ImageView =itemView.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recipes ,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val recipeItem = recipesList?.get(position)
        holder.title.setText(recipeItem?.title)
        Glide.with(holder.itemView)
            .load(recipeItem?.image)
            .into(holder.image)
        if (onItemClickListener != null)
            holder.itemView.setOnClickListener {
                onItemClickListener?.onItemClick(position, recipeItem)
            }
    }
    var onItemClickListener:OnItemClickListener?=null
    interface OnItemClickListener{
        fun onItemClick(position: Int,newsItem: RecipesItem?)
    }

    fun changeData(recipesList: List<RecipesItem?>?){
        this.recipesList=recipesList
        notifyDataSetChanged()
    }
    override fun getItemCount(): Int {
        return recipesList?.size?:0
    }
}

