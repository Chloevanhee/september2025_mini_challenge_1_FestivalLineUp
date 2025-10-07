package com.example.thefestivalminichallenge1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thefestivalminichallenge1.presenter.uiModel.FestivalLineupViewModelRoot
import com.example.thefestivalminichallenge1.ui.theme.TheFestivalMiniChallenge1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TheFestivalMiniChallenge1Theme {
                //val windowClass = currentWindowAdaptiveInfo().windowSizeClass
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    FestivalLineupViewModelRoot(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun GreetingPreview() {
    TheFestivalMiniChallenge1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

            FestivalLineupViewModelRoot(modifier = Modifier.padding(innerPadding))
        }
    }
}