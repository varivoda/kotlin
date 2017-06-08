package lookat

fun main(args: Array<String>) {

    //    Типа удобно форматировать строки
    var name : String = "Ivan"
    println("Hello $name \n now is  ${System.currentTimeMillis()}")


    "camelCaseExample".camelCaseConvertToSentence()
}

fun String.camelCaseConvertToSentence(): String {
    // some logic
    return ""
}