package oops

//    ####################  Initializer Block  ####################
//    Initializer block is used to initialize the properties of the class. It is executed when the class is initialized.
//    The initializer block is executed every time an object of the class is created.

private class InitializerBlock {
    var name: String = "Kotlin"
    var age: Int = 10

    init {
        println("Initializer block is executed")
    }

    fun display() {
        println("Name: $name")
        println("Age: $age")
    }
}

fun main() {
    val obj = InitializerBlock()
    obj.display()
}
