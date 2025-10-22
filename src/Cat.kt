class Cat(val name: String, var age: Int, initialWeight: Int) {
    var weight: Int = initialWeight
        set(value) {
            if (value in 0..20) field = value
            else println("ERROR: Weight must be between 0 and 20")
        }

    fun walk(distance: Int) {
        weight -= distance
        println("$name walked $distance meters.")
    }

    fun eat(amount: Int) {
        weight += amount
        println("$name ate and now weighs $weight kg.")
    }

    override fun toString(): String {
        return "Name: $name Age: $age Weight: $weight"
    }
}