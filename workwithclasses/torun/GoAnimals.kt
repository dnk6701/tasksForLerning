package com.example.workwithclasses.torun
import com.example.workwithclasses.model.Carnivorous
import com.example.workwithclasses.model.Herbivores

fun main(){
//    val carnList:List<Carnivorous> = listOf("Тигр", "Орёл", "Акула")
    val animal1 = Carnivorous("Акула")
    val animal2 = Carnivorous("Тигр")
    val animal3 = Carnivorous("Орёл")
    val animal4 = Herbivores("Лебедь")
    val animal5 = Herbivores("Антилопа")
    val animal6 = Herbivores("Слон")

    val carnList:List<Carnivorous> = listOf(animal1, animal2, animal3)
    val herbiList:List<Herbivores> = listOf(animal4, animal5, animal6)

    println("Травоядные: $herbiList")
//    println("Плотоядные: $carnList")
}