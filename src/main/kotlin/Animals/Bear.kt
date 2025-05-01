package Animals

import Animal
import Interfaces.Walkable

class Bear(override val name: String, override var age: Int) : Walkable, Animal() {
    override fun walk() {
        println("Медведь ходит")
    }

    override fun behaviour() {
        println("Впадает в зимнюю спячку")
    }

    override fun makeSound() {
        println("РРРРРРРРРРРР")
    }

    override fun eat() {
        println("Ест мясо")
    }
}