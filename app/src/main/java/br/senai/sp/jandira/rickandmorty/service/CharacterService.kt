package br.senai.sp.jandira.rickandmorty.service

import br.senai.sp.jandira.rickandmorty.model.theme.Character
import br.senai.sp.jandira.rickandmorty.model.theme.CharacterList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//interface - contrato
interface CharacterService {
    //https://rickandmortyapi.com/api/

    @GET("character")
    fun getCharacter(): Call<CharacterList> //lista de personagens

    //filtro da lista pelo id
    //Patch caminho da url
    @GET("character/{id}")
    fun getCharacterById(@Path("id") id: Long): Call<br.senai.sp.jandira.rickandmorty.model.theme.Character>


    @GET("character/")
    fun getCharactersByPage(@Query("page") pageNumber: Int): Call<CharacterList>

    //https://rickandmortyapi.com/api/character/?name=rick&status=alive

    @GET("character/")
    fun getCharacterByNameAndStatus(
        @Query("name") name: String,
        @Query("status") status: String
    ): Call<CharacterList>

}