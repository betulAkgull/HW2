package com.example.hw2


/*
val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")
Yukarıdaki isimler listesini kullanarak önce harflere göre listeyi sıralayın.
Kullanıcıdan, 1 adet isim isteyin.
Bu isim names listesinde var mı yok mu kontrol edin.
Varsa bu ismi listede arayın, tüm harfleri büyük ve ters çevrilmiş şekilde konsola yazdırın.
 */

fun main() {
    val names = arrayListOf("Sinem", "Ali", "Hümeyra", "Cem", "Gizem")

    val sortedList = names.sorted()

    println("alphabetically sorted list: $sortedList")

    println("Enter a name: ")

    val input = readLine()

    if (input != null && names.contains(input)) {
        val name = input.uppercase().reversed()
        println("name reversed and uppercased: $name")
    } else {
        println("name you entered not found in list.")
    }
}