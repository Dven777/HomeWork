package com.example.homework

import androidx.core.text.isDigitsOnly

fun main() {
    println(Conditionals1().checkAge(29))
    println(Conditionals2().getDayOfWeek(3))
    println(Conditionals3().checkNumber(5))
    println(Conditionals4().getGrade(80))
    println(Conditionals5().checkString("racecar"))
    println(Conditionals6().safeOperation(0, null))
    println(Conditionals7().describeType(true))
    println(Conditionals8().getTimeOfDay(25))
    println(Conditionals9().checkPassword("pizdataya123"))
    println(Conditionals9().checkPassword("pizda"))
    println(Conditionals9().checkPassword("pizdataya123!"))
    println(Conditionals9().checkPassword("1234342423"))
    println(Conditionals9().checkPassword("pizdataya"))
    println(Conditionals10().calculate(2.0, 0.0, "/"))
}

/*
 * Задача 1: Простое условие
 *
 * Создайте метод, который принимает возраст человека и возвращает строку:
 * - "Несовершеннолетний", если возраст меньше 18
 * - "Совершеннолетний", если возраст от 18 до 65
 * - "Пенсионер", если возраст больше 65
 */
class Conditionals1 {
    fun checkAge(age: Int): String {
        var result: String = ""
        if (age < 18) {
            result = "Nesovershennoletniy"
        }
        if (age in 18..65) {
            result = "Covershennoletniy"
        }
        if (age > 65) {
            result = "Pensioner"
        }
        return result
    }
}

/*
 * Задача 2: Использование when
 *
 * Создайте метод, который принимает день недели (число от 1 до 7) и возвращает:
 * - Название дня недели на русском языке
 * - "Некорректный день", если число не входит в диапазон от 1 до 7
 */
class Conditionals2 {
    fun getDayOfWeek(day: Int): String {
        val dayOfWeek = day
        var dayName = when (dayOfWeek) {
            1 -> "Ponedelnik"
            2 -> "Vtornik"
            3 -> "Creda"
            4 -> "4etverg"
            5 -> "Pyatnica"
            6 -> "Cybbota"
            7 -> "Vockrecen6e"
            else -> "Xuynu ne pishi Pidr"
        }
        return dayName
    }
}

/* Задача 3: Проверка числа
*
* Создайте метод, который принимает целое число и возвращает строку:
* - "Положительное", если число больше 0
* - "Отрицательное", если число меньше 0
* - "Ноль", если число равно 0
*
* Дополнительно, добавьте к результату " четное" или " нечетное",
* если число не равно 0.
*/
class Conditionals3 {
    fun checkNumber(number: Int): String {
        val check = when {
            number > 0 -> "Polozhitelnoe"
            number < 0 -> "Otricatelnoe"
            number == 0 -> "Nol6"
            number != 0 -> "Ne ravno 0"
            else -> "Error"
        }
        val chet = when {
            number % 2 != 0 -> "Ne chetnoe"
            number % 2 == 0 -> "Chetnoe"
            else -> "Error2"
        }
        return check + chet
    }
}

/*
 * Задача 4: Оценка по баллам
 *
 * Создайте метод, который принимает количество баллов (от 0 до 100)
 * и возвращает оценку по следующей шкале:
 * - "A": 90-100 баллов
 * - "B": 80-89 баллов
 * - "C": 70-79 баллов
 * - "D": 60-69 баллов
 * - "F": менее 60 баллов
 * - "Некорректный балл", если число не входит в диапазон от 0 до 100
 */
class Conditionals4 {
    fun getGrade(score: Int): String {
        var grade = when (score) {
            in 90..100 -> "A"
            in 80..89 -> "B"
            in 70..79 -> "C"
            in 60..69 -> "D"
            in 60 downTo 0 -> "F"
            else -> "Necorectniy ball"
        }
        return grade
    }
}

/*
 * Задача 5: Проверка строки
 *
 * Создайте метод, который принимает строку и возвращает:
 * - "Пустая строка", если строка пуста
 * - "Односимвольная строка: X", если строка содержит только один символ X
 * - "Палиндром", если строка читается одинаково слева направо и справа налево (без учета регистра)
 * - "Обычная строка", во всех остальных случаях
 */
class Conditionals5 {
    fun checkString(input: String): String {
        var check = when {
            input == null -> "Nullable String"
            input.isEmpty() -> "Pustaya Stroka"
            input.length == 1 -> "Odnosimvolnaya ctroka"
            input.reversed() == input -> "Palindrom"
            else -> "Obichnaya ctroka"
        }
        return check
    }
}

