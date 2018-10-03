package tasks.task3

/*
 * Find the specified number of the oldest people in a group.
 * Return their names sorted in an alphabetical order.
 */

data class Person(val name: String, val age: Int)

fun findOldest(people: List<Person>, requiredNumber: Int): List<String> {
    return people.sortedByDescending { it.age }
            .take(requiredNumber).map { it.name }.sorted()
}

fun main(args: Array<String>) {
    val people = listOf(
            Person("Bob", 30),
            Person("Charlie", 20),
            Person("Alice", 25))
    println(findOldest(people, 1)) // [Bob]
    println(findOldest(people, 2)) // [Alice, Bob]
}