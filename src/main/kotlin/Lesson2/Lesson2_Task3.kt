package Lesson2

fun task3() {
    val hours: Int = 9
    val minutes: Int = 39
    val travelTime: Int = 457

    var arriveHours = hours + travelTime / 60
    var arriveMinutes = travelTime % 60 + minutes
    var arriveMinutes1 = arriveMinutes % 60
    var arriveHours1 = arriveHours + (arriveMinutes / 60)
println("$arriveHours1:$arriveMinutes1")
}