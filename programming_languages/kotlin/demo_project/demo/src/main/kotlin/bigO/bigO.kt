package org.example.bigO

fun test(list: List<Int>, number: Int): Int {
    for (i in list) {
        if (i == number) return number + 1
    }
    return -1
}