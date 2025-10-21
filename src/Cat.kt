class Cat(val name: String, var age: Int, var weight: Int) {

    // Updated walk() method with distance parameter
    fun walk(distance: Int = 10) {
        println("$name is walking for $distance meters.")
        val weightLoss = distance / 50
        weight -= weightLoss
        if (weight < 1) weight = 1 // Prevents weight dropping too low
    }

    // ✅ Modified eat() method with 'amount' parameter
    fun eat(amount: Int) {
        if (weight + amount > 20) {
            println("⚠️ Error: $name cannot weigh more than 20. Current weight: $weight.")
        } else {
            weight += amount
            println("$name eats $amount units of food and now weighs $weight.")
        }
    }

    override fun toString(): String {
        return "Name: $name, Age: $age, Weight: $weight"
    }
}