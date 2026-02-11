package org.example.vars_and_consts


// Константа времени компиляции
const val PI: Double = 3.14159


object User {
    val name: String = "Vasya"
    const val age: Int = 21
}

annotation class MyAnn(val v: String)

const val TAG = "demo"

@MyAnn(TAG)
class A

fun varsAndConsts() {

    val myInt: Int = 42
    val myInt2 = 42
    val myString: String = "Hello, Kotlin!"

    val myDouble: Double = 2.0 + readln().toDouble()
    println("myDouble: $myDouble")

    println("-------------------Vars and Consts DEMO-------------------")
    println("myInt: ${myInt}, myString: $myString")

    val newInt: Int = 1
    println("newInt: $newInt")

    println("const val: PI = $PI")

    println("User.name: ${User.name}, User.age: ${User.age}")



    val a = A()
    println(a)

    println("-------------------Vars and Consts DEMO-------------------")
}