package com.example.marvel.model.character

import com.google.gson.annotations.SerializedName

// referencia dos nomes em verde é oq vem da api e logo em seguida a é o nome do objeto

data class DataCharacterModel(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("limit")
    val limit: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("count")
    val count: Int,
    @SerializedName("results")
    val results: List<CharacterModel>
)
