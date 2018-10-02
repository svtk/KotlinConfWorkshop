package examples._2ControlStructures

import examples._2ControlStructures.Color.*

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color) =
    when (color) {
        BLUE -> "cold"
        ORANGE -> "mild"
        RED -> "hot"
    }

fun whenSyntax(a: Any) = when (a) {
    0 -> "is zero"
    is Int -> "is integer"
    is String -> "is string of length ${a.length}"
    else -> "other"
}

fun updateWeather(
        celsiusDegrees: Double
) {
    val description: String
    val color: Color
    when {
        celsiusDegrees < 0 -> {
            description = "cold"
            color = BLUE
        }
        celsiusDegrees in 0..15 -> {
            description = "mild"
            color = ORANGE
        }
        else -> {
            description = "hot"
            color = RED
        }
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, color) =
            when {
                celsiusDegrees < 0 -> Pair("cold", BLUE)
                celsiusDegrees in 0..15 -> "mild" to ORANGE
                else -> "hot" to RED
            }
}