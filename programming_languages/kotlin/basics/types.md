# Типы данных

[demo](../demo_project/demo/src/main/kotlin/types_example/types_example.kt)

## Примитивные типы Kotlin (JVM) — таблица

| Категория | Тип | Размер | Диапазон / значения | Примечания |
|---|---|---:|---|---|
| Логический | `Boolean` | — | `true` / `false` | На JVM размер зависит от представления (в массивах/полях по-разному) |
| Целые (signed) | `Byte` | 8 бит | −128 … 127 |  |
|  | `Short` | 16 бит | −32 768 … 32 767 |  |
|  | `Int` | 32 бит | −2 147 483 648 … 2 147 483 647 |  |
|  | `Long` | 64 бит | −9 223 372 036 854 775 808 … 9 223 372 036 854 775 807 |  |
| Целые (unsigned) | `UByte` | 8 бит | 0 … 255 | Беззнаковый тип |
|  | `UShort` | 16 бит | 0 … 65 535 | Беззнаковый тип |
|  | `UInt` | 32 бит | 0 … 4 294 967 295 | Беззнаковый тип |
|  | `ULong` | 64 бит | 0 … 18 446 744 073 709 551 615 | Беззнаковый тип |
| Вещественные | `Float` | 32 бит | IEEE 754 | ~6–7 значащих цифр точности |
|  | `Double` | 64 бит | IEEE 754 | ~15–16 значащих цифр точности |
| Символьный | `Char` | 16 бит | UTF‑16 code unit (`'\u0000'` … `'\uFFFF'`) | Не всегда «один видимый символ» (некоторые символы требуют surrogate pair) |


## Переполнение

### Переполнение целых чисел

Целые (signed) при переполнении начнется с противоположной границы типа 

```kotlin
    byte = (byte + 1).toByte()
    println("Overflow example byte: $byte ")
    int += 1
    println("Overflow example int: $int ")
```

Целые (unsigned) при переполнении начнется с 0

```kotlin
    uByte = (uByte + 1.toUByte()).toUByte()
    println("Overflow example uByte: $uByte ")
```


Вещественные могут превратится в Infinity/Infinity-/Infinity+ или NaN 

```kotlin
    val posInfD: Double = Double.MAX_VALUE * 2
    val negInfD: Double = -Double.MAX_VALUE * 2
```

101.11100