/*
 * Задача 6: Безопасная работа с null
 *
 * Создайте метод, который принимает два nullable целых числа и возвращает:
 * - "Оба значения равны null", если оба аргумента null
 * - "Первое значение равно null", если только первый аргумент null
 * - "Второе значение равно null", если только второй аргумент null
 * - "Сумма: X", где X - сумма двух чисел, если оба аргумента не null
 */
class Conditionals6 {
    fun safeOperation(a: Int?, b: Int?): String {
        var x = 4
        return when {
            a == null && b == null -> "Oba znacheniya ravni null"
            a == null && b != null -> "Pervoe znachenie ravno null"
            b == null && a != null -> "Vtoroe znachenie ravno null"
            a != null && b != null -> "Cymma: ${a + b}"
            else -> "Error"
        }
    }
}

/*
 * Задача 7: Проверка типа с when и is
 *
 * Создайте метод, который принимает объект типа Any и возвращает строку,
 * описывающую тип объекта и его значение:
 * - "Целое число: X", если объект типа Int
 * - "Строка длиной X: Y", если объект типа String, где X - длина строки, Y - сама строка
 * - "Логическое значение: X", если объект типа Boolean
 * - "Список размером X", если объект типа List<*>, где X - размер списка
 * - "Неизвестный тип", для всех остальных типов
 */
class Conditionals7 {
    fun describeType(obj: Any): String {
        return when {
            obj is Int -> "Celoe 4islo: $obj"
            obj is String -> "Stroka dlinnoy: ${obj.length}: $obj"
            obj is Boolean -> "Logicheckoe znachenie: $obj"
            obj is List<*> -> "Cpicok razmerom ${obj.size}"
            else -> "Neizvestniy Type"
        }
    }
}

/*
 * Задача 8: Определение времени суток
 *
 * Создайте метод, который принимает час (от 0 до 23) и возвращает время суток:
 * - "Ночь", если час от 0 до 5
 * - "Утро", если час от 6 до 11
 * - "День", если час от 12 до 17
 * - "Вечер", если час от 18 до 23
 * - "Некорректное время", если час не входит в диапазон от 0 до 23
 */
class Conditionals8 {
    fun getTimeOfDay(hour: Int): String {
        return when (hour) {
            in 0..5 -> "Noch"
            in 6..11 -> "Ytro"
            in 12..17 -> "Den6"
            in 18..23 -> "Vecher"
            else -> "Necorectnoe vremya"
        }
    }
}

/*
 * Задача 9: Проверка пароля
 *
 * Создайте метод, который проверяет надежность пароля и возвращает:
 * - "Слишком короткий", если длина пароля меньше 8 символов
 * - "Слабый", если пароль содержит только буквы или только цифры
 * - "Средний", если пароль содержит буквы и цифры
 * - "Сильный", если пароль содержит буквы, цифры и специальные символы (не буквы и не цифры)
 */
class Conditionals9 {
    fun checkPassword(password: String): String {
        val chars = Regex("[a-zA-Z]")
        var digitCase = Regex("\\d") // \d - любое число
        var specSymbols = Regex("[!@#\$%^&*(),.?\":{}|<>]")
        return when {
            password.length < 8 -> "too short"
            password.contains(chars) && !password.contains(digitCase) -> "too weak password"
            !password.contains(chars) && password.contains(digitCase) -> "too weak password"
            password.contains(chars) && password.contains(digitCase) && !password.contains(
                specSymbols
            ) -> "middle password"

            password.contains(chars) && password.contains(digitCase) && password.contains(
                specSymbols
            ) -> "Strong password"

            else -> password
        }
    }
}
/*
 * Задача 10: Калькулятор
 *
 * Создайте метод, который принимает два числа и операцию (+, -, *, /) в виде строки,
 * и возвращает результат операции в виде строки.
 * Если операция деления и второе число равно 0, верните "Деление на ноль".
 * Если передана неизвестная операция, верните "Неизвестная операция".
 */
class Conditionals10 {
    fun calculate(a: Double, b: Double, operation: String): String {
        return when (operation) {
            "+" -> ((a + b).toString())
            "-" -> ((a - b).toString())
            "*" -> ((a * b).toString())
            "/" -> ((a / b)).toString()
            else -> "Unknown operation"
        }
    }
}