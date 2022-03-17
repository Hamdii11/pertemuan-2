fun main() {
    //Set<T> stores unique elements; their order is generally undefined
    val numbers = setOf(1,2,3,4)
    println("Number of elements : ${numbers.size}")
    if (numbers.contains(1)) println("1 is in the set")

    val numbersBackwards = setOf(4, 3, 2, 1)
    println("the sets are equal: ${numbers == numbersBackwards}")
    //The default implementation of set - linkedHashset - preserves the order of elements insertion
    println(numbers.first() == numbersBackwards.first())
    println(numbers.first() == numbersBackwards.first())

    val string = hashSetOf("a", "b", "c", "c") //hash set value unik

    println("My set values are"+string)
}