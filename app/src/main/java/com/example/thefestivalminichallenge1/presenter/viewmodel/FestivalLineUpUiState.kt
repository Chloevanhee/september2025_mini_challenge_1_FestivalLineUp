package com.example.thefestivalminichallenge1.presenter.viewmodel

data class FestivalLineUpUiState(val stages: List<UiStage> = emptyList())

sealed interface FestivalLineUpUiEvent {
    data class OnClickStage(val index: Int) : FestivalLineUpUiEvent
}
