package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KamenRiderAdapter (private val context: Context, private val kr: List<KamenRiderClass>, val listener: (KamenRiderClass) -> Unit)
    : RecyclerView.Adapter<KamenRiderAdapter.KamenRiderViewHolder>(){
    class KamenRiderViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val krimg = view.findViewById<ImageView>(R.id.image)
        val krname = view.findViewById<TextView>(R.id.tv_name)
        val krdate = view.findViewById<TextView>(R.id.tv_date)
        val krauthor = view.findViewById<TextView>(R.id.tv_author)
        val krrate = view.findViewById<TextView>(R.id.tv_rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(kr: KamenRiderClass, listener: (KamenRiderClass) -> Unit){
            krimg.setImageResource(kr.krimg)
            krname.text = kr.krname
            krdate.text = kr.krdate
            krauthor.text = kr.krauthor
            krrate.text = kr.krrate
            ratingbar.rating = kr.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(kr))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): KamenRiderViewHolder {
        return KamenRiderViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: KamenRiderViewHolder, position: Int) {
        holder.bindView(kr[position], listener)
    }

    override fun getItemCount(): Int = kr.size

}