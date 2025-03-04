package basics

fun main() {

//    #################### Range ####################
//    - A range is a sequence of numbers or characters.
//    - In Kotlin, ranges are defined using the rangeTo() function or the .. operator.
//    - The rangeTo() function is defined for any comparable type, but it has an operator form .. which is often more convenient.

//    - Ranges are defined for integral types: Byte, Short, Int, Long and their corresponding primitive types.

//    Used to create a range of values from a start value to an end value
//    Syntax:
//    start..end (inclusive range)
//    start until end (end is not included)
//    end downTo start (decreasing order)

    val a = 1..5    // 1, 2, 3, 4, 5
//    val b = 1 until 5    // 1, 2, 3, 4
    val b = 1..<5    // 1, 2, 3, 4
    val c = 5 downTo 1    // 5, 4, 3, 2, 1


    for (i in a) {
        print("$i ")    // 1 2 3 4 5
    }
    println()

    for (i in b) {
        print("$i ")    // 1 2 3 4
    }
    println()

    for (i in c) {
        print("$i ")    // 5 4 3 2 1
    }
    println()

}