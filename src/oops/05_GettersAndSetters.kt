package oops

import java.util.*

//    #################### Getters and Setters ####################
//    In Kotlin, getters and setters are optional. If you want to provide custom logic for the getter and setter, you can define them.
//    If you don't provide a custom getter or setter, Kotlin will provide a default one for you.
//    You can define a custom getter and setter for a property by using the get() and set() keywords.
//    You can define a custom getter and setter for a property by using the field keyword.


private class PersonOne(nameParam: String, ageParam: Int) {

    var name: String = nameParam
    var age: Int = ageParam
}

private class PersonTwo(nameParam: String, ageParam: Int) {

    var name: String = nameParam
        get() {
            return field.uppercase()
        }

    var age: Int = ageParam
        set(value) {
            if (value < 0) {
                throw IllegalArgumentException("Age can't be negative")
            }
            field = value
        }
}




fun main(){

//    #################### get and set using .(dot) operator ####################
//    In Kotlin, we can directly assign value to property using .(dot) operator
//    But some time assigning value without checking or validating is not good practice - so we can use getter and setter

//    Example: age should not be negative or name should not be empty string etc.
//    - we can check these conditions in getter and setter methods and throw exception if not valid value is assigned to property name or age etc.

    val p1 = PersonOne("Akshay", 22)
    println(p1.name)    // Akshay
    println(p1.age)    // 22
    p1.name = "Akshay Savaliya"
    p1.age = -22
    println(p1.name)    // Akshay Savaliya
    println(p1.age)    // -22


//    #################### get and set using get() and set() ####################
//    In Kotlin, we can define custom getter and setter for property using get() and set() methods
//    - we can define custom logic for getter and setter
//    - we can check some condition and throw exception if not valid value is assigned to property name or age etc.

    val p2 = PersonTwo("Akshay", 22)
    println(p2.name)    // AKSHAY
    println(p2.age)    // 22
    p2.name = "Akshay Savaliya"
    p2.age = -22
    println(p2.name)    // AKSHAY SAVALIYA
    println(p2.age)    // IllegalArgumentException: Age can't be negative

}