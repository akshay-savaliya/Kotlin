package functions

/*

    - A function is a group of interrelated statements that perform a specific task.
    - Functions help break our program into smaller and modular chunks.
    - Functions make our code more organized and manageable.
    - Functions help in code reusability.


    - Functions in Kotlin are declared using the fun keyword.
    - Functions have a name, a list of parameters, an optional return type, and a body.
    - The return type of function is specified after the parameter list.
    - If a function does not return any value, its return type is Unit. It is optional to specify the return type.
    - If a function returns a value, the return type must be specified.
    - The return type of function can be inferred by the compiler if there is a single expression in the body of the function.
    - The return keyword can be used to return from a function early.


    arguments vs parameters
    - Parameters are the variables defined in the function signature.
    - Arguments are the values passed to the function when it is called.
    Example:
    fun greetUser(name: String) {    // name is a parameter
        println("Hello, $name!")
    }
    greetUser("Akshay")    // "Akshay" is an argument


    Syntax:
    fun functionName(parameter1: Type, parameter2: Type, ...): ReturnType {
        // body of function
        return value
    }

 */

fun main(){

//    #################### Unit Return Type ####################
//    - If a function does not return any value, its return type is Unit. It is optional to specify the return type.

    fun displayMessage(message: String): Unit {
        println(message)
    }
    displayMessage("Hello, World!")    // Hello, World!

    fun displayMessage1(message: String) {
        println(message)
    }
    displayMessage1("Hello, World!")    // Hello, World!


//    #################### Function with Parameters ####################
//    - Parameters are the variables defined in the function signature.

    fun greetUser(name: String) {
        println("Hello, $name!")
    }
    greetUser("Akshay")    // Hello, Akshay!


//    #################### Function with Return Type ####################
//    - If a function returns a value, the return type must be specified.

    fun add(a: Int, b: Int): Int {
        return a + b
    }
    println(add(5, 3))    // 8

    fun isEven(num: Int): Boolean {
        return num % 2 == 0
    }
    println(isEven(5))    // false
    println(isEven(6))    // true


//    #################### return keyword ####################
//    - The return keyword can be used to return from a function early.

    fun isOdd(num: Int): Boolean {
        if (num % 2 == 0) {
            return false
        }
        return true
    }
    println(isOdd(5))    // true

    fun max(a: Int, b: Int): Int {
        if (a > b) {
            return a
        } else {
            return b
        }
    }
    println(max(5, 3))    // 5


//    #################### Default Arguments ####################
//    - Default values for function parameters
//    - If a parameter is not passed to the function, the default value is used.

    fun sayHello(name: String = "World") {
        println("Hello, $name!")
    }
    sayHello()    // Hello, World!
    sayHello("Akshay")    // Hello, Akshay!


//    #################### named arguments ####################
//    - The arguments can be passed to the function in any order by naming the parameters explicitly in the function call.

    fun greetUser(name: String, message: String = "Hello") {
        println("$message, $name!")
    }
    greetUser("Akshay")    // Hello, Akshay!
    greetUser(message = "Hi", name = "Akshay")    // Hi, Akshay!


//    #################### Single-Expression Functions ####################
//    - If a function has only a single expression, the curly braces can be omitted, and the body is specified after a = symbol.

    fun add1(a: Int, b: Int) = a + b
    println(add(5, 3))    // 8

    fun isEven1(num: Int) = num % 2 == 0
    println(isEven(5))    // false
    println(isEven(6))    // true

    fun max1(a: Int, b: Int) = if (a > b) a else b
    println(max(5, 3))    // 5


//    #################### Function stored in a variable ####################
//    - A function can be assigned to a variable.

    val add2 = fun(a: Int, b: Int): Int {
        return a + b
    }
    println(add2(5, 3))    // 8

//    Function Reference
//    - A function can be assigned to a variable using the function reference operator :: followed by the function name.

    val isEven2 = ::isEven
    println(isEven2(5))    // false
    println(isEven2(6))    // true

    val max2: (Int, Int) -> Int = ::max
    println(max2(5, 3))    // 5

}