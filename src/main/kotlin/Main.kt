package org.example

import Animals.Bear
import Animals.Bird
import Animals.Fish
import Zoo

fun main() {
    val dick = Bird("Скрудж Макдак", 53)
    dick.fly()
    dick.eat()
    dick.behaviour()
    dick.makeSound()
    println()

    val whiteBear = Bear("Сашка", 32)
    whiteBear.walk()
    whiteBear.eat()
    whiteBear.behaviour()
    whiteBear.makeSound()
    println()

    val perch = Fish("Колбаска", 13)
    perch.swim()
    perch.eat()
    perch.behaviour()
    perch.makeSound()
    println()

    val zoo = Zoo()
    zoo.addAnimal(dick)
    zoo.addAnimal(whiteBear)
    zoo.addAnimal(perch)

    zoo.feedAll()
    println()
    zoo.showAllActions()
    println()
    zoo.showAllSounds()
    println()
}




