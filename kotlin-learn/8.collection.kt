// Collection Implement : SET, LIST, MAP
// Collection Types : Immutable (Read Only), Mutable (Can Edit : Add, Delete, Edit, Read)
// Collection Purpose : Simpan & Manupulas & Menyimpan banyak data di satu tempat

fun main() {

    // ============================================================================
    // ============================================================================
    // LIST
    val listNumberImmutable = listOf(1, 2, 3, 4, 5)
    println(listNumberImmutable.size)
    println(listNumberImmutable.get(0))
    println(listNumberImmutable[0])
    println(listNumberImmutable.indexOf(1))
    println(listNumberImmutable)

    val listStringImmutable = listOf("Anju", "Lubis", "Kotlin")
    println(listStringImmutable.size)
    println(listStringImmutable.get(0))
    println(listStringImmutable[0])
    println(listStringImmutable.indexOf("Anju"))
    println(listStringImmutable)

    val numbers = mutableListOf("one", "two", "three", "four")
    numbers.add("five")
    numbers.remove("one")
    numbers[0] = "5"
    numbers.shuffle()
    println(numbers)

    // ============================================================================
    // ============================================================================
    // SET

    val numbersSetImmutable = setOf(1, 2, 3, 4, 5)
    println(numbersSetImmutable)
    println(numbersSetImmutable.size)
    println(numbersSetImmutable.indexOf(1))

    val stringSetImmutable = setOf("Anju", "Lubis", "Kotlin")
    println(stringSetImmutable.size)
    println(stringSetImmutable.indexOf("Anju"))
    println(stringSetImmutable)

    val stringSetMutable = mutableSetOf("one", "two", "three", "four")
    stringSetMutable.add("five")
    stringSetMutable.remove("one")
    println(stringSetMutable)

    val numberSetMutable = mutableSetOf(1, 2, 3, 4, 5)
    numberSetMutable.add(6)
    numberSetMutable.remove(1)
    println(numberSetMutable)

    // ============================================================================
    // ============================================================================
    // MAP

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
    println(numbersMap)
    println(numbersMap.keys)
    println(numbersMap.values)
    println(numbersMap.size)
}
