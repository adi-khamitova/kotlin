fun main (args: Array<String>) {
    println("First")
    first()
    println()
    println("Second")
    second()
    println()
    println("Third")
    third()
    println()
}

fun first() {
    var x = 1
    while (x < 10) {
        x = x + 1
        if (x > 3) {
            println("big x")
        }
    }
}

fun second() {
    var x = 10
    while (x > 1) {
        x = x - 1
        if (x < 3) println("small x")
    }
}

fun third() {
    var x = 10
    while (x > 1) {
        x = x - 1
        println(if (x < 3) ("small x") else ("big x"))
    }
}