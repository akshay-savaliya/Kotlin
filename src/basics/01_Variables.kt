package basics

fun main() {

//    Variables - Simple box that can hold a value or reference
//    Each variable has a name to access it data

//    Variables are defined using two keywords: val and var
//    val - Immutable reference. Once initialized, it can't be reassigned (one type of constant)
//    var - Mutable reference. It can be reassigned

//    difference between val and const (const is not available in Kotlin)
//    val is a runtime constant, whereas const is a compile-time constant
//    val can be assigned a value at runtime, whereas const can only be assigned a value at compile-time (or directly in the code) and cannot be assigned a value at runtime


    val name = "Akshay Savaliya"
    var age = 22

    println("Name: $name, Age: $age")    // Name: Akshay Savaliya, Age: 22

//    name = "Akshay"    // Error: Val cannot be reassigned
    age = 23
    println("Name: $name, Age: $age")    // Name: Akshay Savaliya, Age: 23

}