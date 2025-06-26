package Lesson_4_Ex_4

fun main() {

    val trainingDay = 5

    val isEven = trainingDay % MODULUS_FOR_EVEN_CHECK == REMAINDER_FOR_EVEN

    println(
        "Упражнения для рук:   ${!isEven}\n" +
                "Упражнения для ног:   ${isEven}\n" +
                "Упражнения для спины: ${isEven}\n" +
                "Упражнения для пресса: ${!isEven}"
    )
}

const val MODULUS_FOR_EVEN_CHECK = 2
const val REMAINDER_FOR_EVEN = 0
