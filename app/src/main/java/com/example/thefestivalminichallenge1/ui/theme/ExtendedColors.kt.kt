package com.example.thefestivalminichallenge1.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

data class CustomColors (
    val cardBackground1: Color,
    val cardBackground2: Color,
    val cardBackground3: Color
)
val lightCustomColors = CustomColors(
    cardBackground1 = Lime40,
    cardBackground2 = Orange40,
    cardBackground3 = PinkApp40
)

val customColors: CustomColors
    @Composable
    @ReadOnlyComposable
    get() = lightCustomColors