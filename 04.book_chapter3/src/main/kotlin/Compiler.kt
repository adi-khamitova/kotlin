fun main(args: Array<String>) {
    println("1.")
    doSomething("hello world!", 4)

    println("2.")
    println("x = 5, y = "+ timesThree(5))

    println("3.")
    val x = arrayOf(34, 56, 8, -8, 0, -56, -10, 8)
    println("max: " + maxValue(x))
}

fun doSomething(msg: String, i: Int): Unit {
    if (i > 0) {
        var x = 0
        while (x < i) {
            println(msg)
            x = x + 1
        }
    }
}

fun timesThree(x: Int): Int {
    val y = x * 3
    return y
}

fun maxValue(args: Array<Int>): Int {
    var max = args[0]
    var x = 1
    while (x < args.size) {
        var item = args[x]
        max = if (max >= item) max else item
        x=x+1
    }
    return max
}
