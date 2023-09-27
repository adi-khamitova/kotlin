fun main() {
    val x = 5
    var res: Long = 1
    for (i in 1 .. x) {
        res *= i
    }
    println(res)
}