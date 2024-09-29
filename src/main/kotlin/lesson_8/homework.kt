package lesson_8

//Функция, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным

fun transformPhrase(phrase: String): String {
    var transformedPhrase = phrase

    // Преобразование для "невозможно"
    if (transformedPhrase.contains("невозможно")) {
        transformedPhrase = transformedPhrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
    }

    // Преобразование для "Я не уверен"
    if (transformedPhrase.startsWith("Я не уверен")) {
        transformedPhrase += ", но моя интуиция говорит об обратном"
    }

    // Преобразование для "катастрофа"
    if (transformedPhrase.contains("катастрофа")) {
        transformedPhrase = transformedPhrase.replace("катастрофа", "интересное событие")
    }

    // Преобразование для "без проблем"
    if (transformedPhrase.endsWith("без проблем")) {
        transformedPhrase = transformedPhrase.replace("без проблем", "с парой интересных вызовов на пути")
    }

    // Преобразование для однословных фраз
    if (transformedPhrase.trim().split(" ").size == 1) {
        transformedPhrase = "Иногда, ${transformedPhrase}, но не всегда"
    }

    return transformedPhrase
}

//Задание №1

fun main() {
    val logMessage = "Пользователь вошел в систему -> 2021-12-01 09:48:23"

    // Разделяем строку по стрелке "->"
    val parts = logMessage.split("->")

    // Получаем правую часть сообщения и обрезаем лишние пробелы
    val dateTime = parts[1].trim()

    // Разделяем дату и время
    val date = dateTime.split(" ")[0]
    val time = dateTime.split(" ")[1]

    // Печатаем дату и время
    println(date)
    println(time)
}

//Задание №2

fun main() {
    val cardNumber = "4539 1488 0343 6467"
    val maskedCardNumber = "************${cardNumber.takeLast(4)}"
    println(maskedCardNumber)
}

//Задание №3

fun main() {
    val email = "username@example.com"
    val transformedEmail = email.replace("@", " [at] ").replace(".", " [dot] ")
    println(transformedEmail)
}

//Задание №4

fun main() {
    val filePath = "C:/Пользователи/Документы/report.txt"
    val fileName = filePath.substringAfterLast("/")
    println(fileName)
}

fun main() {
    val phrase = "Объектно-ориентированное программирование"
    var abbreviation = ""
    val words = phrase.split(" ")
    for (word in words) {
        abbreviation += word.first()
    }
    println(abbreviation)
}
