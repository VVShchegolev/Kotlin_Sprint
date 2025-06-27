package Lesson_5_Ex_2

fun main() {

    println("Введите ваш год рождения:")
    val birthYear = readln().toInt()

    val userAge = CURRENT_YEAR - birthYear

    val resultText = if (userAge >= AGE_OF_MAJORITY) {
        "Показать экран со скрытым контентом"
    } else {
        "Вернуться на главный экран"
    }

    println(resultText)
}

const val AGE_OF_MAJORITY: Int = 18
const val CURRENT_YEAR = 2025