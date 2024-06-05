//nullaable types bisa digunakan dengan menambahkan tanda tanya (?) dibelakang atau setelah typedata
fun main() {
    // Value B = not null
    val b: String? = "Kotlin"
    if (b != null && b.length > 0) {
        print("String of length ${b.length}")
    } else {
        println("Empty string")
    }

    // Value A = null
    val a: String? = null
    if (a != null && a.length > 0) {
        print("String of length ${a.length}")
    } else {
        println("Empty string")
    }
}


