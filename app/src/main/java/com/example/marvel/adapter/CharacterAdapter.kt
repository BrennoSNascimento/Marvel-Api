package com.example.marvel.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R
import com.example.marvel.listener.CharacterListener
import com.example.marvel.model.character.CharacterModel
import com.example.marvel.viewholder.CharacterViewHolder

class CharacterAdapter : RecyclerView.Adapter<CharacterViewHolder>() {
   //cria a lista do modelo de personagens
    private var mList: MutableList<CharacterModel> = arrayListOf()
    //vai iniciar o mlistener dos personagens
    private lateinit var mListener: CharacterListener
    //passa  o contexto do construtor e retorna o item e o listner para o view holder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterViewHolder {
       val item = LayoutInflater.from(parent.context).inflate(R.layout.row_character_list_item,parent,false)
        return CharacterViewHolder(item,mListener)
    }
    //inicilializa a posição e "personagem" passado
    override fun onBindViewHolder(holder: CharacterViewHolder, position: Int) {
        holder.bindData(mList[position])
    }
    //conta os elemntos da lista de persoangens
    override fun getItemCount(): Int {
        return mList.count()
    }

    fun attachListener(listener: CharacterListener) {
        mListener = listener
    }

    fun updateList(list: MutableList<CharacterModel>) {
        mList.addAll(list)
        notifyDataSetChanged()
    }
}