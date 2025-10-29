data class Student(
    val id: String,
    val name: String,
    val course: String,
    var mark: Double
) {
    fun getGrade(): String = when (mark) {
        in 70.0..100.0 -> "First"
        in 60.0..69.999 -> "2/1"
        in 50.0..59.999 -> "2/2"
        in 40.0..49.999 -> "Third"
        else -> "Fail"
    }

    fun didPass(): Boolean = mark >= 40.0

    override fun toString(): String =
        "Student(name=$name, course=$course, mark=$mark)"
}