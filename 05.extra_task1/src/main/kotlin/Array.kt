import java.util.*

fun CreateRandomArray(): Array<Int> {
    val size = (10 .. 15).random()
    var array = Array<Int>(size, {(-50 .. 50).random()})
    return array
}

fun InputArray(): Array<Int> {
    print("Enter the number of elements: ")
    val size = readln().toInt()
    print("Enter the elements: ")
    val input = Scanner(System.`in`)
    var array = Array<Int>(size, {input.nextInt()})
    return array
}

fun PrintArray(array: Array<Int>) {
    for (i in 0 .. array.size-1) {
        if (i != 0) print(" ")
        print(array[i])
    }
    println()
}