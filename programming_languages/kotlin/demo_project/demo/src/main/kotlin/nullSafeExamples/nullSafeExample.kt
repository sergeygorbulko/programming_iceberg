package org.example.nullSafeExamples

const val HERO_NAME = "Madrigal"
var playerLevel = 5

fun obtainQuest(
    playerLevel: Int,
    playerClass: String = "paladin",
    hasBefriendedBarbarians: Boolean = true,
    hasAngeredBarbarians: Boolean = false
): String? {
    require(playerLevel > 0) {
        "The player's level must be at least 1."
    }
    return when (playerLevel) {
        1 -> "Meet Mr. Bubbles in the land of soft things."
        in 2..5 -> {
            val canTalkToBarbarians = !hasAngeredBarbarians &&
                    (hasBefriendedBarbarians || playerClass == "barbarian")
            if (canTalkToBarbarians) {
                "Convince the barbarians to call off their invasion."
            } else {
                "Save the town from the barbarian invasions."
            }
        }
        6 -> "Locate the enchanted sword."
        7 -> "Recover the long-lost artifact of creation."
        8 -> "Defeat Nogartse, bringer of death and eater of worlds."
        else -> null
    }
}


private fun readBountyBoard() {
    val message: String = try {
        val quest: String? = obtainQuest(playerLevel)
        val censoredQuest = quest?.replace("Nogartse", "xxxxxxxx")
        if (censoredQuest != null) {
            """
             |$HERO_NAME approaches the bounty board. It reads:
             | "$censoredQuest"
             """.trimMargin()
        } else {
            "$HERO_NAME approaches the bounty board, but it is blank."
        }
    } catch (e: Exception) {
        "An error occurred while reading the bounty board: ${e.message}"
    }
    println(message)
}

private fun readBountyBoardLetExample() {
    try {
        val quest: String? = obtainQuest(playerLevel)
        val message: String = quest?.replace("Nogartse", "xxxxxxxx")
            ?.let { censoredQuest ->
                """
             |$HERO_NAME approaches the bounty board. It reads:
             | "$censoredQuest"
            """.trimMargin()
            } ?: "$HERO_NAME approaches the bounty board, but it is blank."
        println(message)
    } catch (e: Exception) {
        println("An error occurred while reading the bounty board: ${e.message}")
    }
}

fun runApp() {
    println("$HERO_NAME announces her presence to the world.")
    println("What level is $HERO_NAME?")
    playerLevel = readLine()?.toIntOrNull() ?: 0

    println("$HERO_NAME's level is $playerLevel.")

    println("Time passes...")
    println("$HERO_NAME returns from her quest.")
    println(playerLevel)
    readBountyBoard()
}
