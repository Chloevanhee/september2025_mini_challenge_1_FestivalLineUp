package com.example.thefestivalminichallenge1.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.thefestivalminichallenge1.R

// Set of Material typography styles to start with
val parkinsans = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.parkinsansregular,
            weight = FontWeight.Normal,
            //loadingStrategy = FontLoadingStrategy.OptionalLocal
        ),
        Font(
            resId = R.font.parkinsansbold,
            weight = FontWeight.Bold
        ),
        Font(
            resId = R.font.parkinsanslight,
            weight = FontWeight.Light
        ),
        Font(
            resId = R.font.parkinsansmedium,
            weight = FontWeight.Medium
        ),
        Font(
            resId = R.font.parkinsanssemibold,
            weight = FontWeight.SemiBold
        ),
    )
)

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 60.sp,//22.sp,
        lineHeight = 54.sp,
        letterSpacing = 0.sp,
    ),
    titleLarge = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 38.sp,//22.sp,
        lineHeight = 38.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp,//22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    titleSmall = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.Medium,
        fontSize = 24.sp,//22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = parkinsans,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )

)