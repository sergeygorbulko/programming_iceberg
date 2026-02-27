# Functions - Функции

```kotlin
fun functionName(param1: Int, param2: String) {
    // Function body
}

// fun - ключевое слово для объявления функции
// anotherFunction - имя функции
// param: Double - параметр функции, тип Double
// : Boolean - тип возвращаемого значения
fun anotherFunction(param: Double): Boolean {
    return true
}

fun anotherFunction2(param: Int): Int {
    // Локальная область видимости переменная доступна и существует только в функции
    val x = 5
    // param: Int - тоже относится к области видимости функции
    return x + param
}

// перегрузка функции
fun anotherFunction2(param: String): Int {
    // Function body
    return param.length
}


fun anotherFunction3() {
    // если функция не возвращает значение, то тип возвращаемого значения - Unit
    1 + 1
}

// myTODO - имя функции
// : Nothing - тип возвращаемого значения
// тип Nothing гарантирует, что функция не будет возвращать значение
fun myTODO(): Nothing = throw Exception("Not implemented yet")


// 'сказочная хрень' - имя функции НЕ НАДО ТАК ДЕЛАТЬ!!!
fun 'сказочная хрень'() {
    
}

// Пример вызова
'сказочная хрень'()
```