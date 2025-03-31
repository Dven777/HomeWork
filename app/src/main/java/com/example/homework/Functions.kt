package com.example.homework

import kotlin.math.absoluteValue

fun main() {
    val a = 5
    val b = 6
    val c = 3
println(Functions1().sum(5, 6))
println(Functions2().greet("David", "Privet", "!"))
println(Functions3().average(5, 5, 4, 5, 4))
println(Functions4().isEven(12))
    var text = "David"
    println(text.countVowels())
val num = listOf(1, 2, 3 ,4 ,5)
    println(Functions6().filter(num, {it % 2 == 0}))
    println(b isDivisibleBy c)
    println(Functions8().gcd(16, 24))
    println(Functions9().formatPersonInfo(
        "David",
        28,
        "Moscow"))
    println(Functions10().fibonacci(9))
}
/* Задача 1: Простая функция
*
* Создайте функцию, которая принимает два целых числа и возвращает их сумму.
*/
class Functions1 {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }
}
/*
 * Задача 2: Функция с параметрами по умолчанию
 *
 * Создайте функцию, которая приветствует пользователя. Функция должна принимать:
 * - имя пользователя (обязательный параметр)
 * - приветствие (параметр по умолчанию "Привет")
 * - знак препинания (параметр по умолчанию "!")
 *
 * Функция должна возвращать строку в формате: "{приветствие}, {имя}{знак препинания}"
 */
class Functions2 {
    fun greet(name: String, greeting: String = "Привет", punctuation: String = "!"): String {
        var result = "$greeting, ${name + punctuation}"
        return result
    }
}
/*
 * Задача 3: Функция с переменным числом аргументов (vararg)
 *
 * Создайте функцию, которая принимает переменное число целых чисел и возвращает их среднее арифметическое.
 * Если аргументы не переданы, функция должна вернуть 0.0.
 */
class Functions3 {
    fun average(vararg numbers: Int): Double {
        var result: Double = 0.0
        var average1: Double = 0.0
        for (num in numbers) {
            result += num
            average1 = result / numbers.size
        }
        return average1
    }
}
/*
 * Задача 4: Однострочная функция
 *
 * Создайте функцию, которая проверяет, является ли число четным.
 * Используйте синтаксис однострочной функции (без фигурных скобок и оператора return).
 */
class Functions4 {
    fun isEven(number: Int): Boolean = number % 2 == 0
}
/*
 * Задача 5: Функция-расширение
 *
 * Создайте функцию-расширение для класса String, которая подсчитывает количество гласных букв в строке.
 * Гласными считаются буквы: a, e, i, o, u (в любом регистре).
 */
fun String.countVowels(): Int {
    var registr = setOf('a', 'e', 'i', 'o', 'u')
    return this.lowercase().count { it in registr }
}
/*
 * Задача 6: Функция высшего порядка
 *
 * Создайте функцию высшего порядка, которая принимает список целых чисел и функцию-предикат.
 * Функция должна возвращать список чисел, для которых предикат возвращает true.
 */
class Functions6 {
    fun filter(numbers: List<Int>, predicate: (Int) -> Boolean): List<Int> {
        val result = numbers
            .filter { it % 2 == 0 }
        return result
    }
}
/*
 * Задача 7: Инфиксная функция
 *
 * Создайте инфиксную функцию-расширение для класса Int, которая проверяет,
 * делится ли одно число на другое без остатка.
 */
    infix fun Int.isDivisibleBy(divisor: Int): Boolean {
        require(divisor != 0)
        return this % divisor == 0
    }
/*
 * Задача 8: Локальные функции
 *
 * Создайте функцию, которая находит наибольший общий делитель (НОД) двух чисел.
 * Используйте локальную функцию для реализации алгоритма Евклида.
 */
class Functions8 {
    fun gcd(a: Int, b: Int): Int {
        fun calculateGcd(x: Int, y: Int): Int {
            return if (y == 0) x else calculateGcd(y, x % y)
        }
        return calculateGcd(a.absoluteValue, b.absoluteValue)
    }
}
/*
 * Задача 9: Функция с именованными аргументами
 *
 * Создайте функцию, которая форматирует информацию о человеке.
 * Функция должна принимать имя, возраст и город (все параметры обязательные).
 * Верните строку в формате: "Имя: {имя}, Возраст: {возраст}, Город: {город}".
 *
 * Продемонстрируйте вызов этой функции с использованием именованных аргументов.
 */
class Functions9 {
    fun formatPersonInfo(name: String, age: Int, city: String): String {
        return ("name = $name, age = $age, city = $city")
    }
}
/*
 * Задача 10: Рекурсивная функция
 *
 * Создайте рекурсивную функцию для вычисления чисел Фибоначчи.
 * Функция должна принимать целое число n и возвращать n-ое число Фибоначчи.
 *
 * Примечание: для больших значений n рекурсивное решение может быть неэффективным.
 * Для учебных целей ограничимся небольшими значениями n.
 */
class Functions10 {
    fun fibonacci(n: Int): Int {
        return if (n <= 1) {
            n
        } else {
            fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}