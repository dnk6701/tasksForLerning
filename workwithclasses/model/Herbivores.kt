package com.example.workwithclasses.model

class Herbivores(animalName: String) :
    Animals(animalName) {
        var limb:String = "" // конечности: ноги, крылья и хвосты
        var envOfLiving:String = "" // среда обитания: вода, земля, воздух

        fun drinking() {
            println("$animalName пьет воду")
        }

        fun washing() {
            println("$animalName купается")
        }
}