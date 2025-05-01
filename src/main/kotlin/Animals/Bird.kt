package Animals

import Animal
import Interfaces.Flyable

class Bird(override val name: String, override var age: Int) : Flyable, Animal() {
    override fun fly() {
        println("Птица летает")
    }

    override fun behaviour() {
        println("Улетает на время зимы в теплые края")
    }

    override fun makeSound() {
        println("Квар квар")
    }

    override fun eat() {
        println("Ест траву")
    }
}