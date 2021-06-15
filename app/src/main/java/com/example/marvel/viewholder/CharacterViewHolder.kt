package com.example.marvel.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.R
import com.example.marvel.listener.CharacterListener
import com.example.marvel.model.CharacterModel

class CharacterViewHolder(itemView: View, private val listener: CharacterListener): RecyclerView.ViewHolder(itemView) {
    private var mTextName: TextView = itemView.findViewById(R.id.nameTextView)
    private var mTextDescription: TextView = itemView.findViewById(R.id.descriptionTextView)
    private var mImageCharacter: ImageView = itemView.findViewById(R.id.characterImageView)

    fun bindData(character: CharacterModel) {

        this.mTextName.text = character.name
        if (character.description == "") {
            this.mTextDescription.text = itemView.context.getString(R.string.msg_no_description)
        } else {
            this.mTextDescription.text = character.description
        }
//        Glide.with(itemView)
//            .load(character.thumbnail.path + "." + character.thumbnail.extension)
//            .centerCrop()
//            .placeholder(R.mipmap.ic_launcher)
//            .error(R.mipmap.ic_launcher)
//            .fallback(R.mipmap.ic_launcher)
//            .into(this.mImageCharacter)
//
//        itemView.setOnClickListener { listener.onListClick(character) }
    }
}