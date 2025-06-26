package Lesson_4_Ex_3

fun main() {

    val isSunny: Boolean = true
    val isTentOpen: Boolean = true
    val humidity: Int = 20
    val season: String = "зима"

    val areConditionsFavorable = isSunny && isTentOpen && humidity == REQUIRED_HUMIDITY && season != WINTER_SEASON

    println("Благоприятные ли условия сейчас для роста бобовых? $areConditionsFavorable")

}

const val REQUIRED_HUMIDITY = 20
const val WINTER_SEASON = "зима"
