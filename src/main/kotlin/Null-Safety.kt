//Kotlin tidak mengizinkan pemberian nilai null secara tidak sah. Untuk dapat memberikan nilai
//null pada suatu variabel dapat dilakukan dengan cara menambahkan tanda ? diakhir tipe data.
//Berikut contoh pemberian nilai null yang diizinkan:

fun main(args: Array<String>){
    //Nullable types
    var maybeNumber: Int? = 15
    maybeNumber = null
    println("maybeNumber: $maybeNumber ${maybeNumber?.hashCode()}")
}
