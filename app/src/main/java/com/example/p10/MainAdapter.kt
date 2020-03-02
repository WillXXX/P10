package com.example.p10

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MainAdapter : RecyclerView.Adapter<GetViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetViewHolder {
    }

    override fun getItemCount(): Int {
        return 3
    }

    override fun onBindViewHolder(holder: GetViewHolder, position: Int) {
    }


}

class GetViewHolder(val view: View) : RecyclerView.ViewHolder(view){

}