package Lesson_5_Ex_6

fun main() {

    println("Введите ваш вес в килограммах:")
    val weight = readln().toDouble()
    println("Введите ваш рост в сантиметрах:")
    val heightCm = readln().toDouble()

    val heightMeters = heightCm / CENTIMETERS_TO_METERS

    val bmi = weight / (heightMeters * heightMeters)

    val category = when {
        bmi < 18.5 -> "Недостаточная масса тела"
        bmi < 25.0 -> "Нормальная масса тела"
        bmi < 30.0 -> "Избыточная масса тела"
        else -> "Ожирение"
    }

    val formattedBmi = String.format("%.2f", bmi)

    println("Ваш ИМТ: $formattedBmi")
    println("Категория веса: $category")
}

const val CENTIMETERS_TO_METERS = 100.0