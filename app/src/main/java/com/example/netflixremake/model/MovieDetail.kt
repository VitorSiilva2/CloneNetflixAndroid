package com.example.netflixremake.model

data class movieDetail(
    val movie : Movie,
    val similars : List<Movie>
)
