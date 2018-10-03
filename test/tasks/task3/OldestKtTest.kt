package tasks.task3

import org.junit.Assert
import org.junit.FixMethodOrder
import org.junit.Test
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
class OldestKtTest {
    private fun checkOldest(number: Int, list: List<Person>, expected: List<String>) {
        Assert.assertEquals("Wrong result for requiredNumber = $number in $list:",
                expected,
                findOldest(list, number)
        )
    }

    @Test
    fun test1Sample() {
        val people = listOf(
                Person("Bob", 30),
                Person("Charlie", 20),
                Person("Alice", 25))
        checkOldest(1, people, listOf("Bob"))
        checkOldest(2, people, listOf("Alice", "Bob"))
    }

    @Test
    fun test2() = checkOldest(number = 3,
            list = listOf(Person("Y", 15), Person("B", 40), Person("C", 10), Person("Z", 30), Person("X", 20), Person("A", 25)),
            expected = listOf("A", "B", "Z")
    )

    @Test
    fun test3() = checkOldest(number = 2,
            list = listOf(Person("B", 20), Person("Y", 10), Person("X", 30), Person("Z", 40), Person("C", 15), Person("A", 25)),
            expected = listOf("X", "Z")
    )

    @Test
    fun test4() = checkOldest(number = 1,
            list = listOf(Person("B", 25), Person("Y", 15), Person("Z", 20), Person("C", 10), Person("X", 40), Person("A", 30)),
            expected = listOf("X")
    )

    @Test
    fun test5() = checkOldest(number = 4,
            list = listOf(Person("Y", 15), Person("B", 40), Person("C", 10), Person("Z", 30), Person("X", 20), Person("A", 25)),
            expected = listOf("A", "B", "X", "Z")
    )
}