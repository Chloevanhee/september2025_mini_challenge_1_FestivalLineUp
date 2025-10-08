package com.example.thefestivalminichallenge1.domain

data class Stage(
    val name: String,
    val concerts: List<Concert>
)

data class Concert(
    val artistName: String,
    val startTime: String
)

