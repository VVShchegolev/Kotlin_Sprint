package Lesson_4_Ex_4

fun main() {

    val trainingDay = 5

    // Определяем, какие упражнения выполнять (через день: руки/пресс на нечетные дни, ноги/спина на четные)
    val isArmsAndAbsDay = trainingDay % 2 == 1 // Нечетные дни: руки и пресс

    println(
        "Упражнения для рук:   ${if (isArmsAndAbsDay) "true" else "false"}\n" +
                "Упражнения для ног:   ${if (!isArmsAndAbsDay) "true" else "false"}\n" +
                "Упражнения для спины: ${if (!isArmsAndAbsDay) "true" else "false"}\n" +
                "Упражнения для пресса: ${if (isArmsAndAbsDay) "true" else "false"}"
    )
}