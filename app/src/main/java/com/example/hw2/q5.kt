package com.example.hw2

/*Soru 5
data class Workers(val name: String, val salary: Double)

val workers = arrayListOf(
    Workers("Ahmet Yılmaz", 15000.0),
    Workers("Ayşe Kaya", 32000.0),
    Workers("Mehmet Demir", 29000.0),
    Workers("Fatma Şahin", 18500.0)
)
Yukarıdaki işçiler listesini kullanarak her çalışana %35 zam yapın.
Listeyi karıştırıp maaş değerine göre küçükten büyüğe sıralayın.
En yüksek ve en düşük maaş alanları konsola yazdırın.
Maaş ortalamasını hesaplayıp konsola yazdırın.*/

data class Workers(val name: String, val salary: Double)

fun main() {
    val workers = arrayListOf(
        Workers("Ahmet Yılmaz", 15000.0),
        Workers("Ayşe Kaya", 32000.0),
        Workers("Mehmet Demir", 29000.0),
        Workers("Fatma Şahin", 18500.0)
    )

    val raisedSalaries = workers.map { Workers(it.name, it.salary + it.salary * 35 / 100) }
    println(
        "Raised Salaries -> ${
            raisedSalaries.shuffled()
                .sortedBy { it.salary }
        }"
    )

    println("Highest Salary: ${raisedSalaries.maxBy { it.salary }.name}")
    println("Lowest Salary: ${raisedSalaries.minBy { it.salary }.name}")

    println("Average Salary: ${raisedSalaries.sumOf { it.salary }.div(workers.size)}")
}