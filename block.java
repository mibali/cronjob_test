data class MyClass(
    var field1: Int,
    var field2: Int
)

class AnotherClass {
    fun computeField() {
        val instance = MyClass(5,3)
        val computationResult = instance.field1 * 10  // Compute the field1 value with 10
        println(computationResult)
    }
}

fun main() {
    AnotherClass().computeField()
}
