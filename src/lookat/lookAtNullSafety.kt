package lookat

fun main(args: Array<String>) {

    var par: Int?
    par = null


    par?.let {
        println("par is not null")
    }



    println(getIntFromStr(0)?.minus(12) ?: throw Exception());

}


fun getIntFromStr(any: Any): Int? {

    when {
        any is String -> return any.toInt()
        else -> return null
    }
}