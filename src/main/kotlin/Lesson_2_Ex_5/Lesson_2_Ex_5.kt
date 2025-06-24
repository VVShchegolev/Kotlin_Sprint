package Lesson_2_Ex_5

// Решение с исмользованием Math.pow
fun main() {

    // Исходные данные
    val initialAmount = 70_000.0 // Начальная сумма в рублях
    val interestRate = 16.7 // Процентная ставка (16.7%)
    val years = 20 // Срок вклада в годах

    // Расчет по формуле сложных процентов
    val finalAmount = initialAmount * Math.pow(1 + interestRate / PERCENT_TO_FRACTION, years.toDouble())

    val formattedAmount = String.format("%.3f", finalAmount)

    println("Размер вклада через $years лет: $formattedAmount рублей")

}

const val PERCENT_TO_FRACTION = 100.0 // Для преобразования процентов в доли

//  Старое решение
//fun main() {
//    val initialAmount = 70_000.0 // Начальная сумма в рублях
//    val interestRate = 0.167 // Процентная ставка (16.7%)
//    val years = 20 // Срок вклада в годах
//
//    // Расчет вклада по формуле (1 + r)^n через цикл
//    var factor = 1.0
//    for (i in 1..years) {
//        factor *= (1 + interestRate)
//    }
//
//    val finalAmount = initialAmount * factor
//
//    val formattedAmount = String.format("%.3f", finalAmount)
//
//    println("Размер вклада через $years лет: $formattedAmount рублей")
//}