package org.example.Lesson_2_Ex_3

fun main() {

    val trainHour = 9
    val trainMinute = 39
    val travelTimeMinutes = 457

    val trainTotalMinutes = trainHour * MINUTES_IN_HOUR + trainMinute
    val arrivalTotalMinutes = trainTotalMinutes + travelTimeMinutes
//    вычисляем час и минуту прибытия
    val arrivalHour = (arrivalTotalMinutes / MINUTES_IN_HOUR) % HOURS_IN_DAY // 24 - часов в сутки
    val arrivalMinute = arrivalTotalMinutes % MINUTES_IN_HOUR

    val formattedArrivalTime = String.format("%02d:%02d", arrivalHour, arrivalMinute)

    println("Время прибытия поезда: $formattedArrivalTime")
}

const val HOURS_IN_DAY = 24
const val MINUTES_IN_HOUR = 60