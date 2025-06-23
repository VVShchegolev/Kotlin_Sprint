package Lesson_2_Ex_4

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val buffPercent = 20

    // Вычисляем бонусные материалы (20% от исходного количества, отбрасываем дробную часть)
    val crystalBonus = (crystalOre * buffPercent / PERCENT_BASE)
    val ironBonus = (ironOre * buffPercent / PERCENT_BASE)

    println("Бонусная кристаллическая руда: $crystalBonus")
    println("Бонусная железная руда: $ironBonus")

}
// Константа для процентных расчетов
const val PERCENT_BASE = 100