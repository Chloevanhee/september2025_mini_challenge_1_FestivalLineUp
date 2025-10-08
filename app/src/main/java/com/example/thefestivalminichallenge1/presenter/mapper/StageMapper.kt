package com.example.thefestivalminichallenge1.presenter.mapper

import com.example.thefestivalminichallenge1.domain.Stage
import com.example.thefestivalminichallenge1.presenter.uiModel.UiConcert
import com.example.thefestivalminichallenge1.presenter.uiModel.UiStage


class StageMapper {
    fun toUiModel(stage: Stage): UiStage {
        return UiStage(
            name = stage.name,
            concerts = stage.concerts.map { concert ->
                UiConcert(
                    bandName = concert.artistName,
                    time = concert.startTime
                )
            }
        )
    }
}