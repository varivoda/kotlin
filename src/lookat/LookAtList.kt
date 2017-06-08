package lookat







fun main(args: Array<String>) {
    val list = listOf<String>("c", "b", "a")

    var filter = list.filter { s -> s > "a" }

    filter = list.filter { it > "a" }

    for (s in filter) {
        println("list contains $s")
    }
}