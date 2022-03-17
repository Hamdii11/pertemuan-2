//Ranges adalah karakteristik unik dari Kotlin. Seperti python, ranges menyediakan sebuah
//operator yang dapat membantu kita dalam membuat sebuah deretan angka melalui suatu iterasi.
//Contoh kode program:
fun main(args: Array<String>) {
    //Ranges
    val i:Int = 2
    for (j in 1..4)
        print(j) // prints "1234"
    println()
    if (i in 1..10) { // equivalent of 1 <= i && i <= 10
        println("we found your number --"+i)
    }
}
