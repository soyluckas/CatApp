fun main() {
    val cat = Cat("Whiskers", 3, 10)
    println(cat)
    cat.walk(2)
    cat.eat(5)
    cat.eat(10) // Should trigger error
    println(cat)
}