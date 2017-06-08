package lookat

fun lookAtWhen() {

    val list = listOf<String>("c", "b", "a")

    val f = "f"
    var i = 1

    when {
        "a" in list -> println("a in list")

        i in 1..9 -> "Digit"

        "e" !in list -> println("e isn't in list")

        f is String -> println("f is a String")

        f in list -> println("$f in list")

        else -> println("else")
    }

}


fun main(args: Array<String>) {
    lookAtWhen()
}