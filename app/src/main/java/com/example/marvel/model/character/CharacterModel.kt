package com.example.marvel.model.character

import com.example.marvel.model.common.ThumbnailModel
import com.google.gson.annotations.SerializedName

// referencia dos nomes em verde é oq vem da api e logo em seguida a é o nome do objeto

class CharacterModel (
@SerializedName("id")
    val id: Int,
@SerializedName("name")
    val name: String,
@SerializedName("description")
    val description: String,
@SerializedName("thumbnail")
    val thumbnail: ThumbnailModel
    )