fun main() {
    // ============================================================================
    // ============================================================================
    // TRANSFORMATIONS (Mengubah element menggunakan MAP)

    val numbers = setOf(1, 2, 3)
    println(numbers.map { it * 3 })
    println(numbers.mapIndexed { idx, value -> value * idx })

    // TRANSFORMATIONS (Mengubah element menggunakan MAP)
    val numberss = setOf(1, 2, 3)
    println(numberss.mapNotNull { if (it == 3) null else it * 3 })
    println(numberss.mapIndexedNotNull { idx, value -> if (idx == 0) null else value * idx })

    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })

    // ============================================================================
    // ============================================================================
    // FILTER
    val numberFilter = listOf("one", "two", "three", "four")
    val longerThan3 = numberFilter.filter { it.length > 3 }
    println(longerThan3)

    val numbersFilterMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key11" to 11)
    val filteredMap = numbersFilterMap.filter { (key, value) -> key.endsWith("1") && value > 10 }
    println(filteredMap)
}
