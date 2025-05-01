# 🐾 Animal Zoo Simulation in Kotlin

## Описание
Проект на Kotlin, демонстрирующий поведение животных с использованием объектно-ориентированного программирования.  
Животные обладают базовыми свойствами и индивидуальным поведением: издают звуки, едят, передвигаются.

В проекте реализованы:
- абстрактный класс `Animal`,
- интерфейсы поведения (`Flyable`, `Swimmable`, `Walkable`),
- классы `Bird`, `Bear`, `Fish`,
- менеджер `Zoo`, управляющий всеми животными,
- демонстрация полиморфизма через `is` и `when`.
  
---
## Архитектура
### `Animal` (абстрактный класс)
- Свойства: `name`, `age`
- Методы:
  - `makeSound()`
  - `eat()`
  - `behaviour()`

### Интерфейсы:
- `Flyable` — метод `fly()`
- `Walkable` — метод `walk()`
- `Swimmable` — метод `swim()`

### Классы:
- `Bird` реализует `Flyable`
- `Bear` реализует `Walkable`
- `Fish` реализует `Swimmable`

### `Zoo`
- Хранит список животных
- Методы:
  - `addAnimal(animal)`
  - `feedAll()`
  - `showAllSounds()`
  - `showAllActions()` (через интерфейсы и `is`)

 ## UML-диаграмма

```mermaid
classDiagram
    class Animal {
        <<abstract>>
        +String name
        +Int age
        +eat()
        +makeSound()
        +behaviour()
    }

    class Bird {
        +fly()
        +eat()
        +makeSound()
        +behaviour()
    }

    class Bear {
        +walk()
        +eat()
        +makeSound()
        +behaviour()
    }

    class Fish {
        +swim()
        +eat()
        +makeSound()
        +behaviour()
    }

    class Zoo {
        -List~Animal~ animals
        +addAnimal(animal)
        +feedAll()
        +showAllSounds()
        +showAllActions()
    }

    class Flyable {
        <<interface>>
        +fly()
    }

    class Walkable {
        <<interface>>
        +walk()
    }

    class Swimmable {
        <<interface>>
        +swim()
    }

    Animal <|-- Bird
    Animal <|-- Bear
    Animal <|-- Fish

    Bird ..|> Flyable
    Bear ..|> Walkable
    Fish ..|> Swimmable

    Zoo --> Animal
