class Cat(val name: String, var age: Int, var weight: Int) {

    // Updated walk() with a parameter
    fun walk(distance: Int = 10) {
        println("$name is walking for $distance meters.")
        val weightLoss = distance / 50
        weight -= weightLoss
        if (weight < 1) weight = 1  // Prevents negative or zero weight
    }

    // Added eat() method with error handling
    fun eat(foodWeight: Int) {
        if (weight + foodWeight > 20) {
            println("⚠️ Error: $name cannot weigh more than 20. Current weight: $weight.")
        } else {
            weight += foodWeight
            println("$name eats and now weighs $weight.")
        }
    }

    override fun toString(): String {
        return "Name: $name, Age: $age, Weight: $weight"
    }
}