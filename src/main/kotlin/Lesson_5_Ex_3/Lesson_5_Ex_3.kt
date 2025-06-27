package Lesson_5_Ex_3

fun main() {

    val winningNumber1 = (0..42).random()
    val winningNumber2 = (0..42).random()

    println("Введите первое число (от 0 до 42):")
    val userNumber1 = readln().toInt()
    println("Введите второе число (от 0 до 42):")
    val userNumber2 = readln().toInt()

    val isFirstNumberCorrect = userNumber1 == winningNumber1 || userNumber1 == winningNumber2
    val isSecondNumberCorrect = userNumber2 == winningNumber1 || userNumber2 == winningNumber2
    val isMainPrize = isFirstNumberCorrect && isSecondNumberCorrect && userNumber1 != userNumber2
    val isConsolationPrize = (isFirstNumberCorrect || isSecondNumberCorrect) && !isMainPrize

    println(when {
        isMainPrize -> "Поздравляем! Вы выиграли главный приз!"
        isConsolationPrize -> "Вы выиграли утешительный приз!"
        else -> "Неудача!"
    })

    println("Правильные числа: $winningNumber1 и $winningNumber2")

}
