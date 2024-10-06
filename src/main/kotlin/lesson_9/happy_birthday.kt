package lesson_9

fun main() {
    val birthdayPerson = "Саша"
    val age = 41

    println("fun celebrateBirthday($birthdayPerson: String) {")
    println("    println(\"Happy Birthday, \$birthdayPerson!\")")
    println("    println(\"Ты молод, всего лишь \$age лет!\")")
    println("    if (age % 2 == 0) {")
    println("        println(\"Чётное количество лет - отличное время для новых знаний и открытий!\")")
    println("    } else {")
    println("        println(\"Нечётное количество лет - значит впереди множество необычных событий!\")")
    println("    }")
    println("    println(\"Пусть твои программы всегда компилируются с первой попытки!\")")
    println("    println(\"И каждый код завершается успехом!\")")
    println("}\n")

    celebrateBirthday(birthdayPerson)
}

fun celebrateBirthday(birthdayPerson: String) {
    val age = 41
    println("Happy Birthday, $birthdayPerson!")
    println("Ты молод, всего лишь $age лет!")

    if (age % 2 == 0) {
        println("Чётное количество лет - отличное время для новых знаний и открытий!")
    } else {
        println("Нечётное количество лет - значит впереди множество необычных событий!")
    }

    println("Пусть твои программы всегда компилируются с первой попытки!")
    println("И каждый код завершается успехом!")
}