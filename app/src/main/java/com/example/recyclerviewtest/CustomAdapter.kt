package com.example.recyclerviewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter (private val mList : List<ItemsViewModel>) :RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val itemsViewModel = mList[position]
        // sets the text to the textview from our itemHolder class
        holder.textView.text = itemsViewModel.name

    }

    override fun getItemCount(): Int {
        return mList.size

    }

    class ViewHolder(ItemView : View) :RecyclerView.ViewHolder(ItemView) {
        val textView :TextView = ItemView.findViewById(R.id.txtName)
    }
}