package Lesson_4_Ex_2

fun main() {

    val weight1 = 20
    val volume1 = 80

    val weight2 = 50
    val volume2 = 100

    val isAverage1 = weight1 > MIN_WEIGHT_KG && weight1 <= MAX_WEIGHT_KG && volume1 < MAX_VOLUME_LITERS 
    val isAverage2 = weight2 > MIN_WEIGHT_KG && weight2 <= MAX_WEIGHT_KG && volume2 < MAX_VOLUME_LITERS

    println("Груз с весом $weight1 кг и объемом $volume1 л соответствует категории 'Average': $isAverage1")
    println("Груз с весом $weight2 кг и объемом $volume2 л соответствует категории 'Average': $isAverage2")

}

const val MIN_WEIGHT_KG = 35
const val MAX_WEIGHT_KG = 100
const val MAX_VOLUME_LITERS = 100
