fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)

    binnie.walk(100)
    clyde.walk()
    binnie.eat(5)
    clyde.eat(18)

    println(binnie)
    println(clyde)
}