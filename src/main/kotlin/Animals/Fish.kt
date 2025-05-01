package Animals

import Animal
import Interfaces.Swimmable

class Fish(override val name: String, override var age: Int) : Swimmable, Animal() {
    override fun swim() {
        println("Рыба плавает")
    }

    override fun behaviour() {
        println("Плавает по океану")
    }

    override fun makeSound() {
        println("Бульк бульк")
    }

    override fun eat() {
        println("Ест водоросли")
    }
}
