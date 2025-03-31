package com.example.homework

import androidx.core.os.registerForAllProfilingResults

fun main() {
    println(Loops1().sumUpTo(11))
    println(Loops2().factorial(5))
    println(Loops3().fibonacci(20))
    println(Loops4().findPrimes(10))
    println(Loops5().multiplicationTable(0))
    println(Loops6().reverseString("cocat"))
    println(Loops7().findMax(intArrayOf()))
    println(Loops8().isPalindrome("racecar"))
}

/*
 * Задача 1: Сумма чисел
 *
 * Создайте метод, который вычисляет сумму всех чисел от 1 до n (включительно).
 * Используйте цикл for с диапазоном.
 */
class Loops1 {
    fun sumUpTo(n: Int): Int {
        var result = 0
        for (i in 1..n) {
            result += i
        }
        return result
    }
}
/*
 * Задача 2: Факториал
 *
 * Создайте метод, который вычисляет факториал числа n.
 * Факториал числа n (обозначается n!) - это произведение всех положительных целых чисел от 1 до n.
 * Например, 5! = 5 × 4 × 3 × 2 × 1 = 120.
 * Используйте цикл while.
 */

class Loops2 {
    fun factorial(n: Int): Long {
        var result = 1L
        for (i in 1..n) {
            result *= i
        }
        return result
    }
}

/*
 * Задача 3: Числа Фибоначчи
 *
 * Создайте метод, который возвращает n-ое число Фибоначчи.
 * Последовательность Фибоначчи: 0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 * Каждое следующее число равно сумме двух предыдущих.
 * Используйте цикл for.
 */
class Loops3 {
    fun fibonacci(n: Int): Int {
        var result = 0
        for (i in 0..n) {
            result += (i + i)
        }
        return result
    }
}

/*
 * Задача 4: Поиск простых чисел
 *
 * Создайте метод, который находит все простые числа в диапазоне от 2 до n.
 * Простое число - это натуральное число больше 1, которое делится без остатка только на 1 и на само себя.
 * Верните список найденных простых чисел.
 */
class Loops4 {
    fun findPrimes(n: Int): List<Int> {
        var result: MutableList<Int> = mutableListOf()
        for (i in 2..n) {
            if (n % i != 0) {
                result.add(i)
            }
        }
        return result
    }
}

/*
 * Задача 5: Таблица умножения
 *
 * Создайте метод, который генерирует таблицу умножения размером n×n.
 * Верните результат в виде двумерного массива, где элемент [i][j] равен i * j.
 */
class Loops5 {
    fun multiplicationTable(n: Int): Array<IntArray> {
        var result2: Array<IntArray> = Array(5, init = {IntArray(5, init = {0})})
        for (i in 0..n) {
            for (j in 0..n) {
                result2[i][j] = (i + 1) * (j + 1)
            }
        }
        return result2
    }
}
/*
 * Задача 6: Обратный порядок
 *
 * Создайте метод, который принимает строку и возвращает её в обратном порядке.
 * Используйте цикл для обхода символов строки.
 */
class Loops6 {
    fun reverseString(input: String): String {
        var result: CharArray = charArrayOf('d')
        for (i in 0..input.length - 1)
            result.reverse()
        return result.toString()
    }
}

/*
 * Задача 7: Поиск наибольшего элемента
 *
 * Создайте метод, который находит наибольший элемент в массиве целых чисел.
 * Если массив пуст, верните Int.MIN_VALUE.
 */
class Loops7 {
    fun findMax(numbers: IntArray): Int {
        var result: Int = 1
        for (i in numbers) {
            if (numbers.isEmpty()) {
                return Int.MIN_VALUE
            } else
                result = numbers.max()
        }
        return result
    }
}

/*
 * Задача 8: Проверка палиндрома
 *
 * Создайте метод, который проверяет, является ли строка палиндромом.
 * Палиндром - это строка, которая читается одинаково слева направо и справа налево.
 * Игнорируйте регистр букв и небуквенные символы.
 */
class Loops8 {
    fun isPalindrome(input: String): Boolean {
        var result: Boolean = true
        var isTrue: Boolean = true
        var isFalse: Boolean = false
        for (i in input) {
            if (input.reversed() == input) {
                result = isTrue
            } else result = isFalse
        }
        return result
    }
}
/*
 * Задача 9: Пирамида из звездочек
 *
 * Создайте метод, который генерирует пирамиду из звездочек высотой n.
 * Например, для n = 3 результат должен быть:
 *   *
 *  ***
 * *****
 *
 *
 */
/*
class Solution9 {
    fun generatePyramid(n: Int)  {
        // your solution
    }
}*/
/*
 * Задача 10: Сортировка пузырьком
 *
 * Создайте метод, который сортирует массив целых чисел методом пузырька.
 * Метод пузырька - это простой алгоритм сортировки, который многократно проходит по списку,
 * сравнивает соседние элементы и меняет их местами, если они расположены в неправильном порядке.
 */
/*class Solution10 {
    fun bubbleSort(array: IntArray): IntArray {
        // your solution
    }
} */
