package basics

fun main() {

//    #################### Loops ####################
//    - Loops are used to execute a block of code repeatedly.
//    - In Kotlin, we have three types of loops: for, while, and do..while.


//    #################### For Loop ####################
//    - The for loop is used to iterate over a range, an array, a map, or anything that provides an iterator.
//    - The for loop has the following syntax:
//    for (item in collection) {
//        // body of loop
//    }

    val a = 1..5    // 1, 2, 3, 4, 5
    for (i in a) {
        print("$i ")    // 1 2 3 4 5
    }
    println()

    val b = 1 until 5    // 1, 2, 3, 4
    for (i in b) {
        print("$i ")    // 1 2 3 4
    }
    println()

    val c = 5 downTo 1    // 5, 4, 3, 2, 1
    for (i in c) {
        print("$i ")    // 5 4 3 2 1
    }
    println()

    val d = 1..10 step 2    // 1, 3, 5, 7, 9
    for (i in d) {
        print("$i ")    // 1 3 5 7 9
    }
    println()

    for (i in 10 downTo 1 step 2) {
        print("$i ")    // 10 8 6 4 2
    }
    println()

    val e = 'a'..'z'
    for (i in e) {
        print("$i ")    // a b c d e f g h i j k l m n o p q r s t u v w x y z
    }
    println()


//    #################### While Loop ####################
//    - The while loop is used to execute a block of code repeatedly as long as the condition is true.
//    - The while loop has the following syntax:
//    while (condition) {
//        // body of loop
//    }

    var i = 1
    while (i <= 5) {
        print("$i ")    // 1 2 3 4 5
        i++
    }
    println()


//    #################### Do..While Loop ####################
//    - The do..while loop is used to execute a block of code repeatedly as long as the condition is true.
//    - The do..while loop has the following syntax:
//    do {
//        // body of loop
//    } while (condition)

    var j = 1
    do {
        print("$j ")    // 1 2 3 4 5
        j++
    } while (j <= 5)
    println()


//    #################### Loop Control Statements ####################
//    - Loop control statements change the execution from its normal sequence.
//    - When the execution leaves a scope, all variables in that scope are destroyed.
//    - Loop control statements in Kotlin are:
//        - break
//        - continue
//        - return

//    ########## Break Statement ##########
//    - The break statement is used to terminate the loop.
//    - The break statement has the following syntax:
//    break

    for (i in 1..10) {
        if (i == 5) {
            break
        }
        print("$i ")    // 1 2 3 4
    }
    println()

//    ########## Continue Statement ##########
//    - The continue statement is used to skip the current iteration and continue with the next iteration.
//    - The continue statement has the following syntax:
//    continue

    for (i in 1..5) {
        if (i == 3) {
            continue
        }
        print("$i ")    // 1 2 4 5
    }
    println()

//    ########## Return Statement ##########
//    - The return statement is used to return from a function.
//    - When the return statement is executed, the control is transferred back to the caller of the function.
//    - The return statement has the following syntax:
//    return

    for (i in 1..5) {
        if (i == 3) {
            return
        }
        print("$i ")    // 1 2
    }

}