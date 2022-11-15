package com.example.workwithclasses.model

open class Carnivorous(animalName: String) :
    Animals(animalName) {

    fun lapping(animalName: String){
        println("$animalName умеет лакать!")
    }

    fun rush(animalName: String){
        println("$animalName бросился в атаку!")
    }
}