package oops

//    #################### lateinit ####################
//    lateinit is used to tell the compiler that the variable will be initialized later.
//    lateinit can be used only with mutable data types, and it cannot be used with primitive data types.
//    lateinit can be used only with var and not with val.
//    lateinit can be used only with non-nullable data types.
//    lateinit can be used only with properties that are declared inside the class and not at the top level.
//    lateinit can be used only with properties that are not initialized at the time of declaration.
//    lateinit can be used only with properties that are not initialized in the constructor.
//    lateinit can be used only with properties that are not initialized with custom getter or setter.
//    lateinit can be used only with properties that are not initialized with a delegate.

private class User {

//    var name: String    // Error: Property must be initialized or be abstract.
    lateinit var name: String
//    lateinit age: Int    // Error: lateinit modifier is allowed only on mutable properties
    var age: Int = 0
    lateinit var address: String
}

fun main() {
    val user = User()
    user.name = "Akshay"
    user.age = 22
    user.address = "Surat"
    println("Name: ${user.name}, Age: ${user.age}, Address: ${user.address}")    // Name: Akshay, Age: 22, Address: Surat
}

