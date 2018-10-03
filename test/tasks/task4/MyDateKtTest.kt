package tasks.task4

import org.junit.Assert
import org.junit.Test
import tasks.task4.Month.*

class MyDateKtTest {

    @Test
    fun testBefore() {
        val first = MyDate(2018, MAY, 10)
        val second = MyDate(2018, JUL, 11)
        Assert.assertTrue( "$first should go before $second", compareDates(first, second))
    }

    @Test fun testAfter() {
        val first = MyDate(2018, DEC, 20)
        val second = MyDate(2018, DEC, 11)
        Assert.assertTrue(": $first should go after $second", compareDates(second, first))
    }

    fun doTest(date: MyDate, first: MyDate, last: MyDate, shouldBeInRange: Boolean) {
        val message = "$date should${if (shouldBeInRange) "" else "n't"} be in a range $first..$last)}"
        Assert.assertEquals(message, shouldBeInRange, checkInRange(date, first, last))
    }

    @Test fun testInRange() {
        doTest(MyDate(2018, MAR, 22), MyDate(2018, JAN, 1), MyDate(2019, JAN, 1), shouldBeInRange = true)
    }

    @Test fun testRangeBefore() {
        doTest(MyDate(2017, MAR, 22), MyDate(2018, JAN, 1), MyDate(2019, JAN, 1), shouldBeInRange = false)
    }

    @Test fun testRangeAfter() {
        doTest(MyDate(2019, MAR, 22), MyDate(2018, JAN, 1), MyDate(2019, JAN, 1), shouldBeInRange = false)
    }
}