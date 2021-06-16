package com.example.marvel.model.character

import com.google.gson.annotations.SerializedName

// referencia dos nomes em verde é oq vem da api e logo em seguida a é o nome do objeto

data class ResponseCharacterModel(
    @SerializedName("code")
    val code: Int,
    @SerializedName("etag")
    val etag: String,
    @SerializedName("data")
    val data: DataCharacterModel
)
