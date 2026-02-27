package org.example.types_example

import kotlin.math.round

const val HERO_NAME = "Gandalf"
const val playerLevel = 10

private fun primitiveTypesExample() {
    val bool: Boolean = true
    var byte: Byte = 127
    val short: Short = 32767
    var int: Int = 2147483647
    val long: Long = 9223372036854775807
    var uByte: UByte = 255.toUByte()
    val uShort: UShort = 65535.toUShort()
    val uInt: UInt = 4294967295U
    val uLong: ULong = 18446744073709551615UL
    val float: Float = 3.14f
    val double: Double = 3.14
    val char: Char = 'A'

    println("------------------- Primitive Types DEMO-------------------")
    println("bool: $bool")
    println("byte: $byte")
    println("short: $short")
    println("int: $int")
    println("long: $long")
    println("uByte: $uByte")
    println("uShort: $uShort")
    println("uInt: $uInt")
    println("uLong: $uLong")
    println("float: $float")
    println("double: $double")
    println("char: $char")

    //Пример с переполнением

    byte = (byte + 1).toByte()
    println("Overflow example byte: $byte ")
    uByte = (uByte + 1.toUByte()).toUByte()
    println("Overflow example uByte: $uByte ")
    int += 1
    println("Overflow example int: $int ")


    // 1) Infinity / -Infinity из-за слишком большого результата
    val posInfD: Double = Double.MAX_VALUE * 2
    val negInfD: Double = -Double.MAX_VALUE * 2

    val posInfF: Float = Float.MAX_VALUE * 2f
    val negInfF: Float = -Float.MAX_VALUE * 2f

    println("Double +Infinity: $posInfD, isInfinite=${posInfD.isInfinite()}")
    println("Double -Infinity: $negInfD, isInfinite=${negInfD.isInfinite()}")

    println("Float  +Infinity: $posInfF, isInfinite=${posInfF.isInfinite()}")
    println("Float  -Infinity: $negInfF, isInfinite=${negInfF.isInfinite()}")

    println()


    try {
        val v = 2.0/0
        println("v: $v")
    } catch (e: ArithmeticException) {
        println("Exception: ${e.message}")
    }


    // 2) NaN (Not a Number)
    val nan1 = 0.0 / 0.0
    val nan2 = Double.POSITIVE_INFINITY - Double.POSITIVE_INFINITY
    val nan3 = kotlin.math.sqrt(-1.0)

    println("${2.0 / 0}")
    println("NaN via 0.0/0.0: $nan1, isNaN=${nan1.isNaN()}")
    println("NaN via Inf-Inf: $nan2, isNaN=${nan2.isNaN()}")
    println("NaN via sqrt(-1): $nan3, isNaN=${nan3.isNaN()}")

    println()

    // 3) Полезные проверки и "особенность" NaN
    println("posInfD > 1e308 = ${posInfD > 1e308}") // true
    println("nan1 == nan1 = ${nan1 == nan1}")

    // false (NaN не равен сам себе)

    println(1.4.toInt())
    println(1.555555.toInt())
    println(round(1.5555))
    println(round(1.4))

    println("------------------- Primitive Types DEMO-------------------")

    val uByte2: UByte = 500.toUByte()
    println("uByte2: $uByte2")

    println(
        """
           $HERO_NAME approaches the bounty board. It reads:
           "$playerLevel"
         """.trimIndent()
    )
}

fun typesExample() {
    primitiveTypesExample()
}