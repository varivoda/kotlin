package lookat
















fun main(args: Array<String>) {
    println("Step 1")

    for (i in 1..10) {
        println(i)
    }

    println("Step 3")
    for (i in 1..10 step 3) {
        println(i)
    }

    println("Step -3")
    for (i in 1..10 step 3) {
        println(i)
    }
}