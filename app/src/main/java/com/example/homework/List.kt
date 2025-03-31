package com.example.homework
/*1: Сумма чисел от 1 до N
Условие:
Напишите функцию calculateSum(n: Int): Int, которая принимает целое положительное число n и возвращает сумму всех целых чисел от 1 до n включительно.
Пример работы функции:
CopycalculateSum(5) должна вернуть 15
calculateSum(10) должна вернуть 55
Пояснение:
Для n = 5: 1 + 2 + 3 + 4 + 5 = 15
Для n = 10: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55*/


fun main() {
    println(calculateSum(5))
    println(calculateSum(10))
    println(сopyfindEvenNumbers(intArrayOf(1, 2, 3, 4, 5, 6)))
    println(сopyfindEvenNumbers(intArrayOf(5, 7, 9)))
    println(calculateFactorial(6))

    println(reverseArray(intArrayOf(1, 2, 3, 4, 5)).toList())

    println(sumOfDigits(1234))
    println(findPrimeNumbers(20))
}

fun calculateSum(n: Int): Int {
    var result = 0

    for (i in 1..n) { //1, 2, 3, 4, 5
        result += i
    }
    return result
}
/*
Поиск четных чисел
Условие:
Напишите функцию findEvenNumbers(array: IntArray): List<Int>, которая принимает массив целых чисел
и возвращает список всех четных чисел из этого массива.

Пример работы функции:
CopyfindEvenNumbers(intArrayOf(1, 2, 3, 4, 5, 6)) должна вернуть [2, 4, 6]
findEvenNumbers(intArrayOf(7, 11, 15)) должна вернуть []
Пояснение:
Функция должна пройтись по всем элементам массива и выбрать только те,
 которые делятся на 2 без остатка (то есть, четные числа).*/


fun сopyfindEvenNumbers(array1: IntArray): List<Int> {
    var result: MutableList<Int> = mutableListOf() // result = []
    for (i in array1) {  // i = [i, i, i, i, i...]
        if (i % 2 == 0) {
            result.add(i)
        }
    }
    return result
}

/*Задача 3: Факториал числа
Условие:
Напишите функцию calculateFactorial(n: Int): Long, которая принимает целое неотрицательное число n и возвращает его факториал.
Факториал числа n (обозначается n!) – это произведение всех положительных целых чисел от 1 до n включительно.
По определению, 0! = 1.
Пример работы функции:
CopycalculateFactorial(5) должна вернуть 120
calculateFactorial(0) должна вернуть 1
Пояснение:
Для n = 5: 5! = 1 × 2 × 3 × 4 × 5 = 120
Для n = 0: 0! = 1 (по определению)
*/
/// допиши код для случаев если число меньше нуля или больше 0
/// + еще доп задание если интересно посмотри как сделать факториал с использованием
// рекурсивной функции(ты когда нагуглишь что это такое там тебе как пример как раз вычисление факториала дадут)
fun calculateFactorial(n: Int): Long {
    var result: Long = 1
    if (n <= 0) {
        return result
    }
    for (i in 1..n) {
        result *= i
    }

    return result
}

/*Задача 1: Переворот массива
Условие:
Напишите функцию reverseArray(array: IntArray): IntArray, которая принимает массив целых чисел
 и возвращает новый массив, содержащий те же элементы, но в обратном порядке.
  Используйте циклы, а не встроенные функции для разворота массива.
Пример работы функции:
reverseArray(intArrayOf(1, 2, 3, 4, 5)) должна вернуть [5, 4, 3, 2, 1]
reverseArray(intArrayOf(10, 20)) должна вернуть [20, 10]*/
fun reverseArray(array: IntArray): IntArray {
    var result: MutableList<Int> = mutableListOf()
    for (i in array.lastIndex downTo 0) {
        result.add(array[i])
    }
    return result.toIntArray()
}

/*Задача 2: Подсчёт суммы цифр числа
Условие:
Напишите функцию sumOfDigits(number: Int): Int,
которая принимает целое положительное число и возвращает сумму всех его цифр.
Пример работы функции:
sumOfDigits(123) должна вернуть 6
sumOfDigits(9275) должна вернуть 23
*/
fun sumOfDigits(number: Int): Int {
    var sum = 0
    var temp = number
    while (temp != 0) {
        val digit = temp % 10
        sum += digit
        temp /= 10
    }
    return sum
}

/*Задача 3: Поиск простых чисел
Условие:
Напишите функцию findPrimeNumbers(n: Int): List<Int>, которая принимает целое положительное число n
и возвращает список всех простых чисел в диапазоне от 2 до n включительно.
Простое число — это натуральное число больше 1, которое делится без остатка только на 1 и на само себя.
Пример работы функции:
findPrimeNumbers(10) должна вернуть [2, 3, 5, 7]
findPrimeNumbers(20) должна вернуть [2, 3, 5, 7, 11, 13, 17, 19]*/

fun findPrimeNumbers(n: Int): MutableList<Int> {
    var result: MutableList<Int> = mutableListOf()
    for (num in 2..n) {
        for (i in 2..num) {
            if (num % i == 0) {
                if (num == i) result.add(num)
                else break
            }
        }
    }
    return result
}






