package Lesson_5_Ex_3

fun main() {

    println("Введите первое число (от 0 до 42):")
    val userNumber1 = readln().toInt()
    println("Введите второе число (от 0 до 42):")
    val userNumber2 = readln().toInt()

    val isFirstNumberCorrect = userNumber1 == WINNING_NUMBER1 || userNumber1 == WINNING_NUMBER2
    val isSecondNumberCorrect = userNumber2 == WINNING_NUMBER1 || userNumber2 == WINNING_NUMBER2
    val isMainPrize = isFirstNumberCorrect && isSecondNumberCorrect && userNumber1 != userNumber2
    val isConsolationPrize = (isFirstNumberCorrect || isSecondNumberCorrect) && !isMainPrize

    println(when {
        isMainPrize -> "Поздравляем! Вы выиграли главный приз!"
        isConsolationPrize -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    })

    println("Правильные числа: $WINNING_NUMBER1 и $WINNING_NUMBER2")

}

const val WINNING_NUMBER1 = 15
const val WINNING_NUMBER2 = 30