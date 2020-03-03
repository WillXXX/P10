package com.example.p10

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<GetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.screen, parent,false)
        return GetViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: GetViewHolder, position: Int) {
    }


}

class GetViewHolder(val view: View) : RecyclerView.ViewHolder(view){

}