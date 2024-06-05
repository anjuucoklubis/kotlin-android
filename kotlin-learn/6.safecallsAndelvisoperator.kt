fun main() {
    // Opsi kedua Anda untuk mengakses properti pada variabel nullable adalah menggunakan operator
    // safecall?.:
    val a: String? = "Kotlin"
    val b: String? = null
    println(b?.length)
    println(a?.length)

    // Elvis Operator
    // Daripada menulis ekspresi if secara lengkap, Anda juga dapat mengekspresikannya dengan
    // operator Elvis ?::
    val l = b?.length ?: -1
    print(l)

}
