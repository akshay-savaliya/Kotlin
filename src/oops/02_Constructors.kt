package oops

//    #################### Why Constructors? ####################
//    Constructors are used to initialize the properties of an object.
//    Constructors are called when an object is created.
//    Constructors are used to pass arguments to the object.
//    Constructors are used to create an object with some initial values.

//    #################### Types of Constructors ####################
//    1. Primary Constructor
//    2. Secondary Constructor

//    #################### Primary Constructor ####################
//    A primary constructor is a part of the class header.
//    A primary constructor is declared after the class name.
//    A primary constructor can have parameters, default values & access modifiers.

private class Person(var name: String, var age: Int){
    fun display(){
        println("Name: $name")
        println("Age: $age")
    }
}


//    #################### Secondary Constructor ####################
//    A secondary constructor is declared inside the class.
//    A secondary constructor is declared with the constructor keyword.

private class Employee{
    var name: String = ""
    var age: Int = 0

    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }

    fun display(){
        println("Name: $name")
        println("Age: $age")
    }
}


//    #################### Constructor Overloading ####################
//    Constructor overloading is a concept of having more than one constructor in a class.
//    Constructor overloading is used to create an object with different parameters.

private class Automobile(val name: String, val tyres: Int, val maxSeating: Int, val enginType: String){

    init {
        println("Name: $name is created")
    }

    constructor(nameParam: String, enginParam: String): this(nameParam, 4, 5, enginParam)

    fun display(){
        println("Name: $name")
        println("Tyres: $tyres")
        println("Max Seating: $maxSeating")
        println("Engine Type: $enginType")
    }

    fun drive(){
        println("Driving $name")
    }

    fun applyBreak(){
        println("Applying break to $name")
    }
}


fun main(){

    //    Primary Constructor
    val person1 = Person("Akshay", 22)
    person1.display()

    //    Secondary Constructor
    val employee1 = Employee("Harsh", 21)
    employee1.display()

    //    Constructor Overloading
    val car = Automobile("BMW", 4, 5, "Petrol")
    var car2 = Automobile("Audi", "Diesel")

}