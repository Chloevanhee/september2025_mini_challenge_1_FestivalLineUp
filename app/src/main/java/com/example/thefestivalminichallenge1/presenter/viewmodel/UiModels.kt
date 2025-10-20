package com.example.thefestivalminichallenge1.presenter.viewmodel

data class UiConcert(val bandName: String, val time: String)

data class UiStage(
    val name: String,
    val concerts: List<UiConcert>,
    var isExpanded: Boolean = false
)
