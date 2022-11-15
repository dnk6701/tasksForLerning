package com.example.workwithclasses.torun
import com.example.workwithclasses.model.Carnivorous
import com.example.workwithclasses.model.Herbivores
import kotlin.reflect.full.memberProperties

fun main(){
//    val carnList:List<Carnivorous> = listOf("Тигр", "Орёл", "Акула")
    val animal1 = Carnivorous("Акула")
    animal1.limb = "Хвосты"
    animal1.envOfLiving = "Вода"
    val animal2 = Carnivorous("Тигр")
    animal2.limb = "Ноги"
    animal2.envOfLiving = "Земля"
    val animal3 = Carnivorous("Орёл")
    animal3.limb = "Крылья"
    animal3.envOfLiving = "Воздух"
    val animal4 = Herbivores("Лебедь")
    animal4.limb = "Крылья"
    animal4.envOfLiving = "Воздух"
    val animal5 = Herbivores("Антилопа")
    animal5.limb = "Ноги"
    animal5.envOfLiving = "Земля"
    val animal6 = Herbivores("Слон")
    animal6.limb = "Ноги"
    animal6.envOfLiving = "Земля"

    val carnList:List<Carnivorous> = listOf(animal1, animal2, animal3)
    val herbiList:List<Herbivores> = listOf(animal4, animal5, animal6)

    println("Травоядные: ")
//    print("$animal4.animalName $animal5.animalName $animal6.animalName")
    for(property in Herbivores::class.memberProperties)
    {for (i:Int in 0..2) println(property.get(herbiList[i]))}

        println("")

    println("Плотоядные: ")
    for(property in Carnivorous::class.memberProperties)
    {for (i:Int in 0..2) println(property.get(carnList[i]))}
//    println("Плотоядные: $carnList")
    println("")

    animal2.lapping()
    animal3.rush()
    animal6.washing()
    animal4.drinking()

    println(" У ${animal2.animalName} конечности - ${animal2.limb}")
    println("А у ${animal4.animalName} - ${animal4.limb}")

    println("${animal3.animalName} живет в среде ${animal3.envOfLiving}")
    println("А у ${animal5.animalName} среда обитания - ${animal5.envOfLiving}")



}