package com.example.thefestivalminichallenge1.presenter.uiModel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thefestivalminichallenge1.R
import com.example.thefestivalminichallenge1.ui.theme.TheFestivalMiniChallenge1Theme
import com.example.thefestivalminichallenge1.ui.theme.customColors


@Composable
fun ExpandableStageCard(
    modifier: Modifier = Modifier,
    stage: UiStage,
    colorIndex: Int,
    onAction: (FestivalLineUpUiEvent) -> Unit
) {
    val cardModifier = if (!stage.isExpanded) {
        modifier.height(120.dp)
    } else {
        modifier
    }
    val cardColors = listOf(
        customColors.cardBackground1,
        customColors.cardBackground2,
        customColors.cardBackground3
    )
    Box(
        contentAlignment = Alignment.Center,
        modifier = cardModifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(color = cardColors[colorIndex % cardColors.size])
            .padding(horizontal = 4.dp),
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 4.dp, vertical = 16.dp)
                    .background(cardColors[colorIndex % cardColors.size]),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = stage.name,
                    style = MaterialTheme.typography.titleLarge,
                    color = Color(0xFF421E17),
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight(600)
                )
                IconButton(onClick = {
                    onAction(FestivalLineUpUiEvent.OnClickStage(colorIndex))
                })
                {
                    Icon(
                        if (!stage.isExpanded) {
                            painterResource(R.drawable.outline_add_24)
                        } else {
                            painterResource(R.drawable.check_indeterminate_small_24px)
                        },
                        contentDescription = "extend",
                        modifier = Modifier.size(40.dp),
                        tint = Color(0xFF421E17)
                    )
                }
            }

            if (stage.isExpanded) {
                stage.concerts.forEachIndexed { index, concert ->
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 28.dp, horizontal = 2.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = concert.bandName,
                            style = MaterialTheme.typography.titleSmall,
                            color = Color(0xFF421E17),
                            textAlign = TextAlign.Start,
                        )
                        Text(
                            text = concert.time,
                            style = MaterialTheme.typography.titleMedium,
                            color = Color(0xFF421E17),
                            textAlign = TextAlign.End,
                        )
                    }
                    if (index < stage.concerts.size - 1) {
                        HorizontalDivider(
                            modifier = Modifier.padding(vertical = 2.dp),
                            thickness = DividerDefaults.Thickness,
                            color = Color(0xFF421E17)
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun FestivalLineUpScreen(
    modifier: Modifier, state: FestivalLineUpUiState, onAction: (FestivalLineUpUiEvent) -> Unit
) {
    //   val topPaddingInDp = with(LocalDensity.current) { 80.toDp() }
    LazyColumn(
        modifier = modifier.padding(4.dp),
        contentPadding = PaddingValues(top = 80.dp /*topPaddingInDp*//*, start = 4.dp*/),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        item {
            Column(
                //modifier = Modifier
                modifier = Modifier
                    .fillMaxWidth()
                    // .padding(vertical = 16.dp/*, horizontal = 16.dp*/)
                    .padding(start = 16.dp, bottom = 12.dp)
                    .height(IntrinsicSize.Min)
            ) {
                Text(
                    text = "Festival Lineup",
                    //  modifier = Modifier.weight(0.6f),
                    style = MaterialTheme.typography.headlineLarge,
                    color = Color(0xFF421E17)//MaterialTheme.colorScheme.primary
                )
                Text(
                    text = "Tap a stage to view performers",
                    // modifier = Modifier.weight(0.4f),
                    style = MaterialTheme.typography.bodyLarge,
                    color = MaterialTheme.colorScheme.secondary,
                )
            }
        }
        items(state.stages.size) { index ->
            ExpandableStageCard(
                Modifier,
                state.stages[index],
                index, onAction = onAction
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TheFestivalMiniChallenge1Preview() {
    TheFestivalMiniChallenge1Theme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            FestivalLineupViewModelRoot(modifier = Modifier.padding(innerPadding))
        }
    }
}