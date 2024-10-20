package lesson_13

//1. Предварительные задачи на использование методов.
//Задачи на приведение коллекций к значению

//Проверить, что размер коллекции больше 5 элементов.
val collection = listOf(1, 2, 3, 4, 5, 6)
val isSizeGreaterThanFive = collection.size > 5

//Проверить, что коллекция пустая
val collection = listOf<Int>()
val isEmpty = collection.isEmpty()

//Проверить, что коллекция не пустая
val collection = listOf(1, 2, 3)
val isNotEmpty = collection.isNotEmpty()

//Взять элемент по индексу или создать значение если индекса не существует
val collection = listOf(1, 2, 3)
val value = collection.getOrElse(5) { 0 } // вернёт 0, если элемент не найден

//Собрать коллекцию в строку
val collection = listOf(1, 2, 3)
val result = collection.joinToString(separator = ", ", prefix = "[", postfix = "]")

//Посчитать сумму всех значений
val collection = listOf(1, 2, 3)
val sum = collection.sum()

//Посчитать среднее
val collection = listOf(1, 2, 3)
val average = collection.average()

//Взять максимальное число
val collection = listOf(1, 2, 3)
val max = collection.maxOrNull()

//Взять минимальное число
val collection = listOf(1, 2, 3)
val min = collection.minOrNull()

//Взять первое число или null
val collection = listOf(1, 2, 3)
val firstOrNull = collection.firstOrNull()

//Проверить что коллекция содержит элемент
val collection = listOf(1, 2, 3)
val containsElement = collection.contains(2)

//Задачи на обработку коллекций
//Отфильтровать коллекцию по диапазону 18-30
val collection = listOf(12, 18, 25, 30, 35, 40)
val filtered = collection.filter { it in 18..30 }

//Выбрать числа, которые не делятся на 2 и 3 одновременно
val collection = listOf(1, 2, 3, 6, 9, 12, 15, 18)
val filtered = collection.filterNot { it % 2 == 0 && it % 3 == 0 }

//Очистить текстовую коллекцию от null элементов
val collection = listOf("apple", null, "banana", "cherry", null)
val filtered = collection.filterNotNull()

//Преобразовать текстовую коллекцию в коллекцию длин слов
val collection = listOf("apple", "banana", "cherry")
val lengths = collection.map { it.length }

//Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
val collection = listOf("apple", "banana", "cherry")
val map = collection.associate { it to it.reversed() }

//Отсортировать список в алфавитном порядке
val collection = listOf("cherry", "banana", "apple")
val sorted = collection.sorted()

//Отсортировать список по убыванию
val collection = listOf(5, 3, 8, 1)
val sortedDescending = collection.sortedDescending()

//Распечатать квадраты элементов списка
val collection = listOf(1, 2, 3, 4)
collection.forEach { println(it * it) }

//Группировать список по первой букве слов
val collection = listOf("apple", "apricot", "banana", "cherry")
val grouped = collection.groupBy { it.first() }

//Очистить список от дублей
val collection = listOf(1, 2, 2, 3, 4, 4, 5)
val distinctList = collection.distinct()

//Взять первые 3 элемента списка
val collection = listOf(1, 2, 3, 4, 5)
val firstThree = collection.take(3)

//Взять последние 3 элемента списка
val collection = listOf(1, 2, 3, 4, 5)
val lastThree = collection.takeLast(3)

//Задание 2: Характеристика числовой коллекции
fun collectionCharacteristics(numbers: Collection<Int>): String {
    return when {
        numbers.isEmpty() -> "Пусто"
        numbers.size < 5 -> "Короткая"
        numbers.firstOrNull() == 0 -> "Стартовая"
        numbers.sum() > 10000 -> "Массивная"
        numbers.average() == 10.0 -> "Сбалансированная"
        numbers.joinToString("").length == 20 -> "Клейкая"
        numbers.maxOrNull() ?: 0 < -10 -> "Отрицательная"
        numbers.minOrNull() ?: 0 > 1000 -> "Положительная"
        numbers.containsAll(listOf(3, 14)) -> "Пи***тая"
        else -> "Уникальная"
    }
}

fun main() {
    // Тестирование с примерами данных
    val examples = listOf(
        listOf(),                       // "Пусто"
        listOf(1, 2, 3),                // "Короткая"
        listOf(0, 5, 10, 15),           // "Стартовая"
        listOf(5000, 6000, 7000),       // "Массивная"
        listOf(5, 10, 15),              // "Сбалансированная"
        listOf(1, 23, 456, 7890),       // "Клейкая"
        listOf(-20, -30, -40),          // "Отрицательная"
        listOf(2000, 3000, 4000),       // "Положительная"
        listOf(3, 14, 7, 8, 9),         // "Пи***тая"
        listOf(42, 78, 99)              // "Уникальная"
    )

    for (example in examples) {
        println("Коллекция: $example -> Характеристика: ${collectionCharacteristics(example)}")
    }
}

//Задание 3: Анализ Учебных Оценок
fun main() {
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)

    // Отфильтруем удовлетворительные оценки, отсортируем по возрастанию и возьмем первые 3
    val result = grades
        .filter { it >= 60 }      // Оставляем только удовлетворительные оценки (>=60)
        .sorted()                 // Сортируем по возрастанию
        .take(3)                  // Берем первые 3 элемента

    println(result)  // Вывод результата
}

//Задание 4: Создание каталога по первой букве.
fun main() {
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val catalog = list
        .map { it.lowercase() }  // Приводим к нижнему регистру
        .groupBy { it.first() }   // Группируем по первой букве

    println(catalog)
}

//Задание 5: Подсчёт средней длины слов в списке.
fun main() {
    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра", "подушка",
        "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник", "Коврик",
        "вешалка", "Подставка", "телевизор", "Комод", "полка", "Абажур", "диван", "Кресло", "занавеска",
        "Бра", "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка", "Ключница", "плед", "Тумба",
        "игрушка", "Настенные часы", "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )

    val averageLength = list.map { it.length }.average()

    println("Средняя длина слов: %.2f".format(averageLength))
}

//Задание 6: Категоризация чисел.
fun main() {
    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    val categorized = numbers
        .distinct()               // Убираем дубликаты
        .sortedDescending()        // Сортируем по убыванию
        .groupBy { it % 2 == 0 }   // Группируем по четности

    println(categorized.mapKeys { if (it.key) "Четные" else "Нечетные" })
}

//Задание 7: Поиск первого подходящего элемента
fun main() {
    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    val firstSuitableAge = ages
        .filterNotNull()           // Убираем null
        .firstOrNull { it > 18 }   // Находим первый возраст больше 18

    val result = firstSuitableAge?.toString() ?: "Подходящий возраст не найден"

    println(result)
}
