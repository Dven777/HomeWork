package com.example.homework

fun main() {
    println(Operator1().performArithmeticOperations(2, 5))
    println(Operator2().compareNumbers(1, 4))
    println(Operator3().demonstrateIncrementDecrement())
    println(Operator4().demonstrateCompoundAssignment(3))
    println(Operator5().performLogicalOperations(true, false))
    println(Operation6().performBitwiseOperations(10, 12))
    println(Operator7().checkRanges(15))
    println(Operator8().useElvisOperator("Sosat"))
    println(Operator9().compareStrings())
    println(Operator10().calculateBMI(69.2, 172.0))
}

/* Задача 1: Арифметические операторы
*
* Создайте метод, который принимает два целых числа и возвращает результат
* всех арифметических операций над ними в виде Map, где ключ - название операции,
* а значение - результат операции.
* Операции: сложение, вычитание, умножение, деление, остаток от деления.
*/
class Operator1 {
    fun performArithmeticOperations(a: Int, b: Int): Map<String, Any> {
        return mapOf(
            "Сложение" to (a + b),
            "Вычитание" to (a - b),
            "Умножение" to (a * b),
            "Деление" to (a / b),
            "Остаток" to (a % b)
        )
    }
}

/* Задача 2: Операторы сравнения
*
* Создайте метод, который принимает два числа и возвращает результат
* всех операций сравнения между ними в виде Map, где ключ - название операции,
* а значение - результат операции (true/false).
* Операции: равно, не равно, больше, меньше, больше или равно, меньше или равно.
*/
class Operator2 {
    fun compareNumbers(a: Int, b: Int): Map<String, Boolean> {
        return mapOf(
            "Равно" to (a == b),
            "Не равно" to (a != b),
            "Больше" to (a > b),
            "Меньше" to (a < b),
            "Больше или равно" to (a >= b),
            "Меньше или равно" to (a <= b),
        )
    }
}

/*
 * Задача 3: Инкремент и декремент
 *
 * Создайте метод, который демонстрирует разницу между префиксным и постфиксным
 * инкрементом/декрементом. Метод должен вернуть Map с результатами операций.
 */
class Operator3 {
    fun demonstrateIncrementDecrement(): Map<String, Int> {
        var c = 10
        return mapOf(
            "Postfikc" to (c++),
            "Prefiks" to (++c),
        )
    }
}

/* Задача 4: Составные операторы присваивания
*
* Создайте метод, который демонстрирует работу составных операторов присваивания.
* Метод должен принимать начальное значение и возвращать Map с результатами
* применения различных составных операторов.
*/
class Operator4 {
    fun demonstrateCompoundAssignment(initial: Int): Map<String, Int> {
        var result: MutableMap<String, Int> = mutableMapOf()
        var value = initial
        var value2 = initial
        result["initial"] = value
        value += value2
        result["+=value"] = value
        value -= value2
        result["-=value"] = value
        value *= value2
        result["*=value"] = value
        value /= value2
        result["/=value"] = value
        return result
    }
}

/*
 * Задача 5: Логические операторы
 *
 * Создайте метод, который принимает два булевых значения и возвращает результат
 * всех логических операций над ними в виде Map.
 * Операции: И (&&), ИЛИ (||), НЕ (!) для каждого значения.
 */
class Operator5 {
    fun performLogicalOperations(a: Boolean, b: Boolean): Map<String, Boolean> {
        return mapOf(
            "Or" to (a || b),
            "And" to (a && b),
            "Not to a" to (!a),
            "Not to b" to (!b),
        )
    }
}

/*
 * Задача 6: Побитовые операции
 *
 * Создайте метод, который принимает два целых числа и возвращает результат
 * всех побитовых операций над ними в виде Map.
 * Операции: И (and), ИЛИ (or), исключающее ИЛИ (xor), инверсия (inv),
 * сдвиг влево (shl), сдвиг вправо (shr).
 */
class Operation6 {
    fun performBitwiseOperations(a: Int, b: Int): Map<String, Int> {
        return mapOf(
            "And" to (a and b),
            "Or" to (a or b),
            "XOR" to (a xor b),
            "Inversion a" to a.inv(),
            "Inversion b" to b.inv(),
            "LeftShift" to (a shl 1),
            "LeftShift" to (b shl 1),
            "RightShift" to (a shr 1),
            "RightShift" to (b shr 1),
        )
    }
}

/*
 * Задача 7: Операторы диапазона
 *
 * Создайте метод, который демонстрирует работу операторов диапазона.
 * Метод должен проверить, входит ли заданное число в различные диапазоны,
 * и вернуть результаты проверок в виде Map.
 */
class Operator7 {
    fun checkRanges(number: Int): Map<String, Boolean> {
        return mapOf(
            "5-15" to (number in 5..15),
            "5-14" to (number in 5 until 15),
            "15-20" to (number in 15 .. 20),
        )
    }
}

/*
 * Задача 8: Оператор Elvis (?:)
 *
 * Создайте метод, который демонстрирует работу оператора Elvis.
 * Метод должен принимать nullable строку и возвращать:
 * - саму строку, если она не null
 * - строку "Значение не указано", если входная строка null
 */
class Operator8 {
    fun useElvisOperator(input: String?): String {
        return input ?: "znachenie ne ykazano"
    }
}

/*
 * Задача 9: Сравнение строк
 *
 * Создайте метод, который демонстрирует разницу между операторами == и === при сравнении строк.
 * Метод должен вернуть Map с результатами различных сравнений.
 */
class Operator9 {
    fun compareStrings(): Map<String, Boolean> {
        var result: MutableMap<String, Boolean> = mutableMapOf()
        var value = "Sosi pisu"
        var value2 = value
        result["=="] = value == value2
        result["==="] = value === value2
        return result
    }
}

/*
 * Задача 10: Комплексная задача с операторами
 *
 * Создайте метод, который вычисляет индекс массы тела (ИМТ) человека
 * и определяет категорию веса. Метод должен принимать вес (в кг) и рост (в метрах)
 * и возвращать Map с результатами:
 * - ИМТ (вес / (рост * рост))
 * - Категория веса:
 *   - "Недостаточный вес" если ИМТ < 18.5
 *   - "Нормальный вес" если ИМТ >= 18.5 и ИМТ < 25
 *   - "Избыточный вес" если ИМТ >= 25 и ИМТ < 30
 *   - "Ожирение" если ИМТ >= 30
 */
class Operator10 {
    fun calculateBMI(weight: Double, height: Double): Map<String, Any> {
        val imt = weight / (height * height)
        val category = when {
            imt < 18.5 -> "Nedostatochniy Ves"
            imt >= 18.5 && imt < 25 -> "Normalniy Ves"
            imt >= 25 && imt < 30 -> "Izbitochiy Ves"
            else -> "Biggy"
        }
        return mapOf(
            "IMT" to imt,
            "category" to category
        )
    }
}

