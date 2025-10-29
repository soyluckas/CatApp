fun main() {
    println("== StudentApp ==")
    println("Type 'quit' for the name to exit.")

    while (true) {
        print("Enter student name: ")
        val name = readLine() ?: ""
        if (name.lowercase() == "quit") break

        print("Enter student ID: ")
        val id = readLine() ?: ""

        print("Enter student course: ")
        val course = readLine() ?: ""

        var mark = 0.0
        while (true) {
            print("Enter student mark (0-100): ")
            val input = readLine()?.toDoubleOrNull()
            if (input != null && input in 0.0..100.0) {
                mark = input
                break
            }
            println("Please enter a valid number between 0 and 100.")
        }

        val s = Student(id = id, name = name, course = course, mark = mark)

        // Print student's status
        println("\n--- Student Status ---")
        println("Mark: ${s.mark}")
        println("Grade: ${s.getGrade()}")
        println("Passed: ${if (s.didPass()) "Yes" else "No"}")

        println("\nCreated -> $s\n")
    }
}