import Interfaces.Flyable
import Interfaces.Walkable
import Interfaces.Swimmable

class Zoo {
    private var listAnimal: MutableList<Animal> = mutableListOf()

    fun addAnimal(animal: Animal) {
        listAnimal.add(animal)
    }

    fun showAllSounds() {
        for (i in listAnimal.indices) {
            listAnimal[i].makeSound()
        }
    }

    fun feedAll() {
        for (i in listAnimal.indices) {
            listAnimal[i].eat()
        }
    }

    fun showAllActions() {
        for (animal  in listAnimal) {
            if (animal is Flyable) animal.fly()
            if (animal is Walkable) animal.walk()
            if (animal is Swimmable) animal.swim()
        }
    }
}