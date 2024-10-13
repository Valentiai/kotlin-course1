package lesson_12

//НАПИШИ ВАЛИДНУЮ СИГНАТУРУ МЕТОДА
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun myFunction(): Unit

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun sum(a: Int, b: Int): Int

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun printString(str: String): Unit

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun average(numbers: List<Int>): Double

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun getLength(str: String?): Int?

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun getNullableFloat(): Float?

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun processNullableList(numbers: List<Int>?): Unit

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun intToNullableString(num: Int): String?

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun getNullableStringList(): List<String?>

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun compare(str: String?, num: Int?): Boolean?

//ЗАДАЧА №1
fun multiplyByTwo(num: Int): Int {
    return num * 2
}

//ЗАДАЧА №2
fun isEven(num: Int): Boolean {
    return num % 2 == 0
}

//ЗАДАЧА №3
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

//ЗАДАЧА №4
fun findFirstNegative(numbers: List<Int>): Int? {
    for (num in numbers) {
        if (num < 0) {
            return num
        }
    }
    return null
}

//ЗАДАЧА №5
fun processList(strings: List<String?>) {
    for (str in strings) {
        if (str == null) return
        println(str)
    }
}

//РЕФАКТОРИНГ
fun drawRectangle(width: Int, height: Int) {
    if (width <= 0 || height <= 0) {
        throw IllegalArgumentException("Width и height должны быть положительными и больше нуля")
    }

    printLine(width, isBoundary = true)  // Верхняя граница
    printMiddleLines(width, height)      // Боковые границы
    printLine(width, isBoundary = true)  // Нижняя граница
}

private fun printLine(width: Int, isBoundary: Boolean) {
    if (isBoundary) {
        println("+" + "-".repeat(width - 2) + "+")
    } else {
        println("|" + " ".repeat(width - 2) + "|")
    }
}

private fun printMiddleLines(width: Int, height: Int) {
    for (i in 1 until height - 1) {
        printLine(width, isBoundary = false)
    }
}

// Запускаем рефакторенную функцию
drawRectangle(5, 3)
