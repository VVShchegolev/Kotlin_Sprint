package Lesson_5_Ex_1


fun main() {

    val number1 = (1..10).random()
    val number2 = (1..10).random()

    println("Чтобы доказать, что вы не бот, решите пример: $number1 + $number2 = ?")
    println("Введите ответ:")

    val userAnswer = readln().toInt()

    println(if (userAnswer == number1 + number2) "Добро пожаловать!" else "Доступ запрещен.")

}
