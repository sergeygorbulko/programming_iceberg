# Control Flow

# Операторы сравнения
| Оператор / форма | Значение | Примечания |
| --- | --- | --- |
| `a == b` | Равны (структурное равенство) | Безопасно для `null`: под капотом вызывает `equals`, но с проверкой на `null`. |
| `a != b` | Не равны (структурное неравенство) | Логическое отрицание `==`. |
| `a === b` | Один и тот же объект (ссылочное равенство) | Сравнивает ссылки (identity), а не содержимое. |
| `a !== b` | Разные объекты (ссылочное неравенство) | Логическое отрицание `===`. |
| `a < b` | Меньше | Для чисел — обычное сравнение; для `Comparable` — через `compareTo`. |
| `a <= b` | Меньше или равно | Аналогично: использует `compareTo`. |
| `a > b` | Больше | Аналогично: использует `compareTo`. |
| `a >= b` | Больше или равно | Аналогично: использует `compareTo`. |
| `a in range` | `a` принадлежит диапазону/множеству | Вызывается `range.contains(a)`. Пример: `x in 1..10`. |
| `a !in range` | `a` не принадлежит диапазону/множеству | Логическое отрицание `in`. |
| `a is T` | `a` имеет тип `T` | Проверка типа (аналог `instanceof`). |
| `a !is T` | `a` не имеет тип `T` | Логическое отрицание . `is` |
| `compareValues(a, b)` | Сравнить с учётом `null` | Возвращает `Int`: `< 0`, `0`, `> 0` (не оператор, но часто используют для “сравнения”). |


### Пример compareValues(a, b)

```kotlin
fun main() {
    val a: Int? = null
    val b: Int? = 10

    println(compareValues(a, b)) // -1 (null считается меньше любого ненулевого)
    println(compareValues(b, a)) //  1
    println(compareValues(a, null)) // 0

    val c: String? = "apple"
    val d: String? = "banana"
    println(compareValues(c, d)) // < 0, потому что "apple" < "banana" (лексикографически)
}
```

## Интервалы
```kotlin
val x = 10
if (x in 1..10) {
    println("x is in the range from 1 to 10, which is also inclusive of 10")
}
```

## if/else if/else

```kotlin
if ( x > 0 ) {
    println( "x is positive" )
} else if ( x < 0 ) {
    println( "x is negative" )
} else {
    println("x is zero")
}
```

## when

```kotlin
when (x) {
    1 -> println("x is one")
    2 -> println("x is two")
    else -> println("x is neither one nor two")
}
```

## Условные выражения
```kotlin
// if
val result = if (condition) valueIfTrue else valueIfFalse

// when
val result = when (x) {
    in 1..10 -> "x is in the range"
    !in 10..20 -> "x is outside the range"
    else -> "none of the above"
}

// when with ranges
val playerTitle = when (val playerLevel = totalExperience / 100 + 1) {
    1 -> "Apprentice"
    in 2..8 -> "Level " + playerLevel + " Warrior"
    9 -> "Vanquisher of Nogartse"
    else -> "Distinguished Knight"
}
```