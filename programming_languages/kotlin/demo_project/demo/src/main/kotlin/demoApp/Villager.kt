package org.example.demoApp

class Villager(val name: String, val hometown: String) {

    val personality: String
    val race = "Dwarf"
    var age = 50
        private set



    constructor(name: String) : this(name, "Bavaria") {
        age = 99
    }

    init {
        println("initializing villager")
        personality = "Outgoing"
    }
}