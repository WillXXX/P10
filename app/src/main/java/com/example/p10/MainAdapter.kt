package com.example.p10

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.screen.view.*

class MainAdapter(val paginaWeb: PaginaWeb) : RecyclerView.Adapter<GetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GetViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val cellForRow = layoutInflater.inflate(R.layout.screen, parent,false)
        return GetViewHolder(cellForRow)
    }

    override fun getItemCount(): Int {
        return paginaWeb.items.count()
    }

//fazendo ligações entre screen e MainAdapter
    override fun onBindViewHolder(holder: GetViewHolder, position: Int) {
        val items = paginaWeb.items.get(position)
        holder.view.name_Repositorio.text = items.full_name
        holder.view.autor_Name.text = items.name
        holder.view.n_Views.text = items.forks_count.toString()

//        val itemsImageView= holder.view.imageView
//        Picasso.get().load(items.avatar_url).into(itemsImageView)
    }


}

class GetViewHolder(val view: View) : RecyclerView.ViewHolder(view){
    init{
        view.setOnClickListener {
            val intent = Intent(view.context, MainActivity::class.java)
            view.context.startActivity(intent)
        }
    }
}