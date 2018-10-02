package examples._2ControlStructures

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
// c in 'a'..'z'
// is compiled to:
// 'a' <= c && c <= 'z'

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    "abc" <= "cba"
    "abc".compareTo("cba")

    println(isLetter('q'))     // true
    println(isNotDigit('x'))   // true
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "I don't know…​"
}

fun rangeOfStrings() {
    val fromAToK = "a".."k"
    println("ball" in fromAToK) // true
    println("zoo" in fromAToK)  // false
}