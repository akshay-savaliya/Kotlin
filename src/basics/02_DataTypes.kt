package basics

fun main() {

//    Data Types - Type of data that can be stored in a variable
//    Kotlin is a statically typed language, which means that the type of each variable is known at compile time
//    Kotlin has a rich set of built-in types
//    Kotlin also supports user-defined types

//    Kotlin has two types of data types:
//    1. Primitive Data Types
//    2. Reference Data Types

//    1. Primitive Data Types
//    - Byte, Short, Int, Long, Float, Double, Char, Boolean
//    - These are predefined by the language and named by a reserved keyword
//    - They are used to store simple values

//    2. Reference Data Types
//    - String, Array, Data Classes, User-defined classes
//    - These are created by the programmer and are not defined by the language

//    Kotlin has a feature called type inference, which allows the compiler to automatically determine the type of variable based on the value assigned to it
//    This means that you don't have to explicitly specify the type of variable when you declare it


//    Type inference
    val name = "Akshay Savaliya"    // String
    val age = 22    // Int
    val height = 5.8    // Double
    val isStudent = true    // Boolean

    println("Name: $name, Age: $age, Height: $height, Is Student: $isStudent")    // Name: Akshay Savaliya, Age: 22, Height: 5.8, Is Student: true


//    Explicitly specifying the type of variable
    val name1: String = "Akshay Savaliya"
    val age1: Int = 22
    val height1: Double = 5.8
    val isStudent1: Boolean = true

    println("Name: $name1, Age: $age1, Height: $height1, Is Student: $isStudent1")    // Name: Akshay Savaliya, Age: 22, Height: 5.8, Is Student: true


//    Type checking
//    if type of value is assigned one time, then you can't assign value of different type to that variable
//    if you try to assign a value of a different type to a variable, you will get a compilation error

//    name = 10    // Error: The integer literal does not conform to the expected type String

}