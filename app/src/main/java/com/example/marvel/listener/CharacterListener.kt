package com.example.marvel.listener

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.marvel.model.character.CharacterModel
//parametors passados para o construtor que extende de recycler view
abstract class CharacterListener (private val layoutManager: LinearLayoutManager,private val askForMore: () -> Unit, private val offset: Int) : RecyclerView.OnScrollListener(){

    private var finishedPagination : Boolean = false

    abstract fun onListClick(character: CharacterModel)
       //função padrão do recycler view para onScrolled
    override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
        super.onScrolled(recyclerView, dx, dy)
      //contagem dos elementos exibidos ate o momento
        val visibleItemCount = layoutManager.childCount
        val totalItemCount = layoutManager.itemCount
      //pegando o primeiro elemento exibido
        val firstVisiblePosition = layoutManager.findFirstVisibleItemPosition()
        //logica para que enauqnto o paginação não chegar ao fim sempre pedir por um novo elemento
        if(!finishedPagination && visibleItemCount + firstVisiblePosition >= totalItemCount - offset && firstVisiblePosition >= 0 && totalItemCount >= offset){
            askForMore()
        }
    }
}
