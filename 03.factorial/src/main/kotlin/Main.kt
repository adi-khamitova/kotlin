fun main(args: Array<String>) {
    val n: Int = readLine()!!.toInt()
    if ((n <= 0) or (n > 20)) println("n/a")
    else {
        println(factorail_recursion(n))
        println(factorail_loop(n))
    }
}

fun factorail_recursion(n: Int): Long {
    if (n < 2) {
        return 1
    }
    return n*factorail_recursion(n-1)
}

fun factorail_loop(n: Int): Long {
    var res: Long = 1
    for (i in 1..n) {
        res = res*i
    }
    return res
}