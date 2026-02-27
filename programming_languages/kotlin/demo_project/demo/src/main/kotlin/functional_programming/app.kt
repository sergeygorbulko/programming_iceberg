package org.example.functional_programming

import org.example.demoApp.narrate

var heroName: String = ""


private fun createTitle(name: String): String {
    return when {
        name.all { it.isDigit() } -> "The Identifiable"
        name.none { it.isLetter() } -> "The Witness Protection Member"
        name.count { it.lowercase() in "aeiou" } > 4 -> "The Master of Vowel"
        else -> "The Renowned Hero"
    }
}

private fun makeYellow(message: String) = "\u001b[33;1m$message\u001b[0m"


private fun promptHeroName(): String {
    narrate(message = "A hero enters the town of Kronstadt. What is their name?", modifier = ::makeYellow)
    /*val input = readLine()
    require(input != null && input.isNotEmpty()) {
    "The hero must have a name."
    }
    return input*/
    println("Madrigal")
    return "Madrigal"
}
fun runApp() {
    heroName = promptHeroName()
    changeNarratorMood()
    // changeNarratorMood()
    narrate("$heroName, ${createTitle(heroName)}, heads to the town square")
    visitTavern()
}
