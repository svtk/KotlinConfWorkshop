package examples._4Classes

// similar to javaCode.Person

data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    // no new keyword, constructor is called as a regular function
    val person = Person("Alice", 26)

    println(person.name)
}