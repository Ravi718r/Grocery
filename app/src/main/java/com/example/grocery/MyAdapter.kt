package com.example.grocery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val itemlist : ArrayList<ItemModel>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {


    inner class MyViewHolder(itemView: View)
        :RecyclerView.ViewHolder(itemView){

            var itemImg:ImageView
            var itemTittle: TextView
            var itemDesc:TextView

            init {
                itemImg = itemView.findViewById(R.id.imageView)
                itemDesc= itemView.findViewById(R.id.description_text)
                itemTittle= itemView.findViewById(R.id.tittle_text)

                itemView.setOnClickListener (){
                    Toast.makeText(
                        itemView.context,
                        "You choose : ${itemlist[adapterPosition].name}",
                        Toast.LENGTH_SHORT

                    ).show()
                }

            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val v= LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout,parent,false)

        return  MyViewHolder(v)
    }

    override fun getItemCount(): Int {

        return itemlist.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemTittle.setText((itemlist[position].name))
        holder.itemDesc.setText(itemlist[position].desc)
        holder.itemImg.setImageResource(itemlist[position].img)
    }
}