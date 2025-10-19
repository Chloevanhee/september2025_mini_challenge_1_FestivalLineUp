import com.example.thefestivalminichallenge1.presenter.uiModel.UiConcert
import com.example.thefestivalminichallenge1.presenter.uiModel.UiStage

interface FestivalRepository {
    fun getStages(): List<UiStage>
}

class FakeFestivalRepository : FestivalRepository {
    override fun getStages(): List<UiStage> {
        return listOf(
            UiStage(
                "Stage A",
                concerts = listOf(
                    UiConcert("Morning Bloom", "11:00"),
                    UiConcert("Synth River", "12:30")
                )
            ), UiStage(
                "Stage B", concerts = listOf<UiConcert>(
                    UiConcert("The Suntones", "13:00"),
                    UiConcert("Blue Voltage", "14:15"),
                    UiConcert("Midnight Echo", "15:30")

                ),true
            ), UiStage(
                "Stage C", concerts = listOf<UiConcert>(
                    UiConcert("Echo Machine ", "16:00"),
                    UiConcert("The 1975", "17:15"),
                )
            )
        )
    }
}