//While dan do-while loop di Kotlin sama penggunaannya dengan bahasa pemrograman Java
fun main(args: Array<String>) {
    //While Loop
    var x:Int = 0
    println("Example of While Loop--")
    while(x <= 10) {
        print("$x ")
        x++
    }
    print('\n')
    //Do-While Loop
    var y:Int = 0
    do {
        y = y + 10
        println("I am inside Do block---" +y)
    } while(y <= 50)
}
