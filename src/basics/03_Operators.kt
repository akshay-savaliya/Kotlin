package basics

fun main() {

//    Operators - Special symbols that represent computations like addition, multiplication, etc.
//    Kotlin has a rich set of built-in operators
//    Kotlin also supports user-defined operators


//    #################### 1. Arithmetic Operators ####################
//    - Addition (+), Subtraction (-), Multiplication (*), Division (/), Modulus (%)
//    Used to perform arithmetic operations on numbers

    val a = 10
    val b = 20

    println("a + b = ${a + b}")    // a + b = 30
    println("a - b = ${a - b}")    // a - b = -10
    println("a * b = ${a * b}")    // a * b = 200
    println("a / b = ${a / b}")    // a / b = 0
    println("a % b = ${a % b}")    // a % b = 10


//    #################### 2. Assignment Operators ####################
//    - Assigns a value to a variable
//    Used to assign a value to a variable and perform an operation on the variable at the same time

    var c = 10
    var d = 20

    c += d    // c = c + d
    println("c = $c")    // c = 30

    c -= d    // c = c - d
    println("c = $c")    // c = 10

    c *= d    // c = c * d
    println("c = $c")    // c = 200

    c /= d    // c = c / d
    println("c = $c")    // c = 10

    c %= d    // c = c % d
    println("c = $c")    // c = 10


//    #################### 3. Comparison (Relational) Operators ####################
//    - Compares two values and returns a boolean value
//    Used to compare two values and return a boolean value (true or false)

    val e = 10
    val f = 20

    println("e == f: ${e == f}")    // e == f: false
    println("e != f: ${e != f}")    // e != f: true
    println("e > f: ${e > f}")    // e > f: false
    println("e < f: ${e < f}")    // e < f: true
    println("e >= f: ${e >= f}")    // e >= f: false
    println("e <= f: ${e <= f}")    // e <= f: true


//    #################### 4. Logical Operators ####################
//    - Combines two or more boolean values and returns a boolean value

    val g = true
    val h = false

    println("g && h: ${g && h}")    // g && h: false
    println("g || h: ${g || h}")    // g || h: true
    println("!g: ${!g}")    // !g: false


//    #################### 5. Increment and Decrement Operators ####################
//    - Increases or decreases the value of a variable by 1

    var i = 10
    var j = 20

    i++    // i = i + 1
    println("i = $i")    // i = 11

    j--    // j = j - 1
    println("j = $j")    // j = 19


//    #################### 6. Bitwise Operators ####################
//    - Perform bitwise operations on binary numbers (0s and 1s) at the bit level

    val k = 10
    val l = 20

    println("k and l: ${k and l}")    // k and l: 0  (0000 1010 and 0001 0100 = 0000 0000)
    println("k or l: ${k or l}")    // k or l: 30  (0000 1010 or 0001 0100 = 0001 1110)
    println("k xor l: ${k xor l}")    // k xor l: 30  (0000 1010 xor 0001 0100 = 0001 1110)
    println("k shl 2: ${k shl 2}")    // k shl 2: 40  (0000 1010 shl 2 = 0010 1000)
    println("k shr 2: ${k shr 2}")    // k shr 2: 2  (0000 1010 shr 2 = 0000 0010)
    println("k ushr 2: ${k ushr 2}")    // k ushr 2: 2  (0000 1010 ushr 2 = 0000 0010)


//    #################### 7. Elvis Operator ####################
//    - Returns the left-hand side if it is not null, otherwise returns the right-hand side
//    Used to provide a default value for a nullable variable when it is null
//    Also known as null-coalescing operator

    val m: String? = null
    val n = m ?: "Default Value"
    println("n: $n")    // n: Default Value

    val name1: String? = null
    val name2: String? = "Akshay Savaliya"
    println("Name: ${name1 ?: name2}")    // Name: Akshay Savaliya


//    #################### 8. Safe Call Operator ####################
//    - Calls a method or accesses a property only if the object is not null
//    Used to avoid NullPointerException when accessing properties of a nullable object or calling methods on a nullable object that might be null at runtime (safe navigation)
//    Syntax: object?.property or object?.method()

    val o: String? = null
    println("o length: ${o?.length}")    // o length: null


//    #################### 9. Not Null Assertion Operator ####################
//    - Throws a NullPointerException if the object is null
//    Used to tell the compiler that the object is not null and suppress the warning about nullability
//    Syntax: object!!
//    use with caution (unsafe call) -> use only when you are sure that the object is not null (if the object is null, it will throw a NullPointerException)

    val p: String? = null

//    println("p length: ${p!!.length}")    // Error: KotlinNullPointerException


//    #################### 10. Range Operator ####################
//    - Represents a range of values
//    Used to create a range of values from a start value to an end value
//    Syntax:
//    start..end (inclusive range)
//    start until end (end is not included)
//    end downTo start (decreasing order)

    val q = 1..10    // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    val r = 1 until 10    // 1, 2, 3, 4, 5, 6, 7, 8, 9
    val s = 10 downTo 1    // 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

    for (i in q) {
        print("$i ")    // 1 2 3 4 5 6 7 8 9 10
    }
    println()

    for (i in r) {
        print("$i ")    // 1 2 3 4 5 6 7 8 9
    }
    println()

    for (i in s) {
        print("$i ")    // 10 9 8 7 6 5 4 3 2 1
    }
    println()


//    #################### 11. In Operator ####################
//    - Checks if a value is present in a range or collection

    val t = 5
    val u = 1..10

    println("Is $t present in $u: ${t in u}")    // Is 5 present in 1..10: true


//    #################### 12. Index Access Operator ####################
//    - Accesses an element in a collection by its index

    val v = listOf(1, 2, 3, 4, 5)

    println("Element at index 2: ${v[2]}")    // Element at index 2: 3


//    #################### 13. Invoke Operator ####################
//    - Calls an object as a function
//    Syntax: object(arguments)

    val w = { x: Int, y: Int -> x + y }

    println("w(10, 20): ${w(10, 20)}")    // w(10, 20): 30


//    #################### 14. Unary Operators ####################
//    - Operates on a single operand

    val x = 10
    val y = -x

    println("y: $y")    // y: -10


//    #################### 15. Spread Operator ####################
//    - Passes the elements of an array as individual arguments to a function
//    Used to unpack an array and pass its elements as arguments to a function
//    Syntax: *array (spread operator) or functionName(*array)

    val z = intArrayOf(1, 2, 3, 4, 5)

    fun sum(vararg numbers: Int): Int {
        var result = 0
        for (number in numbers) {
            result += number
        }
        return result
    }

    println("sum(*z): ${sum(*z)}")    // sum(*z): 15


//    #################### 16. Destructuring Declarations ####################
//    - Assigns the elements of a data class to individual variables
//    Used to extract the properties of an object and assign them to variables
//    Syntax: val (variable1, variable2, ...) = object

    data class Person(val name: String, val age: Int)

    val person = Person("Akshay Savaliya", 22)

    val (name, age) = person

    println("Name: $name, Age: $age")    // Name: Akshay Savaliya, Age: 22


//    #################### 17. Lambda Operator ####################
//    - Defines a lambda expression
//    Used to create anonymous functions or function literals that can be passed as arguments to higher-order functions or stored in variables
//    Syntax: { arguments -> body } or
//    { x: Int, y: Int -> x + y } or
//    { x, y -> x + y } or
//    { it * 2 } or
//    { println(it) } or
//    { _, y -> y * 2 }

    val sum = { x: Int, y: Int -> x + y }

    println("sum(10, 20): ${sum(10, 20)}")    // sum(10, 20): 30


//    #################### 18. Function Reference Operator ####################
//    - Refers to a function by its name
//    Used to pass a function as an argument to another function or store a function in a variable
//    Syntax: ::functionName

    fun add(x: Int, y: Int): Int {
        return x + y
    }

    val addFunction = ::add

    println("addFunction(10, 20): ${addFunction(10, 20)}")    // addFunction(10, 20): 30


//    #################### 19. Type Cast Operator ####################
//    - Converts a value from one type to another
//    Used to check the type of object and cast it to another type if necessary
//    Syntax: object as Type or object as? Type

    val any: Any = "Hello"

    if (any is String) {
        println("Length: ${any.length}")    // Length: 5
    }

//    val any1: Any = "Hello"
//    val length: Int = any1 as Int    // Error: ClassCastException

//    val any2: Any = "Hello"
//    val length1: Int? = any2 as? Int
//    println("Length: $length1")    // Length: null

//    val any3: Any = "Hello"
//    val length2: Int = any3 as Int?    // Error: Type mismatch

}
