package basics

fun main() {

//    #################### If-Else Statement ####################
//    If the condition is true, then the code inside the if block will be executed, otherwise the code inside the else block will be executed.

    val a = 10
    val b = 20
    if (a > b) {
        println("a is greater than b")
    } else {
        println("b is greater than a")
    }
    // Output: b is greater than a


//    #################### Nested If-Else Statement ####################
//    If-Else statement can be nested inside another If-Else statement.

    val c = 30
    val d = 40
    if (c > d) {
        println("c is greater than d")
    } else {
        if (c < d) {
            println("c is less than d")
        } else {
            println("c is equal to d")
        }
    }
    // Output: c is less than d


//    #################### If-Else-If Ladder ####################
//    If-Else-If ladder is used when we have multiple conditions to check.

    val e = 50
    val f = 60
    if (e > f) {
        println("e is greater than f")
    } else if (e < f) {
        println("e is less than f")
    } else {
        println("e is equal to f")
    }
    // Output: e is less than f


//    #################### If-Else as Expression (Only in Kotlin) ####################
//    If-Else statement can also be used as an expression.

    val result = if (e > f) {
        "e is greater than f"
    } else {
        "e is less than or equal to f"
    }
    println(result)
    // Output: e is less than or equal to f

    val number = 20
    val result2 = if (number % 2 == 0) "Even" else "Odd"
    println(result2)    // Output: Even

}