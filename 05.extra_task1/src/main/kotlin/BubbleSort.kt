import java.math.*

fun CreateAndBubbleSort() {
    var array: Array<Int> = CreateRandomArray()
    print("Array: ")
    PrintArray(array)
    print("Sorted (bubble sort): ")
    val begin = System.nanoTime()
    val iter_count = BubbleSort(array)
    val end = System.nanoTime()
    PrintArray(array)
    println("Function BubbleSort took ${end-begin} nanoseconds. Number of iterations: ${iter_count}")
}

fun BubbleSort(array: Array<Int>): Int {
    var iter = 0
    val size = array.size
    for (i in 1 .. size) {
        for (j in 0 .. size-i-1) {
            if (array[j] > array[j+1]) {
                array[j] = array[j+1].also {array[j+1] = array[j]}
            }
            iter++
        }
    }
    return iter
}