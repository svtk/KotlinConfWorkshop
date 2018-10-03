package tasks.task1

/*
 * Create a function that checks whether the given string is a valid  identifier.
 * A valid identifier is a non-empty string that starts with a letter
 * or underscore and consists of only letters, digits and underscores.
 */
fun String.isValidIdentifier(): Boolean {
    fun isValidCharacter(ch: Char): Boolean = ch == '_' ||
            ch in 'a'..'z' || ch in 'A'..'Z' ||
            ch in '0'..'9'

    if (isEmpty() || this[0] in '0'..'9') return false
    for (ch in this) {
        if (!isValidCharacter(ch)) return false
    }
    return true
}

fun main(args: Array<String>) {
    println("name".isValidIdentifier())
    println("0name".isValidIdentifier())
}
