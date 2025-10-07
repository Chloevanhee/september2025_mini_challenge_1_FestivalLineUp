package com.example.thefestivalminichallenge1.presenter.uiModel

data class UiConcert(val bandName: String, val time: String)

data class UiStage(
    val name: String,
    val concerts: List<UiConcert>,
    var isExpanded: Boolean = false
)

data class FestivalLineUpUiState(
    val stages: List<UiStage> = emptyList()
)

sealed interface FestivalLineUpUiEvent {
    data class OnClickStage(val index: Int) : FestivalLineUpUiEvent
}
