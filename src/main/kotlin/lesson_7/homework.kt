package lesson_7

//Прямой диапазон
for (i in 1..5) {
    println(i) // Выведутся числа 1,2,3,4,5
}

for (i in 1..10) {
    if (i % 2 == 0) {
        println(i) // Выведутся числа 2,4,6,8,10
    }
}

//Обратный диапазон
for (i in 5 downTo 1) {
    println(i) // Выведутся числа 5,4,3,2,1
}

for (i in 10 downTo 1 step 2) {
    if (i % 2 == 0) {
        println(i) // Выведутся числа 10,8,6,4,2
    }
}

//С Шагом (step)
for (i in 1..9 step 2) {
    println(i) // Выведутся числа 1, 3, 5, 7, 9
}

for (i in 1..20 step 3) {
    println(i) // Выведутся числа 1, 3, 5, 7, 9
}

//Использование До (until)
for (i in 1 until 9) {
    println(i) // Выведутся числа 1,2,3,4,5,6,7,8
}

for (i in 3 until 5) {
    println(i) // Выведутся числа 3,4,5,6,7,8,9,10,11,12,13,14
}

//Цикл while
var i = 0
while (i < 5) {
    println(i*i)
    i++
}

var i = 10
while (i >= 5) {
    println(i)
    i--
}

//Цикл do...while
var i = 5
do {
    println(i)
    i--
} while (i >= 1)

var counter = 5
do {
    println(counter)
    counter++
} while (counter < 10)

//Использование break
for (i in 1..10) {
    if (i == 6) {
        break
    }
    println(i)
}

var i = 1
while (true) {
    println(i)
    if (i == 10) {
        break
    }
    i++
}

//Использование continue
for (i in 1..10) {
    if (i % 2 == 0) {
        continue
    }
    println(i)
}

var i = 1
while (i <= 10) {
    if (i % 3 == 0) {
        i++
        continue
    }
    println(i)
    i++
}

//Задача на вложенный цикл
fun main() {
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()  // Переход на новую строку после завершения внутреннего цикла
    }
}