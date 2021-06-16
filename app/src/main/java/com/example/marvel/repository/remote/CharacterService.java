package com.example.marvel.repository.remote;

import com.example.marvel.constants.MarvelConstants;
import com.example.marvel.model.character.ResponseCharacterModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CharacterService {
    @GET("characters")
    fun list(
            @Query(MarvelConstants.PARAMS.LIMIT) limit: Int,
            @Query(MarvelConstants.PARAMS.OFFSET) offset: Int
    ): Call<ResponseCharacterModel>
}
