package lesson_11


//Задание 1: Создание Пустого Словаря
val emptyMap = mapOf<Int, Int>()

//Задание 2: Создание и Инициализация Словаря
val floatToDoubleMap = mapOf(1.1f to 2.2, 3.3f to 4.4, 5.5f to 6.6)

//Задание 3: Создание Изменяемого Словаря
val mutableMap = mutableMapOf<Int, String>()

//Задание 4: Добавление Элементов в Словарь
mutableMap[1] = "First"
mutableMap[2] = "Second"

//Задание 5: Получение Значений из Словаря
val value1 = mutableMap[1] // вернет "First"
val value2 = mutableMap[3] // вернет null, так как ключа 3 нет

//Задание 6: Удаление Элементов из Словаря
mutableMap.remove(1)

//Задание 7: Перебор Словаря в Цикле
val divisionMap = mapOf(4.0 to 2, 8.0 to 0, 9.0 to 3)

for ((key, value) in divisionMap) {
    val result = if (value == 0) "бесконечность" else key / value
    println("Результат деления $key на $value: $result")
}

//Задание 8: Перезапись Элементов Словаря
mutableMap[2] = "Updated Second"

//Задание 9: Сложение Двух Словарей
val map1 = mutableMapOf(1 to "One", 2 to "Two")
val map2 = mapOf(3 to "Three", 4 to "Four")

for ((key, value) in map2) {
    map1[key] = value
}

//Задание 10: Словарь с Сложными Типами
val complexMap = mutableMapOf(
    "list1" to listOf(1, 2, 3),
    "list2" to listOf(4, 5, 6)
)

//Задание 11: Использование Множества в Качестве Значения
val setMap = mutableMapOf<Int, MutableSet<String>>()
setMap[1] = mutableSetOf("A", "B")
setMap[1]?.add("C")
println(setMap[1]) // Выведет: [A, B, C]

//Задание 12: Поиск Элемента по Значению
val pairMap = mapOf(Pair(5, 3) to "Value1", Pair(1, 5) to "Value2", Pair(2, 2) to "Value3")

for ((key, value) in pairMap) {
    if (key.first == 5 || key.second == 5) {
        println("Нашли значение: $value")
    }
}

//-----------------------------------------------------
//Задание 6: Словарь Библиотека

val library: Map<String, List<String>> = mapOf(
    "J.K. Rowling" to listOf("Harry Potter and the Philosopher's Stone", "Harry Potter and the Chamber of Secrets"),
    "George Orwell" to listOf("1984", "Animal Farm"),
    "J.R.R. Tolkien" to listOf("The Hobbit", "The Lord of the Rings")
)

//Задание 12: Справочник Растений
val plantDirectory: Map<String, List<String>> = mapOf(
    "Цветы" to listOf("Роза", "Лилия", "Тюльпан"),
    "Деревья" to listOf("Дуб", "Сосна", "Береза"),
    "Кустарники" to listOf("Сирень", "Жасмин", "Спирея")
)

//Задание 8: Четвертьфинала
val quarterfinalTeams: Map<String, List<String>> = mapOf(
    "Team A" to listOf("Player 1", "Player 2", "Player 3"),
    "Team B" to listOf("Player 4", "Player 5", "Player 6"),
    "Team C" to listOf("Player 7", "Player 8", "Player 9")
)

//Задание 9: Курс лечения
val treatmentCourse: Map<String, List<String>> = mapOf(
    "2024-01-01" to listOf("Препарат A", "Препарат B"),
    "2024-01-02" to listOf("Препарат C", "Препарат D"),
    "2024-01-03" to listOf("Препарат E")
)

//Задание 10: Словарь Путешественника
val travelDictionary: Map<String, Map<String, List<String>>> = mapOf(
    "France" to mapOf(
        "Paris" to listOf("Eiffel Tower", "Louvre", "Notre-Dame"),
        "Nice" to listOf("Promenade des Anglais", "Castle Hill")
    ),
    "Japan" to mapOf(
        "Tokyo" to listOf("Tokyo Tower", "Shibuya Crossing", "Sensoji Temple"),
        "Kyoto" to listOf("Fushimi Inari Shrine", "Kinkaku-ji", "Gion District")
    )
)
