package questions._5TypeSystem

fun explicitType() {
    val value: String = JavaClass().value // IllegalStateException: JavaClass().value must not be null
    println(value.length)
}

fun main(args: Array<String>) {
    explicitType()
}