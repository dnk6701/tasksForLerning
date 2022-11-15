package com.example.workwithclasses.model

class Herbivores(animalName: String) :
    Animals(animalName) {
        fun drinking(animalName: String){
            println("$animalName пьет воду")
        }

        fun washing(animalName: String){
            println("$animalName купается")
        }
}