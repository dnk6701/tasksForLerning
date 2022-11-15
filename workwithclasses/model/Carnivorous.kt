package com.example.workwithclasses.model

open class Carnivorous(animalName: String) :
    Animals(animalName) {
    var limb:String = "" // конечности: ноги, крылья и хвосты
    var envOfLiving:String = "" // среда обитания: вода, земля, воздух

    fun lapping() {
        println("$animalName умеет лакать")
    }

    fun rush() {
        println("$animalName бросился в атаку!")
    }
}