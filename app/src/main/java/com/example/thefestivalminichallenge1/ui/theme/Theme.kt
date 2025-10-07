package com.example.thefestivalminichallenge1.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = TextPrimaryBlackRed40,
    secondary = TextSecondaryGrey40,
    tertiary = Pink80,
    background = Surface40,
    surface = Surface40,
    onPrimary = Surface40,
    onSurface = OnSurface40,
)

private val LightColorScheme = lightColorScheme(
    primary = TextPrimaryBlackRed40,
    secondary = TextSecondaryGrey40,
    tertiary = Pink40,
    background = Surface40,
    surface = Surface40,
    onPrimary = Surface40,
    onSurface = OnSurface40,


)

@Composable
fun TheFestivalMiniChallenge1Theme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

