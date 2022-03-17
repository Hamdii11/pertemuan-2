//Penanganan eksepsi adalah bagian penting dari bahasa pemrograman. Teknik ini menghalangi
//aplikasi kita memberikan output yang salah saat runtime. Penggunaan eksepsi di Kotlin sama
//seperti di Java. Semua eksepsi adalah turunan dari kelas “Throwable”. Berikut adalah contoh
//kode program penanganan eksepsi:
fun main(args: Array<String>) {
    try {
        val myVar:Int = 10;
        val v:String = "Rekayasa Perangkat Lunak";
        v.toInt();
    } catch(e:Exception) {
        e.printStackTrace()
    } finally {
        println("Exception Handeling in Kotlin");
    }
}