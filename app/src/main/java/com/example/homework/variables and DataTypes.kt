package com.example.homework

import android.annotation.SuppressLint

fun main() {
    println(Solution1().declareVariables())
    println(Solution2().convertAndDouble("sosat"))
    Solution3().createGreeting("Dven", 28)
    println(Solution4().getStringLength(""))
    println(Solution5().filterEvenNumbers(intArrayOf(1, 2, 3, 4, 5, 6)).toList())
    Solution6().formatUserInfo("Dven", "Putilkovo", "+79777777777")
    println(Solution7().safeSum(1, 1))
    println(Solution8().sumOfStringNumbers(listOf("123asda", "2", "5", "6", "Dven")))
    println(Solution9().convertToUnicode("abc"))
    println(Solution10().formatStudentInfo("Dven", 28, intArrayOf(4, 3, 2, 5, 4), null))

}

/*
*
 * Задача 1: Объявление переменных
 *
 * Создайте метод, который объявляет две переменные:
 * - неизменяемую переменную name типа String со значением "Kotlin"
 * - изменяемую переменную version типа Double со значением 1.5
 *
 * Метод должен вернуть строку в формате "Язык: name, Версия: version"
*/
class Solution1 {
    fun declareVariables(): String {
        val name = "Kotlin"
        val version = 1.5 // your solution
        return "Language: ${name}, Version: $version"
    }
}

/*
 * Задача 2: Преобразование типов
 *
 * Создайте метод, который принимает строку, содержащую число,
 * преобразует её в целое число (Int), умножает на 2 и возвращает результат.
 * Если строка не может быть преобразована в число, метод должен вернуть -1.
 */
class Solution2 {
    fun convertAndDouble(input: String): Int {
        try {
            val midlle = input.toInt()
            val result = (midlle * 2)
            return result
        } catch (e: Exception) {
            return -1
        }
    }
}

/*
 * Задача 3: Работа со строками
 *
 * Создайте метод, который принимает имя и возраст пользователя,
 * а затем возвращает приветственное сообщение в формате:
 * "Привет, {имя}! Через 10 лет тебе будет {возраст + 10} лет."
**/
class Solution3 {
    fun createGreeting(name: String, age: Int): String {
        return "Hi, $name! After 10 years you will be: ${age + 10}"
    }
}

/*
 * Задача 4: Nullable типы
 *
 * Создайте метод, который принимает nullable строку и возвращает:
 * - длину строки, если строка не null
 * - 0, если строка null
 */
class Solution4 {
    fun getStringLength(input: String?): Int {
        return input?.length ?: 0
    }
}

/*
 * Задача 5: Работа с массивами
 *
 * Создайте метод, который принимает массив целых чисел и возвращает
 * новый массив, содержащий только четные числа из исходного массива.
 */
class Solution5 {
    fun filterEvenNumbers(numbers: IntArray): IntArray {
        val result: MutableList<Int> = mutableListOf()
        for (i in numbers) {
            if (i % 2 == 0) {
                result.add(i)
            }
        }
        return result.toIntArray()
    }
}

/*
 * Задача 6: Многострочные строки
 *
 * Создайте метод, который принимает имя, адрес и телефон пользователя,
 * а затем возвращает многострочную строку с этой информацией в формате:
 *
 * Имя: {имя}
 * Адрес: {адрес}
 * Телефон: {телефон}
 */
class Solution6 {
    fun formatUserInfo(name: String, address: String, phone: String): String {
        return """
            Name: $name
            Address: $address
            Phone: $phone
        """
    }
}

/*
 * Задача 7: Безопасная работа с nullable типами
 *
 * Создайте метод, который принимает два nullable целых числа и возвращает:
 * - их сумму, если оба числа не null
 * - первое число, если второе число null
 * - второе число, если первое число null
 * - 0, если оба числа null
 */
class Solution7 {
    fun safeSum(a: Int?, b: Int?): Int {
        var result: Int
        if ((a != null) && (b != null)) {
            result = (a + b)
        } else if (a == null && b != null) {
            return b
        } else if (a != null) {
            return a
        } else {
            return 0
        }
        return result
    }
}

/*
 * Задача 8: Преобразование типов в коллекциях
 *
 * Создайте метод, который принимает список строк, содержащих числа,
 * и возвращает сумму всех чисел. Если какая-то строка не может быть
 * преобразована в число, она должна быть проигнорирована.
 */
class Solution8 {
    fun sumOfStringNumbers(strings: List<String>): Int { // "1", "2", "3", "Dven", "4", "6"
        var result: Int = 0
        for (i in strings) {
            try {
                result += i.toInt()
            } catch (e: Exception) {
                continue
            }
        }
        return result
    }
}

/*
 * Задача 9: Работа с символами
 *
 * Создайте метод, который принимает строку и возвращает новую строку,
 * в которой каждый символ заменен на его код Unicode.
 * Например, "abc" должно превратиться в "979899".
 */
class Solution9 {
    fun convertToUnicode(input: String): String {
        return input.map { it.code }.joinToString("")
    }
}

/*
 * Задача 10: Комплексная задача
 *
 * Создайте метод, который принимает информацию о студенте:
 * - имя (String)
 * - возраст (Int)
 * - оценки (IntArray)
 * - адрес (String, может быть null)
 *
 * Метод должен вернуть строку с информацией о студенте в формате:
 * "Студент: {имя}, Возраст: {возраст}, Средний балл: {средний балл}, Адрес: {адрес или "не указан"}"
 */
class Solution10 {
    fun formatStudentInfo(name: String, age: Int, grades: IntArray, address: String?): String {
        val average = grades.average()
        return "Student: $name, Age: $age, average: $average, adress: ${address ?: "adress is not available"}"
    }
}


