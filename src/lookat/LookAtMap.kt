package lookat












fun main(args: Array<String>) {
    val digits = HashMap<String, Int>()

    digits.put("One", 1)
    digits.put("Two", 2)
    digits.put("Three", 3)
    digits["Four"] = 4

    for ((k, v) in digits) {
        println("$k -> $v")
    }



    // immutable map
    val digits2 = mapOf("One" to 1, "Two" to 2, "Three" to 3)

}