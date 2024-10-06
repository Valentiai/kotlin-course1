package lesson_10

//Работа с массивами ARRAY
//Задание №1

val emptyList: List<Int> = listOf()

//Задание №2

val stringList: List<String> = listOf("Hello", "World", "Kotlin")

//Задание №3

val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Задание №4

mutableList.addAll(listOf(6, 7, 8))

//Задание №5

val stringList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
stringList.remove("World")

//Задание №6

val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
for (num in numbers) {
    println(num)
}

//Задание №7

val stringList: List<String> = listOf("Hello", "World", "Kotlin")
println(stringList[1]) // Выведет: World

//Задание №8

val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
mutableList[2] = 10 // Заменит элемент с индексом 2 на 10

//Задание №9

val list1: List<String> = listOf("Hello", "World")
val list2: List<String> = listOf("Kotlin", "Programming")
val combinedList: MutableList<String> = mutableListOf()

for (item in list1) {
    combinedList.add(item)
}

for (item in list2) {
    combinedList.add(item)
}

//Задание №10

val numbers: List<Int> = listOf(3, 5, 1, 9, 2)
var min = numbers[0]
var max = numbers[0]

for (num in numbers) {
    if (num < min) min = num
    if (num > max) max = num
}

println("Минимум: $min, Максимум: $max")

//Задание №11

val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)
val evenNumbers: MutableList<Int> = mutableListOf()

for (num in numbers) {
    if (num % 2 == 0) {
        evenNumbers.add(num)
    }
}

println(evenNumbers)

//Работа со списками LIST
//Задание №1

val emptyList: List<Int> = listOf()

//Задание №2

val stringList: List<String> = listOf("Hello", "World", "Kotlin")

//Задание №3

val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Задание №4

mutableList.addAll(listOf(6, 7, 8))

//Задание №5

val stringMutableList: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
stringMutableList.remove("World")

//Задание №6

val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
for (number in numbers) {
    println(number)
}

//Задание №7

val stringList: List<String> = listOf("Hello", "World", "Kotlin")
println(stringList[1]) // Вывод: World

//Задание №8

val mutableList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
mutableList[2] = 10 // Заменит элемент с индексом 2 на 10

//Задание №9

val list1: List<String> = listOf("Hello", "World")
val list2: List<String> = listOf("Kotlin", "Programming")
val combinedList: MutableList<String> = mutableListOf()

for (item in list1) {
    combinedList.add(item)
}

for (item in list2) {
    combinedList.add(item)
}

println(combinedList) // Вывод: [Hello, World, Kotlin, Programming]

//Задание №10

val numbers: List<Int> = listOf(3, 5, 1, 9, 2)
var min = numbers[0]
var max = numbers[0]

for (num in numbers) {
    if (num < min) min = num
    if (num > max) max = num
}

println("Минимум: $min, Максимум: $max")

//Задание №11

val numbers: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8)
val evenNumbers: MutableList<Int> = mutableListOf()

for (num in numbers) {
    if (num % 2 == 0) {
        evenNumbers.add(num)
    }
}

println(evenNumbers) // Вывод: [2, 4, 6, 8]

//Работа с Множествами SET
//Задание №1

val emptySet: Set<Int> = emptySet()

//Задание №2

val numberSet: Set<Int> = setOf(1, 2, 3)

//Задание №3

val mutableSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

//Задание №

mutableSet.addAll(listOf("Swift", "Go"))

//Задание №5

val numberSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
numberSet.remove(2)

//Задание №6

val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5)
for (num in numberSet) {
    println(num)
}

//Задание №7

fun containsString(set: Set<String>, str: String): Boolean {
    for (item in set) {
        if (item == str) {
            return true
        }
    }
    return false
}

//Задание №8

val set1: Set<String> = setOf("Kotlin", "Java")
val set2: Set<String> = setOf("Swift", "Go")
val unionSet: MutableSet<String> = mutableSetOf()

for (item in set1) {
    unionSet.add(item)
}

for (item in set2) {
    unionSet.add(item)
}

println(unionSet) // Вывод: [Kotlin, Java, Swift, Go]

//Задание №9

val set1: Set<Int> = setOf(1, 2, 3, 4)
val set2: Set<Int> = setOf(3, 4, 5, 6)
val intersection: MutableSet<Int> = mutableSetOf()

for (item in set1) {
    if (item in set2) {
        intersection.add(item)
    }
}

println(intersection) // Вывод: [3, 4]

//Задание №10

val set1: Set<String> = setOf("Kotlin", "Java", "Scala")
val set2: Set<String> = setOf("Java", "Swift")
val difference: MutableSet<String> = mutableSetOf()

for (item in set1) {
    if (item !in set2) {
        difference.add(item)
    }
}

println(difference) // Вывод: [Kotlin, Scala]

//Задание №11

val stringSet: Set<String> = setOf("Kotlin", "Java", "Scala")
val stringList: MutableList<String> = mutableListOf()

for (item in stringSet) {
    stringList.add(item)
}

println(stringList) // Вывод: [Kotlin, Java, Scala]
