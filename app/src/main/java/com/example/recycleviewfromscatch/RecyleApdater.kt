package com.example.recycleviewfromscatch

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.each_user_layout.view.*
import kotlin.coroutines.coroutineContext

class RecyleApdater(private val examplelist: List<UserData>,val context: Context): RecyclerView.Adapter<RecyleApdater.UserViewHolder>(){


    class UserViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.iv_user_image
        val textView1 : TextView = itemView.tv_user_name
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val userItemView = LayoutInflater.from(parent.context).inflate(R.layout.each_user_layout,
            parent,false)
        return UserViewHolder(userItemView)
    }

    override fun getItemCount(): Int {
        return examplelist.size
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        val currentItem = examplelist[position]
        holder.textView1.text = currentItem.userName
        Glide.with(context)
            .load(currentItem.userImage)
            .centerCrop()
            .placeholder(R.drawable.loadingicon)
            .into(holder.imageView)
        if(position == 0){
            holder.textView1.setBackgroundColor(Color.YELLOW)
        }
    }
}


