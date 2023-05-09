package br.senai.sp.jandira.rickandmorty.model.theme



//essa classe representa o objeto da API
data class CharacterList(
    val info: Info,
    val results: List<br.senai.sp.jandira.rickandmorty.model.theme.Character>
)
