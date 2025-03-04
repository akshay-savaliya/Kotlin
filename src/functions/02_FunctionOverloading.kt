package functions

// #################### Function Overloading ####################
// - Function overloading is a feature that allows us to have more than one function with the same name in the same class, but with different parameters.
// - Function overloading is a compile-time polymorphism and also known as Static Polymorphism.

// - Function overloading is achieved by defining two or more functions in the same class with the same name but with different parameters.
// - The parameters can be different in terms of the number of parameters or the data type of the parameters.
// - The return type of the functions can be the same or different.

// - The compiler decides which function to call based on the number of parameters and the data type of the parameters.

fun add(a: Int, b: Int): Int {
    return a + b
}

fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

fun add(a: Double, b: Double): Double {
    return a + b
}

fun main() {
    println(add(1, 2))    // 3
    println(add(1, 2, 3))    // 6
    println(add(1.5, 2.5))    // 4.0

//    Named Arguments
    println(add(b = 4, a = 3))    // 7
    println(add(c = 5, a = 3, b = 4))    // 12
    println(add(b = 2.5, a = 1.5))    // 4.0
}