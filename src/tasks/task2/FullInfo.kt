package tasks.task2

/* Task 2.
 * Complete the extension function `getFullInfo()` returning a string value.
 * It should list the properties of the class as in the example below and
 * add `"Unspecified"` if the corresponding value is `null`:

```
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
```
 */

data class Client(
        val name: String,
        val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
        val email: String? = null,
        val address: Address? = null)

data class Address(
        val country: String? = null,
        val city: String? = null,
        val street: String? = null)

fun String?.orUnspecified() = this ?: "Unspecified"

fun Client.getFullInfo(): String = """
       |name: $name
       |email: ${personalInfo?.email.orUnspecified()}
       |country: ${personalInfo?.address?.country.orUnspecified()}
       |city: ${personalInfo?.address?.city.orUnspecified()}
       |street: ${personalInfo?.address?.street.orUnspecified()}
    """.trimMargin()

fun main(args: Array<String>) {
    val alice = Client("Alice",
            PersonalInfo(
                    email = "alice@gmail.com",
                    address = Address("Germany", "Munich")))
    println(alice.getFullInfo())
    println("---")
    println(Client("Bob").getFullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/