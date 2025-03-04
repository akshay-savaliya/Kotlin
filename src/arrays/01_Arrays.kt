package arrays

// #################### Arrays ####################
// -Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
// -Object that store multiple variables of the same type.

// To create an array, we can use a library function arrayOf() and pass the item values to it, so that arrayOf(1, 2, 3) creates an array [1, 2, 3].
// Alternatively, the arrayOfNulls() library function can be used to create an array of a given size filled with null elements.

// We can also create an array of specific size without initialization, in this case, the array elements are initialized with default values according to the element type (0 for numeric types, false for Boolean, null for nullable types).

// The Array constructor can be called with the array size and a lambda function that initializes each element of the array. The lambda function argument is the element index.

// The Array class has a get and set functions (that turn into [] by operator overloading conventions), and size property, along with a few other useful member functions: e.g. copyOf, copyOfRange, fill, etc.

// Syntax: var arrayName = arrayOf(1, 2, 3, 4, 5)    // Array of integers
// Syntax: var arrayName = arrayOfNulls<Int>(5)       // Array of nulls of size 5
// Syntax: var arrayName = Array(5, { i -> i * 2 })   // Array of size 5 with elements initialized to i * 2


fun main() {

//    #################### Creating an array ####################

    var numbers = arrayOf(1, 2, 3, 4, 5)
    var names = arrayOf("Akshay", "Darshit", "Sahaj", "Harsh", "Mitul")

    //    Creating an array of specific size without initialization
    var numbers1 = IntArray(5)
    var names1 = Array<String>(5) { "" }

    //    Creating an array of nulls of size 5
    var nullArray = arrayOfNulls<Int>(5)


//    #################### Accessing elements of an array ####################

    //    Accessing elements of an array using index (index starts from 0)
    println(numbers[0]) // Output: 1
    println(names[1]) // Output: Darshit

    //    Accessing elements of an array using get() method
    println(numbers.get(0)) // Output: 1
    println(names.get(1)) // Output: Darshit


//    #################### Updating elements of an array ####################

    //    Updating elements of an array using index
    numbers[0] = 10
    names[1] = "Darshit Patel"

    //    Updating elements of an array using set() method
    numbers.set(1, 20)
    names.set(2, "Sahaj Patel")


//    #################### Accessing array size ####################

    println(numbers.size) // Output: 5
    println(names.size) // Output: 5


//    #################### Iterating over an array ####################

    //    Accessing elements of an array using loop
    for (i in numbers) {
        println(i)
    }
    for (i in names) {
        println(i)
    }

    //    Accessing elements of an array using loop and index
    for (i in numbers.indices) {
        println("Index: $i, Value: ${numbers[i]}")
    }
    for (i in names.indices) {
        println("Index: $i, Value: ${names[i]}")
    }

    //    Accessing elements of an array using loop and index using withIndex()
    for ((index, value) in numbers.withIndex()) {
        println("Index: $index, Value: $value")
    }
    for ((index, value) in names.withIndex()) {
        println("Index: $index, Value: $value")
    }

}