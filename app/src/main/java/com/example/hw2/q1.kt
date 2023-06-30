package com.example.hw2

fun main(){
    val names = arrayListOf("Eda", "Ali", "Neriman", "Cem", "Gizem")

    println("Enter 3 names with comma in between them")
    val input = readLine()

    if(!input.isNullOrEmpty()){

        val newNames = input.split(",").map{it.trim()}
        if(newNames.isNotEmpty()){
            names.addAll(newNames)
            print(names)}
    }else{
        println("is blank, try again.")
    }
}