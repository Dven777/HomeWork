package com.example.homework

fun main() {
    println(Lambdas1().sumWithLambda())
    val names = listOf("David", "Uriy", "Djamshut", "Ashot")
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(Lambdas2().getLongStrings(names))
    println(Lambdas3().processNumbers(numbers))
    val lambdas4 = Lambdas4()
    println(lambdas4.greet("David"))
    val test5 = Lambdas5()
    println(test5.demonstrateCounter())
    val test6 = Lambdas6()
    println(test6.getSquaresOfEvenNumbers(numbers))


}

/*
 * Задача 1: Простая лямбда-функция
 *
 * Создайте лямбда-функцию, которая принимает два целых числа и возвращает их сумму.
 * Затем используйте эту лямбду для вычисления суммы чисел 5 и 7.
 */
class Lambdas1 {
    fun sumWithLambda(): Int {
        val sum: (Int, Int) -> Int = { a, b -> a + b }
        return sum(5, 7)
    }
}

/*
 * Задача 2: Функция высшего порядка с лямбдой
 *
 * Создайте функцию высшего порядка, которая принимает список строк и лямбда-функцию для фильтрации.
 * Функция должна возвращать список строк, для которых лямбда-функция возвращает true.
 *
 * Используйте эту функцию для фильтрации списка строк, оставив только те, длина которых больше 5 символов.
 */
class Lambdas2 {
    fun filterStrings(strings: List<String>, predicate: (String) -> Boolean): List<String> {
        return strings.filter(predicate)
    }
    fun getLongStrings(strings: List<String>): List<String> {
        return filterStrings(strings)
            {it.length > 5}
    }
}

/*
 * Задача 3: Использование стандартных функций высшего порядка
 *
 * Используйте стандартные функции высшего порядка Kotlin (map, filter, reduce)
 * для преобразования списка целых чисел следующим образом:
 * 1. Отфильтруйте только четные числа
 * 2. Умножьте каждое число на 2
 * 3. Найдите сумму всех полученных чисел
 */
class Lambdas3 {
    fun processNumbers(numbers: List<Int>): Int {
        return numbers
            .filter { it % 2 == 0 }
            .map { it * 2 }
            .reduce { acc, num -> acc + num }
    }
}
/*
 * Задача 4: Лямбда с получателем
 *
 * Создайте функцию, которая принимает строку и лямбду с получателем типа StringBuilder.
 * Функция должна создать StringBuilder с исходной строкой, применить к нему лямбду
 * и вернуть результат в виде строки.
 *
 * Используйте эту функцию для добавления префикса "Привет, " и суффикса "!" к имени.
 */
class Lambdas4 {
    fun buildString(initial: String, builder: StringBuilder.() -> Unit): String {
        val stringBuilder = StringBuilder(initial)
        stringBuilder.builder()
        return stringBuilder.toString()
    }

    fun greet(name: String): String {
        return buildString(name) {
            insert(0, "Hi, ")
            append("!")
        }
    }
}
/*
 * Задача 5: Замыкания в лямбдах
 *
 * Создайте функцию, которая возвращает функцию-счетчик.
 * Каждый вызов возвращенной функции должен увеличивать счетчик на 1 и возвращать его значение.
 */
class Lambdas5 {
    fun createCounter(): () -> Int {
        var count = 0
        return {
            count++
            count
        }
    }

    fun demonstrateCounter(): List<Int> {
        val counter = createCounter()
        return listOf(
            counter(),
            counter(),
            counter(),
            counter()
        )
    }
}
/*
 * Задача 6: Функция с несколькими лямбдами
 *
 * Создайте функцию, которая принимает список чисел и две лямбда-функции:
 * - первая лямбда определяет, нужно ли обрабатывать число
 * - вторая лямбда выполняет преобразование числа
 *
 * Функция должна применить преобразование только к тем числам, которые удовлетворяют условию,
 * и вернуть список результатов.
 */
class Lambdas6 {
    fun processWithCondition(
        numbers: List<Int>,
        condition: (Int) -> Boolean,
        transform: (Int) -> Int
    ): List<Int> {
        var result: MutableList<Int> = mutableListOf()
        for (number in numbers) {
            if (condition(number)) {
                result.add(transform(number))
            }
        }
        return result
    }
        fun getSquaresOfEvenNumbers(numbers: List<Int>): List<Int> {
            return processWithCondition(
               numbers,
                condition = {it % 2 == 0},
                transform = { it * it }
            )
        }
    }