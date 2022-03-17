fun main() {
    val number = listOf("one", "two", "three", "four")
    println("Number of elements : ${number.size}")
    println("Third elements : ${number.get(2)}")
    println("Fourth elements : ${number[3]}")
    println("Index of elements \"two\" ${number.indexOf("two")}")

    //list elements (including nulls) can duplicate
    val bob = Person("Bob", 31)
    val people = listOf<Person>(Person("Adam", 20), bob, bob)
    val people2 = listOf<Person>(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

}

class Person(var name: String,var age: Int){}