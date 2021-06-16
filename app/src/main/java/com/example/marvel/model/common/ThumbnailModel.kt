package com.example.marvel.model.common

import com.google.gson.annotations.SerializedName

// referencia dos nomes em verde é oq vem da api e logo em seguida a é o nome do objeto

data class ThumbnailModel(
    @SerializedName("path")
    val path: String,
    @SerializedName("extension")
    val extension: String
)