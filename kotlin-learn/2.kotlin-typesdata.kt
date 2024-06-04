fun main() {

    // Char
    var typechar: Char = 'A' // Pake petik 1 ' ' , Hanya 1 karakter
    println(typechar)

    // String
    var typestring: String = "Anju" // Pake petik 2 " ", lebih dari 1 karakter
    println(typestring) 

    // Boolean
    var typeboolean: Boolean = true // true or false
    println(typeboolean)

    // Number
    var typeNumberByte: Byte = 100 // -128 to 127
    var typeNumberDouble: Double = 5.99
    var typeNumberInt: Int = 50 // -2147483648 to 2147483647
    var typeNumberShort: Short = 5000 // -32768 to 32767
    var typeNumberLong: Long = 15000000000L // -9223372036854775807 to 9223372036854775807
    var typeNumberFloat: Float = 5.75F // 9.99 or 3.14515.

    println(typeNumberByte)
    println(typeNumberDouble)
    println(typeNumberInt)
    println(typeNumberShort)
    println(typeNumberLong)
    println(typeNumberFloat)

    // Arrays
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars)
    println(cars.size) // length/size
    println(cars[0]) // Indexing value 0

    cars[0] = "Opel" // Change value 0
    println(cars[0])

    if ("Volvo" in cars) { // check value dengan if /else
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) { // lopping value
        println(x)
    }
}
