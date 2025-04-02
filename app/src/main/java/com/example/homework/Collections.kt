package com.example.homework

fun main() {
val numbers = listOf(1, 2, 3 ,4 ,5 ,6 ,7, 8, 9, 10)
    val test1 = Collections1()
    println(test1.demonstrateFilterEvenNumbers())
    val test2 = Collections2()
    println(test2.demonstrateSetOperations())
    val test3 =Collections3()
    println(test3.demonstrateCountOccurrences())
    val test4 = Collections4()
    println(test4.demonstrateGetStringLengths())
    val test5 = Collections5()
    println(test5.demonstrateSumOfSquares())
    var test6 = Collections6()
    println(test6.demonstrateGrouping())
    var test7 = Collections7()
    println(test7.demonstrateSorting())


}
/*
 * Задача 1: Списки (List)
 *
 * Создайте функцию, которая принимает список целых чисел и возвращает новый список,
 * содержащий только четные числа из исходного списка.
 */
class Collections1 {
    fun filterEvenNumbers(numbers: List<Int>): List<Int> {
        return numbers.filter { it % 2 == 0 }
    }
    fun demonstrateFilterEvenNumbers(): List<Int> {
        val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        return filterEvenNumbers(numbers)
    }
}
/*
 * Задача 2: Множества (Set)
 *
 * Создайте функцию, которая принимает два множества строк и возвращает:
 * - объединение множеств
 * - пересечение множеств
 * - разность множеств (первое минус второе)
 */
class Collections2 {
    fun setOperations(set1: Set<String>, set2: Set<String>): Map<String, Set<String>> {
        return mapOf(
            "Union" to  (set1 + set2),
            "Intersection" to set1.filter { set2.contains(it) }.toSet(),
            "difference" to set1.filterNot { set2.contains(it) }.toSet(),
        )
    }

    // Пример использования функции
    fun demonstrateSetOperations(): Map<String, Set<String>> {
        val setA = setOf("apple", "banana", "orange", "kiwi")
        val setB = setOf("banana", "kiwi", "pineapple", "grape")
        return setOperations(setA,setB)
    }
}
/*
 * Задача 3: Словари (Map)
 *
 * Создайте функцию, которая принимает список строк и возвращает Map,
 * где ключами являются строки, а значениями - количество их повторений в списке.
 */
class Collections3 {
    fun countOccurrences(words: List<String>): Map<String, Int> {
        return words.groupingBy { it }.eachCount()
    }

    // Пример использования функции
    fun demonstrateCountOccurrences(): Map<String, Int> {
        var words = listOf("David", "Ura", "Demon", "Oleg", "David", "Oleg", "Oleg","Olga,","Dava")
        return countOccurrences(words)
    }
}
/*
 * Задача 4: Преобразование коллекций
 *
 * Создайте функцию, которая принимает список строк и возвращает новый список,
 * содержащий длины каждой строки из исходного списка.
 */
class Collections4 {
    fun getStringLengths(strings: List<String>): List<Int> {
        var string: MutableList<Int> = mutableListOf()
        for (i in strings) {
            string.add(i.length)
            }
        return string
        }

    fun demonstrateGetStringLengths(): List<Int> {
        return getStringLengths(listOf("Dven", "Ura", "Oleg", "Dambldor"))
    }
}
/*
 * Задача 5: Фильтрация и преобразование
 *
 * Создайте функцию, которая принимает список целых чисел и возвращает сумму
 * квадратов всех чисел, которые больше 10.
 */
class Collections5 {
    fun sumOfSquaresGreaterThanTen(numbers: List<Int>): Int {
        return numbers
            .filter { it > 10 }
            .map { it * it }
            .sum()
    }

    // Пример использования функции
    fun demonstrateSumOfSquares(): Int {
        val numbers = listOf(10, 20, 30, 40, 5, 6, 7, 8, 9, 10)
        return sumOfSquaresGreaterThanTen(numbers)
    }
}
/*
 * Задача 6: Группировка
 *
 * Создайте класс Student с свойствами name (String) и grade (Int).
 * Создайте функцию, которая принимает список студентов и группирует их по оценкам.
 */
class Collections6 {
    data class Student(val name: String, val grade: Int)

    fun groupStudentsByGrade(students: List<Student>): Map<Int, List<Student>> {
        return students.groupBy { it.grade }
    }

    // Пример использования функции
    fun demonstrateGrouping(): Map<Int, List<String>> {
        val students = listOf(
            Student("Aleksey", 5),
            Student("Mariya", 4),
            Student("Ivan", 5),
            Student("Elena", 3),
            Student("Dmitriy", 4)
        )
        return groupStudentsByGrade(students)
            .mapValues { (_, students) -> students.map { it.name } }
    }
}
/*
 * Задача 7: Сортировка
 *
 * Создайте класс Product с свойствами name (String) и price (Double).
 * Создайте функцию, которая принимает список продуктов и возвращает новый список,
 * отсортированный по цене (по возрастанию).
 */
class Collections7 {
    data class Product(val name: String, val price: Double)

    fun sortProductsByPrice(products: List<Product>): List<Product> {
        return products.sortedBy { it.price }
    }


    fun demonstrateSorting(): List<String> {
        val products = listOf(
        Product("Qiwi", 120.0),
        Product("Milk", 40.0),
        Product("Water", 25.0),
        )
        val sortedProducts = sortProductsByPrice(products)
        return sortedProducts.map {
            "${it.name} = ${it.price} rub"
        }
    }
}