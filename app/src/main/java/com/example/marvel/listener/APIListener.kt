package com.example.marvel.listener

interface APIListener<T> {

    fun onSuccess(model: T)

    fun onFailure(str: String)

}