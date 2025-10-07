package com.example.thefestivalminichallenge1.presenter.uiModel

import FakeFestivalRepository
import FestivalRepository
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

@Composable
fun FestivalLineupViewModelRoot(modifier: Modifier = Modifier) {
    val viewModel: FestivalLineupViewModel = viewModel(
        factory = object : ViewModelProvider.Factory {
            override fun <T : ViewModel> create(modelClass: Class<T>): T {
                val repository = FakeFestivalRepository()
                @Suppress("UNCHECKED_CAST")
                return FestivalLineupViewModel(repository) as T
            }
        }
    )
    val state by viewModel.state.collectAsStateWithLifecycle()
    FestivalLineUpScreen(modifier/*.fillMaxWidth()*/, state = state, viewModel::onAction)
}

class FestivalLineupViewModel(
    festivalRepository: FestivalRepository
) : ViewModel() {
    var stages = festivalRepository.getStages()
    private var _state = MutableStateFlow(FestivalLineUpUiState(stages))
    val state: StateFlow<FestivalLineUpUiState> = _state.asStateFlow()

    fun onAction(action: FestivalLineUpUiEvent) {
        when (action) {
            is FestivalLineUpUiEvent.OnClickStage -> toggleStageExpandedState(action.index)
        }
    }

    private fun toggleStageExpandedState(clickIndex: Int) {
        val currentState = _state.value
        currentState.stages
        val newStages = currentState.stages.mapIndexed { index, stage ->
            if (index == clickIndex) {
                stage.copy(isExpanded = !stage.isExpanded)
            } else {
                stage.copy(isExpanded = false)
            }
        }
        _state.value = _state.value.copy(stages = newStages)
    }

}
