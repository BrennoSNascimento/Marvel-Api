package com.example.marvel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R
import com.example.marvel.listener.CharacterListener
import com.example.marvel.model.character.CharacterModel
import com.example.marvel.viewholder.CharacterViewHolder

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {
    private var mList: MutableList<CharacterModel> = arrayListOf()
    private lateinit var mListener: CharacterListener

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
       val item = LayoutInflater.from(parent.context).inflate(R.layout.row_character_list_item,parent,false)
        return CharacterViewHolder(item,mListener)
    }

    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bindData(mList[position])
    }

    override fun getItemCount(): Int {
        return mList.count()
    }
}