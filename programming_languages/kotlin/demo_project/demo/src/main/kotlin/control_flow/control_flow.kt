package org.example.controlflow


const val HERO_NAME = "Madrigal"


fun ifElseIfElseDemo() {
    println("------------------ if/else if/else + operators DEMO ------------------")
    var playerLevel = 4
    println(playerLevel.toString())

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    val quest: String = if (playerLevel == 1) {
        "Meet Mr. Bubbles in the land of soft things."
    } else if (playerLevel in 2..5) {
        val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
        // Проверить возможность дипломатического решения
        val barbarianQuest: String = if (canTalkToBarbarians) {
            "Convince the barbarians to call off their invasion."
        } else {
            "Save the town from the barbarian invasions."
        }
        barbarianQuest
    } else if (playerLevel == 6) {
        "Locate the enchanted sword."
    } else if (playerLevel == 7) {
        "Recover the long-lost artifact of creation."
    } else if (playerLevel == 8) {
        "Defeat Nogartse, bringer of death and eater of worlds."
    } else {
        "There are no quests right now."
    }
    println(quest)
    println(HERO_NAME)

    println("Time passes...")
    println("The hero returns from her quest.")
    playerLevel++
    println(playerLevel)
    println("-----------------------------------------------------------------------")
}

fun whenExamples() {
    var playerLevel = 4
    println(playerLevel.toString())

    val hasBefriendedBarbarians = true
    val hasAngeredBarbarians = false
    val playerClass = "paladin"

    // Пример с входным аргументом
    val quest: String = when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians && (hasBefriendedBarbarians || playerClass == "barbarian")
            // Проверить возможность дипломатического решения
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }
        6 -> "Locate the enchanted sword."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> "There are no quests right now."
    }

    val totalExperience = 1000
    // Пример с рассчитываемым входным аргументом
    val playerTitle = when (val playerLevel = totalExperience / 100 + 1) {
        1 -> "Apprentice"
        in 2..8 -> "Level " + playerLevel + " Warrior"
        9 -> "Vanquisher of Nogartse"
        else -> "Distinguished Knight"
    }

    val experiencePoints = 1000
    val requiredExperiencePoints = 10000
    // Пример без входного аргумента с условными выражениями
    val levelUpStatus: String = when {
        experiencePoints > requiredExperiencePoints -> {
            "You already leveled up!"
        }

        experiencePoints == requiredExperiencePoints -> {
            "You have enough experience to level up!"
        }
        requiredExperiencePoints - experiencePoints < 20 -> {
            // Игроку остается менее 20 очков опыта
            "You are very close to leveling up!"
        }
        else -> "You need more experience to level up!"
    }


    println(quest)
    println(HERO_NAME)

    println("Time passes...")
    println("The hero returns from her quest.")
    playerLevel++
    println(playerLevel)
}