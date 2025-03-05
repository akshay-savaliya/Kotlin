package oops

//    #################### OOPs - Object Oriented Programming ####################

//    Object - An object is a real-world entity that has some attributes and behaviors.
//    Class - A class is a blueprint for objects. It defines a datatype of objects.
//    Attributes - Attributes are the properties of an object.
//    Behaviors - Behaviors are the actions that an object can perform.

//    Example:
//    Car
//    Attributes: color, model, price
//    Behaviors: start, stop


private class Car{
    var color: String = "Red"
    var model: String = "BMW"
    var price: Int = 1000000

    fun start(){
        println("Car is starting")
    }

    fun stop(){
        println("Car is stopping")
    }
}

private class Bus(var color: String, var model: String, var price: Int){
    fun start(){
        println("Bus is starting")
    }

    fun stop(){
        println("Bus is stopping")
    }
}

fun main(){

    val car1 = Car()
    println("Color: ${car1.color}")    // Color: Red
    println("Model: ${car1.model}")    // Model: BMW
    println("Price: ${car1.price}")    // Price: 1000000
    car1.start()    // Car is starting
    car1.stop()    // Car is stopping

    val bus1 = Bus("Blue", "Volvo", 2000000)
    println("Color: ${bus1.color}")    // Color: Blue
    println("Model: ${bus1.model}")    // Model: Volvo
    println("Price: ${bus1.price}")    // Price: 2000000
    bus1.start()    // Bus is starting
    bus1.stop()    // Bus is stopping

}
