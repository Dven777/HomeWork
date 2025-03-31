package com.example.homework
fun main() {
   /* Задача: Дан список студентов с их оценками. Необходимо:
    1. Найти всех студентов с средним баллом выше 4.5
    2. Отсортировать их по убыванию среднего балла
            3. Вернуть список их имен в верхнем регистре*/

    val students = listOf(
        Student("Anna", listOf(5.0, 4.8, 4.9)),
        Student("Ivan", listOf(4.2, 4.3, 4.1)),
        Student("Mariya", listOf(5.0, 5.0, 4.8))
    )
println(findTopStudents(students))


    // findTopStudents(students)

}
data class Student(val name: String, val grades: List<Double>)

fun findTopStudents(students: List<Student>): List<String> {
  return students.map { student -> Pair(student.name, student.grades.average())}
      .filter { pair -> pair.second > 4.5 }
      .sortedBy { pair -> pair.second }
      .map { pair -> pair.first.uppercase()}


}














//  getAverageScore(grades: List<Double>) {
 // val avg = grades.average()
 //   println(avg)




