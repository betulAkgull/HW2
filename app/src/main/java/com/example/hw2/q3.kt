package com.example.hw2

/*
Soru 3
data class Student(val name: String, val age: Int, val school: String)

val students = arrayListOf(
    Student("Ahmet", 20, "Üniversite A"),
    Student("Ayşe", 27, "Üniversite B"),
    Student("Mehmet", 22, "Üniversite C"),
    Student("Fatma", 28, "Üniversite A"),
    Student("Ali", 29, "Üniversite B"),
    Student("Feyza", 24, "Üniversite A"),
    Student("Berkay", 22, "Üniversite B"),
    Student("Caner", 26, "Üniversite A")
)
İlk olarak en büyük ve en küçük yaşa sahip olan öğrencinin ismini ve kaçıncı indexte olduğunu konsola yazdırın.
Listede school değeri Üniversite A olanları filtreleyin.
Filtreleme işleminden dönen listeyi yaşları 25’ten büyükler ve küçükler olarak alt alta konsola yazdırın.
*/

data class Student(val name: String, val age: Int, val school: String)

fun main(){

    val students = arrayListOf(
        Student("Ahmet", 20, "Üniversite A"),
        Student("Ayşe", 27, "Üniversite B"),
        Student("Mehmet", 22, "Üniversite C"),
        Student("Fatma", 28, "Üniversite A"),
        Student("Ali", 29, "Üniversite B"),
        Student("Feyza", 24, "Üniversite A"),
        Student("Berkay", 22, "Üniversite B"),
        Student("Caner", 26, "Üniversite A")
    )

    println("Oldest student name -> ${students.maxBy{ it.age}.name} , Index: ${students.indexOf(students.maxBy{ it.age})}")
    println("Youngest student name -> ${students.minBy{ it.age}.name} , Index: ${students.indexOf(students.minBy{ it.age})}")


    println("Students attending University A older than 25: ${students.filter { it.school == "Üniversite A" && it.age > 25 }.map { it.name }}")
    println("Students attending University A younger than 25: ${students.filter { it.school == "Üniversite A" && it.age < 25 }.map { it.name }}")
    

}