package Lesson2

import kotlin.math.roundToInt

fun task5() {
    var summary = 70000.0
    val procent = 0.167
    for (i in 1..20) {
        summary += (summary * procent)
    }
    val formatedSummary = String.format("%.3f", summary)
    println(formatedSummary)
}