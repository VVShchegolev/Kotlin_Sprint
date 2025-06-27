package Lesson_5_Ex_7

fun main() {

    println("Введите расстояние поездки (в километрах):")
    val distance = readln().toDouble()
    println("Введите расход топлива на 100 км (в литрах):")
    val fuelConsumption = readln().toDouble()
    println("Введите цену за литр топлива:")
    val pricePerLiter = readln().toDouble()

    val fuelNeeded = (distance * fuelConsumption) / FUEL_CONSUMPTION_DENOMINATOR
    val totalCost = fuelNeeded * pricePerLiter
    val formattedCost = String.format("%.2f", totalCost)

    println("Необходимое количество топлива: $fuelNeeded литров")
    println("Итоговая стоимость поездки: $formattedCost рублей")

}

const val FUEL_CONSUMPTION_DENOMINATOR = 100.0