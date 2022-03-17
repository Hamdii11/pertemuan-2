//Terdapat cara kedua untuk menulis fungsi di Kotlin agar kode program menjadi lebih ringkas,
//jika terdapat kondisi yang bisa menghilangkan 1) return statement; 2) blok program; 3) return
//type secara bersamaan.
//Contoh :

fun main(args: Array<String>) {
    println("Max value from max function = ${max(4,7)}")
    println("Max value from newMax function = ${newMax(3,5)}")
}
fun max(a: Int, b:Int): Int {
    val maxValue = if(a > b) a else b
    return maxValue
}
fun newMax(a: Int, b:Int) : Int = if(a > b) a else b
