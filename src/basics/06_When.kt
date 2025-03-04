package basics

fun main() {

//    #################### When Expression ####################
//    When expression is used to replace the if-else-if ladder.
//    It is more concise and readable.
//    It is similar to switch statement in other programming languages.
//    When expression can be used as an expression or as a statement.
//    It is more powerful than switch statement. It can be used with or without an argument.
//    When expression can also be used with multiple cases, range, and expression.

    val a = 10
    val b = 20
    when {
        a > b -> println("a is greater than b")
        a < b -> println("a is less than b")
        else -> println("a is equal to b")
    }
    // Output: a is less than b


//    #################### When Expression with Argument ####################
    val c = 30
    val d = 40
    when (c) {
        d -> println("c is equal to d")
        else -> println("c is not equal to d")
    }
    // Output: c is not equal to d

    val animal = "Dog"
    val result = when (animal) {
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        "Elephant" -> "Animal is Elephant"
        else -> "Animal is neither Cat nor Dog nor Elephant"
    }
    println(result)    // Output: Animal is Dog


//    #################### When Expression with Multiple Cases ####################
    val e = 50
    when (e) {
        50, 60 -> println("e is either 50 or 60")
        else -> println("e is neither 50 nor 60")
    }
    // Output: e is either 50 or 60


//    #################### When Expression with Range ####################
    val f = 70
    when (f) {
        in 70..80 -> println("f is in the range of 70 to 80")
        else -> println("f is not in the range of 70 to 80")
    }
    // Output: f is in the range of 70 to 80


//    #################### When Expression with Expression ####################
    val g = 90
    when {
        g > 80 -> println("g is greater than 80")
        else -> println("g is less than or equal to 80")
    }
    // Output: g is greater than 80


//    #################### When Expression with Multiple Cases and Expression ####################
    val h = 100
    when (h) {
        in 100..110 -> println("h is in the range of 100 to 110")
        else -> println("h is not in the range of 100 to 110")
    }
    // Output: h is in the range of 100 to 110

}