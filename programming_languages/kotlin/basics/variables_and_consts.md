# Переменные и константы

[demo](../demo_project/demo/src/main/kotlin/vars_and_consts/vars_and_consts.kt)


## Объявление переменных и констант

### Изменяемая переменная 
```kotlin
// С присвоением типа
var a: Int = 1 
// Автоматически определится тип
var b = 2
```

### Неизменяемая переменная
```kotlin
val b: Int = 2
```

### Константа времени компиляции

```kotlin
// Объявление константы времени компиляции
// На уровне модуля
const val PI = 3.14

// Объявление константы времени компиляции в объекте
object User {
    val name: String = "Vasya"
    const val age: Int = 21
}
```
